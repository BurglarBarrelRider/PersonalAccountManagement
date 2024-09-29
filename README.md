# PersonalAccountManagement

1. TransactionType Enum:
Create an enum called TransactionType with the following constants:

DEPOSIT: Represents a deposit transaction.

WITHDRAWAL: Represents a withdrawal transaction.

2. Amount Class:
Create a separate Java class called Amount to represent a transaction amount. This class should include:

amount (double): The transaction amount.

transactionType (TransactionType): An enum value indicating the type of transaction (DEPOSIT or WITHDRAWAL).

3. PersonalAccount Class
:
Create a Java class called PersonalAccount that represents a personal bank account.
Define the following instance variables:

accountNumber (int): A unique identifier for the account.

accountHolder (String): The name of the account holder.

balance (double): The current balance in the account.

transactions (an array of Amount objects): An array to store deposit and withdrawal transactions.


4. Methods for PersonalAccount Class:
Implement the following methods within the PersonalAccount class:

PersonalAccount(int accountNumber, String accountHolder):

A constructor to initialize the accountNumber, accountHolder, and set the initial balance to 0.0.
void deposit(double amount):

A method to deposit money into the account. This method should create an Amount object with the DEPOSIT type, add the transaction to the transactions array, and update the balance.
void withdraw(double amount):

A method to withdraw money from the account. This method should create an Amount object with the WITHDRAWAL type, add the transaction to the transactions array, and update the balance. Ensure that the withdrawal amount does not exceed the current balance.
void printTransactionHistory():

A method to print the transaction history of the account. Iterate through the transactions array and display each transaction, including the transactionType and amount.
double getBalance():

A method to retrieve the current balance of the account.
int getAccountNumber():

A method to retrieve the account number.
String getAccountHolder():

A method to retrieve the account holder's name.
5. UML Class Diagram:
Prepare a UML class diagram for both the PersonalAccount and Amount classes. Ensure that the diagram includes the class names, attributes, methods, and relationships between the classes (including the use of the TransactionType enum).
6. Sample Usage:
Create an instance of the PersonalAccount class and demonstrate its functionality by depositing and withdrawing money, checking the balance, and printing the transaction history.
7. Documentation:
Include appropriate comments and Javadoc-style documentation for your classes and methods to explain their purpose and usage.
8. Testing:
Create test cases to ensure that your PersonalAccount class functions correctly under different scenarios, including depositing, withdrawing, and checking balances.
9. GitHub Repository:
Create a GitHub repository for your project and commit your code to it. Include a README.md file in your repository that provides an overview of your project, instructions on how to compile and run your code, and any other relevant information.
10. Submission:
Provide your GitHub repository link.
11. Evaluation Criteria:
Your project will be evaluated based on the correctness and completeness of your implementation.

Proper usage of Java classes, objects, enum, and encapsulation.

Code organization, readability, and adherence to Java naming conventions.

Demonstration of version control using GitHub.

Clear and concise documentation.

Accurate UML class diagram representing the structure and relationships of the PersonalAccount and Amount classes.

