# BrainBuzz - Java Console Quiz App

A robust command-line application that allows users to take a quiz on Java fundamentals. 

## 🎯 Project Goals
I built this project to deepen my understanding of Java's core mechanics, specifically:
* **Object-Oriented Design:** Separating data (`Question.java`) from logic (`QuestionService.java`).
* **Arrays & Loops:** Managing collections of objects without using advanced lists.
* **Console I/O:** Handling user input via `Scanner` and dynamic output.

## ⚙️ How It Works
The application is structured into three main parts:
1.  **Main Class:** The entry point that orchestrates the application flow.
2.  **Question Service:** Handles the business logic, including creating questions, displaying them, and calculating the final score.
3.  **Question Model:** A POJO (Plain Old Java Object) representing the structure of a single question.

## 📸 Demo
Here is an example of the application running in the console:

```text
---------------------------
Question No: 1
What is the capital of France?
Berlin
Madrid
Paris
Rome
Paris
---------------------------
Question No: 2
Which planet is known as the Red Planet?
Earth
Mars
Jupiter
Saturn
Mars
---------------------------
Question No: 3
Who wrote 'To Kill a Mockingbird'?
Harper Lee
Mark Twain
Ernest Hemingway
F. Scott Fitzgerald
Mark Twain 
---------------------------
Question No: 4
What is the largest ocean on Earth?
Atlantic Ocean
Indian Ocean
Arctic Ocean
Pacific Ocean
Pacific Ocean
---------------------------
Question No: 5
What is the chemical symbol for Gold?
Au
Ag
Gd
Go
Au
You selected: Paris
You selected: Mars
You selected: Mark Twain
You selected: Pacific Ocean
You selected: Au
Your total score is: 40 out of 50

