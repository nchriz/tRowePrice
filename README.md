# T.Rowe Price SDET Screening

Project using Maven Building Tool.
Java 8 is used. 
Only dependency is JUnit v. 4.12.

## Assumptions 
1. Apostrophe: a word is not split by apostrophe
2. Numbers: should be treated as words
3. Special characters: should not bind word together
4. If empty sentence is given, return empty string and value zero

### Return value

Stated in the task, return should be string and length of string. There are multiple solution for this
1. Return only the string as length is connected to string <- not as task stated
2. Return javafx.util.Pair with String and Integer
3. Return own created model that hold String and Value
4. Return Array of String, size 2. Convert Integer to String.

To minimize imports I choose to create my own Pair model and use for return.

## Run

As project using Maven, to test locally you need to have Maven installed on your machine.
#### Terminal:

1. Open your favourite terminal
2. Navigate to root folder of project
3. Run 'mvn test'

#### Intellij:

1. Open project in Intellij
2. Open package src -> test -> java
3. Right click on SentenceTest and choose 'Run SentenceTest'