
package com.smartbear.time;

import java.util.Map;
import java.util.Objects;

import com.smartbear.time.util.Constants;
import com.smartbear.time.util.TimeValidator;

public class SpokenTimeConversionContext {
	private final Map<String, ITimeConverterStrategy> strategyMap;

	public SpokenTimeConversionContext() {
		strategyMap = Map.of(Constants.Country.UK, new BritishTimeConverterStrategy(), Constants.Country.USA,
				new USTimeConverterStrategy(), Constants.Country.INDIA, new IndianTimeConverterStrategy());
	}

	public String convert(String countryCode, String spokenTime, String timeFormat) {

		if (Objects.isNull(countryCode) || Objects.isNull(spokenTime))
			return Constants.ErrorMessages.INVALID_INPUT;

		ITimeConverterStrategy spokenTimeConverter = strategyMap.get(countryCode.toUpperCase());

		if (Objects.isNull(spokenTimeConverter))
			return "We will serve for this country sooner !!";

		return switch (timeFormat) {
		case Constants.SpokenTimeFormat.TWENTY_FOUR_HOUR -> {
			
			if(TimeValidator.isValid24HourTime(spokenTime))
				yield spokenTimeConverter.toSpokenTime24HourFormat(spokenTime);
			yield Constants.ErrorMessages.INVALID_SPOKEN_TIME;
			
		}
		default -> "UnSupported Format : " + timeFormat;

		};

	}
}
