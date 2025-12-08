# Password Validator – Java Maven Project

## Goal & Submission
This project implements a complete password validation library developed in a GitHub-hosted Maven project.  
The final submission meets the following requirements:

- A **robust password validation utility** enforcing the defined password policy.
- **Test-driven development (TDD)** using **JUnit 5**, with meaningful test coverage.
- Buildable **locally via Terminal** and **inside IntelliJ IDEA**.
- **Automated testing via GitHub Actions** (CI : Continuous Integration).
- A helpful README
---

## Password Policy
All passwords validated by this project must comply with the following rules:

Must-have criteria (baseline):

- Minimum 8 characters.
- At least one digit (0–9).
- Both uppercase and lowercase letters.
- Not in a list of common/weak passwords.
- At least one special character (define allowed set).

Optional (bonus policy):

- Minimum number of distinct character groups (e.g., 3 of 4: upper, lower, digit, special).
- Line from MAIN branch