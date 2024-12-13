# Quiz Application API

This application provides a set of REST APIs to create a simple quiz experience. 
## Features

- Start a new quiz session for a user.
- Fetch random questions from the database.
- Submit answers to questions and receive immediate feedback on correctness.
- Retrieve statistics of the quiz session, including the number of correct and incorrect answers.

## Technologies Used

- **Java**: The primary programming language.
- **Spring Boot**: Framework for building the application.
- **Hibernate**: ORM framework for database interactions.
- **H2 Database**: In-memory database for development and testing.
- **RESTful API**: Enables communication with the application.

### Prerequisites

- JDK 17 or higher
- Maven (for dependency management)

## To Start the Application
Run `QuizApplication` file.

Path: src>main>java>com.quiz.Quiz_Application>QuizApplication
## Endpoints

### POST `/api/quiz/start`
Starts a new quiz session for a user.
- **Parameters**: `userId` (required)
- **Response**: Returns a new `QuizSession` object.

### GET `/api/quiz/question`
Fetches a random question.
- **Parameters**: `sessionId` (required)
- **Response**: Returns a `Question` object.

### POST `/api/quiz/answer`
Submits an answer to a question.
- **Parameters**: `sessionId`, `questionId`, `answer` (all required)
- **Response**: Returns whether the answer was correct.

### GET `/api/quiz/stats`
Fetches the session stats including individual question results.
- **Parameters**: `sessionId` (required)
- **Response**: Returns correct and incorrect answer counts along with details for each question answered.

## Assumptions
- Only one user is seeded in the database.
- Questions are pre-seeded in the database.
- No authentication/authorization is implemented.
- H2 database is used for simplicity.
