# British Spoken Time Converter

This project converts a given 24-hour format time (e.g., `06:25`) into its **British spoken form** (e.g., `"twenty five past six"`).

---

## Features

- Handles spoken time expressions like:
  - `00:00` → `midnight`
  - `12:00` → `noon`
  - `06:25` → `twenty five past six`
  - `11:45` → `quarter to twelve`
- Uses Java 17 `switch` expression for clarity
- Follows clean architecture:
  - Interface-driven (`ITimeConverter`)
  - uses Strategy design pattern for supporting multiple countries
  - Constants separated
  - Testable design
- Includes unit tests using **JUnit 5**
- Generates code coverage reports via **JaCoCo**

---

## Project Structure

```
SpokenTime/
├── src/
│   ├── main/
│   │   └── java/com/smartbear
			└──/time/
				├── ITimeConverterStrategy.java             	# Interface
│   │       		├── BritishTimeConverterStrategy.java       	# Logic implementation
				├──	SpokenTimeConversionContext.java			# dynamically chooses a time-conversion strategy based on the provided country 																  code
				└──/app/
					├── BritishSpokenTimeApp.java      # CLI runner
│   │             └──/util/   
│   │       			└── Constants.java                 # Hour name map and other constants
					├── NumberToWordConverter.java     # utility class	
│   └── test/
│       └── java/com/example/time/
│           └── BritishTimeConverterStrategyTest.java         # Unit tests
├── pom.xml                                                   # Maven configuration
```

---

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+

---

### Build & Run the App

``` IDE
### If you are using any IDE such as Eclipse or Intellij : just import the project as maven project after checkout and use the IDE 
### to build and run using maven

 
```bash
# Compile
mvn clean compile

# Run
mvn exec:java -Dexec.mainClass="com.smartbear.time.app.BritishSpokenTimeApp"
```

When prompted, enter a time in `HH:mm` format (24-hour), e.g.:

```text
Please Enter one Country Code from this (UK) : UK
Enter the spoken time format from this (24H) : 24H
Enter time in 24-hour format (HH:mm) e.g: (23:59) : 06:25
British Spoken Time: twenty five past six
```

---

## Running Tests

```bash
mvn test
```

Test class used:  
️`BritishTimeConverterStrategyTest.java`
`SpokenTimeConversionContextTest.java`

Framework:  
️ JUnit 5

---

## Code Coverage with JaCoCo

JaCoCo is already integrated in `pom.xml`. To generate the report:

```bash
mvn clean verify
```

This runs all tests and generates a coverage report.

### View the Report

Open this file in your browser:

```
target/site/jacoco/index.html
```

You’ll see method/line/class coverage for the whole codebase.

---

## Example Inputs and Outputs

| Input Time | Spoken Output           |
|------------|--------------------------|
| `00:00`    | midnight                 |
| `06:00`    | six o'clock              |
| `06:25`    | twenty five past six     |
| `07:45`    | quarter to eight         |
| `12:00`    | noon                     |
| `15:30`    | half past three          |

---

## Technologies Used

- Java 17
- Maven
- JUnit 5
- JaCoCo (v0.8.11)

---

## Future Enhancements

- Add support for AM/PM + 12-hour format
- Add multilingual support (Hindi, French, etc.)
- REST API version using Spring Boot

---

## Author

**Siddhartha Kumar**

> Contributions welcome. PRs and issues encouraged!

---

## License

This project is licensed under the MIT License.
