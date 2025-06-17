# REST Assured API Testing Framework

This project demonstrates a scalable and extensible approach to REST API testing using **Java**, **REST Assured**, and **JUnit 5**.  
It is designed as a professional-grade foundation for automated testing in modern QA teams, with future support for CI/CD pipelines and database-backed validations.

---

## 🧠 Project Purpose

The goal of this project is to:

- Showcase proficiency in automated API testing using industry-standard tools
- Provide reliable test coverage for public or internal APIs (currently using `https://reqres.in`)
- Create a structure suitable for regression testing, CI integration (e.g., Jenkins, GitHub Actions), and database assertions

---

## 🧪 Test Coverage (Current & Planned)

| Test Type               | Description                                             | Status       |
|-------------------------|---------------------------------------------------------|--------------|
| ✅ Positive Testing      | Valid requests return correct responses                | ✔️ Implemented |
| ✅ Negative Testing      | Invalid requests handled gracefully                    | ⏳ Planned     |
| ✅ Status & Headers      | Verifying status codes and HTTP headers                | ⏳ Planned     |
| ✅ Response Body Checks  | Validate data structure and expected values            | ✔️ Implemented |
| ✅ Authentication Tests  | Token or Basic Auth validation                         | ⏳ Planned     |
| ✅ JSON Schema Validation| Contract-based structure validation                    | ⏳ Planned     |
| ✅ Database Validation   | Validate DB state before/after API call (via JDBC)     | ⏳ Planned     |
| ✅ CI/CD Integration     | Run tests via GitHub Actions or Jenkins                | ⏳ Planned     |

---

## ⚙️ Tech Stack

- Java 17
- Maven
- REST Assured 5.3.1
- JUnit 5
- Hamcrest Matchers
- Planned: JDBC/MySQL, GitHub Actions, Allure Reports

---

## ▶️ How to Run the Tests

### Prerequisites:
- Java 17+
- Maven 3+

### Clone and run:

```bash
git clone https://github.com/SaidBul94/restassured-api-tests.git
cd restassured-api-tests
mvn test
