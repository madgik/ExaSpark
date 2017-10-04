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

There are some vtable functions in the path **/madgik/mySpark/vtFunctions** so as to test the application or write your own based on them.

```sh
$ SELECT * FROM FOO(',','/pathOfFile.txt')
$ SELECT * FROM BOO(',',(SELECT * FROM FOO(',','/pathOfFile.txt')))
```

### Built-in virtual table functions

**Apachelogsplit**

Breaks a single apache log row into multiple fields.

```sh
$ select * from apachelogsplit('/path/of/access_log')
```

**Sample**

Returns a random sample_size set of rows.

```sh
$ select * from sample(HowMany,(select * from apachelogsplit('/path/of/access_log')))
```

### New feautures
- Improved console (auto-complete, command history, new design)
- ReservedWords.txt file contains reserved-sql words for auto-complete method
- "show virtual tables" command has been included
- ExaremeSparkSession (extension of SparkSession) has been included, so as to support sql queries with virtual tables without console

### Upcoming features

- Show execution time of query
- Help command on console

