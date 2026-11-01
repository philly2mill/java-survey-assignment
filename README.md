# Java Survey Assignment

## Overview
This Java Swing program asks three multiple-choice questions and
displays the number of correct and incorrect answers.

## Assignment Problem
The original final results showed how many answers were wrong,
but did not identify which questions were answered incorrectly.

## Solution
I added an `incorrectQuestions` string to store missed question
numbers. When an answer is wrong, the program adds `x + 1` to
the string because Java array indexes start at zero.

The final popup displays the score and the missed question numbers.
If all answers are correct, it displays "Incorrect questions: None."

The program also accepts lowercase answers, validates input,
and exits when the user selects Cancel.

## How to Run
1. Open the project in VS Code with Java support installed.
2. Open `Survey.java`.
3. Click Run above the main method.
4. Answer each question by entering A, B, or C.

## Test Examples
The answer key is C, C, B.

| Answers Entered | Correct | Incorrect | Missed Questions |
|---|---|---|---|
| A, C, A | 1 | 2 | 1, 3 |
| C, C, B | 3 | 0 | None |
| A, A, A | 0 | 3 | 1, 2, 3 |

