# QA Automation Framework

## Overview
A Java unit testing project built while transitioning from manual QA/BA
into test automation. Covers core testing concepts — unit tests,
edge cases, and dependency mocking — applied to a small set of
business logic classes.

## Stack
- **JUnit 5** — industry-standard testing framework in Java
- **AssertJ** — fluent, more readable assertions than plain `assertEquals`
- **Mockito** — mocking dependencies to isolate the class under test

## Test structure
- `ProductTest` — basic getter/setter behavior verification
- `FreelancerTest` — covers the happy path (hourlyRate × hours) and an
  edge case (zero hours), to confirm the calculation logic holds at
  its boundary
- `EmployeeTest` — verifies fixed-salary payment calculation
- `PayrollServiceTest` — uses a Mockito mock for `NotificationService`
  to verify that `PayrollService` triggers a notification after
  processing payment, without depending on a real notification
  implementation

## How to run
mvn test

or in IntelliJ: right-click `src/test/java` → Run All Tests