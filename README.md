# Exareme Spark

Exareme Spark is an extension of Apache Spark, which supports virtual tables. Furthermore, user-defined functions and user-defined aggregate functions are supported already from Apache Spark. 

### How to register a virtual table

  - Create a Java class with the name of the desired virtual table
  - The constructor of this class should have the same arguments as the virtual table 
  - This java class should contain a mapReduce function, where users write the code for the functionality of the virtual table, create a view or table (better to be temporary) and then return its name.  


Finally:
  - This java class should be placed to madgik/mySpark/vtFunctions

### How to run the application on terminal

- mvn clean compile assembly:single, use this command so as to compile the maven project
- A  jar file would be produced
- Run the .jar with the java -jar NameOfJar.jar
- A console should appear, so as to write sql queries

### How to write a sql query with virtual table

**Example**

There are some vtables functions in the path **/madgik/mySpark/vtFunctions** so as to test the application or write your own based on them.

```sh
$ SELECT * FROM FOO(',','/pathOfFile.txt')
$ SELECT * FROM BOO(',',(SELECT * FROM FOO(',','/pathOfFile.txt')))
$ SELECT * FROM DOO(',',(SELECT * FROM KOO(',','/pathOfFile.txt')),(SELECT * FROM BOO(',',(SELECT * FROM FOO(',','/pathOfFile.txt')))))
```

### Upcoming features

- Improve error handling
- Register virtual tables while the app is running
- Impement a built-in java interface, in order to write a virtual table






