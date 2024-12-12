-- Insert Questions
INSERT INTO QUESTION (id, question_text, correct_answer) VALUES
(1, 'What does the acronym OOP stand for?', 'Object-Oriented Programming'),
(2, 'Which of the following is not a programming language?', 'HTML'),
(3, 'What is the time complexity of binary search?', 'O(log n)'),
(4, 'Which programming language is primarily used for Android app development?', 'Java'),
(5, 'What is the main purpose of the `git` version control system?', 'Managing source code'),
(6, 'What does SQL stand for?', 'Structured Query Language'),
(7, 'Which keyword is used to declare a constant in Java?', 'final'),
(8, 'What is the output of `3 + 2 * 5` in most programming languages?', '13'),
(9, 'What is the default port number for HTTP?', '80'),
(10, 'Which data structure uses LIFO (Last In, First Out)?', 'Stack'),
(11, 'What is the result of `10 % 3` in most programming languages?', '1');

-- Insert Options for Each Question
INSERT INTO QUESTION_OPTIONS (question_id, options) VALUES
(1, 'Object-Oriented Programming'), (1, 'Object-Oriented Process'), (1, 'Object-Oriented Principles'), (1, 'Object-Oriented Paradigm'),
(2, 'Python'), (2, 'HTML'), (2, 'Java'), (2, 'C++'),
(3, 'O(n)'), (3, 'O(log n)'), (3, 'O(n log n)'), (3, 'O(1)'),
(4, 'Java'), (4, 'C#'), (4, 'Python'), (4, 'Ruby'),
(5, 'Testing applications'), (5, 'Managing source code'), (5, 'Compiling programs'), (5, 'Debugging software'),
(6, 'Structured Query Language'), (6, 'Sequential Query Language'), (6, 'System Query Language'), (6, 'Standard Query Language'),
(7, 'static'), (7, 'final'), (7, 'const'), (7, 'immutable'),
(8, '25'), (8, '13'), (8, '10'), (8, '15'),
(9, '21'), (9, '25'), (9, '80'), (9, '443'),
(10, 'Queue'), (10, 'Stack'), (10, 'Heap'), (10, 'Array'),
(11, '1'), (11, '2'), (11, '3'), (11, '0');
