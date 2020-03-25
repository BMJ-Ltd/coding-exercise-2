# BMJ Hands-on Java Coding Test

## Requirements 
#### 1. Reverse String
Given a list of words, reverse the order of the letters in each word from the list. You are not allowed to use the StringBuffer or StringBuilder classes.

#### 2. Integer Palindrome
Given a list of integers, filter the list to get palindrome integers. An integer is called palindrome if it is equal to its reverse e.g. 1001 is a palindrome but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234.

#### 3. Comma Separated Integers 
Write a method that returns a comma separated string based on a given list of integers. Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd. For example, if the input list is (3,44), the output should be 'o3,e44'. 

<br/>

#### <i>Where possible, use Java 8 Lambdas and Streams.</i>

#### Environment
Java 8 (64-bit) <br/>
Eclipse / IntelliJ

#### Details

Duration: 30 minutes

If possible, try to have a working program at the end of 30 minutes, even if it does not fully satisfy the requirements.

Please code as you would on a typical piece of project work, as if for a product that will be released in the near future.


----
## Installation
This is a SpringBoot and Gradle Application

Clone the project

The source code can be found in the `src/main/java` directory.


## Running the application

In all cases, the application is available under <http://localhost:8080/>.
   
## IntelliJ / Eclipse

Use the provided tab on the right-hand side to build the application.
To run it, use the bootRun option in the Gradle panel or the Run arrow in
the menu bar.

You can also run this on your terminal
    
    ./gradlew bootrun
    
## Endpoints
    
    http://localhost:8080/reverse
    http://localhost:8080/intpalindrome
    http://localhost:8080/commasep

