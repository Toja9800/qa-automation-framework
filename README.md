# QA Automation Framework

## Overview
[2-3 sentences: unit testing framework in Java, what classes it covers,
purpose of the project — e.g. "first step in learning test automation"]

## Stack
- JUnit 5 — [why, one sentence]
- AssertJ — [why, e.g. comparison to plain assertEquals]
- Mockito — [why, what it's used for in this project]

## Test structure
- `ProductTest` — [what it covers, 1 sentence]
- `FreelancerTest` — [what it covers + mention happy path AND edge case (zero hours),
  and why the edge case matters]
- `EmployeeTest` — [what it covers]
- `PayrollServiceTest` — [what it covers + why a mock instead of a real
  NotificationService — put in your own words what you already explained to me above]

## How to run
mvn test

or in IntelliJ: right-click `src/test/java` → Run All Tests