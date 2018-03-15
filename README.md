# ExaSpark

ExaSpark is an extension of Apache Spark, which supports virtual tables. Furthermore, user-defined functions and user-defined aggregate functions are supported already from Apache Spark. 

### How to register a virtual table

  - Create a Java class with the name of the desired virtual table
  - The constructor of this class should have the same arguments as the virtual table 
  - This java class should contain a mapReduce function, where users write the code for the functionality of the virtual table, create a view or table (better to be temporary) and then return its name.  


Finally:
  - This java class should be placed to madgik/exaSpark/vtFunctions

### How to run the application on terminal

- mvn clean compile assembly:single, use this command so as to compile the maven project
- A  jar file would be produced
- Run the .jar with the java -jar NameOfJar.jar
- A console should appear, so as to write sql queries

### How to write a sql query with virtual table

**Example**

There are some vtable functions in the path **/madgik/exaSpark/vtFunctions** so as to test the application or write your own based on them.

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

### Feautures
- Improved console (auto-complete, command history, new design)
- ReservedWords.txt file contains reserved-sql words for auto-complete method
- "show virtual tables" command has been included
- ExaremeSparkSession (extension of SparkSession) has been included, so as to support sql queries with virtual tables without console

### New Feautures
**Rest api**

Through our REST API a user is able to:
- submit queries

Settings A POST request is used to perform the functionality
- ExaSpark Rest API listens on port 9090 (can be configured from application.properties file
- Declare the Accept request HTTP header to: 
    - application/json (for json responses)
    - text.csv (for csv responses)
- Every request should contain a form with the following value:
    - query : the ExaDSpark query 

**Swagger UI**

Visualization and interactaction with the API’s resources

![screenshot from 2018-03-02 17-42-42](https://user-images.githubusercontent.com/31855993/36907759-14d38c96-1e42-11e8-8995-c14c0353ee56.png)


**Endpoints**

- http://<ip>:9090/query/ : to perform a query
- http://<ip>:9090/swagger-ui.html : to visualize the API's resources

# ExaSpark with Docker

## Docker Installation

Install Docker (on linux) or Docker-toolbox (on Windows/Mac) 
  - [Mac](https://docs.docker.com/mac/step_one/)
  - [Windows](https://docs.docker.com/windows/step_one/)
  - [Linux](https://docs.docker.com/linux/step_one/)  

Linux only: [Use docker without sudo](http://askubuntu.com/a/477554)

## ExaSpark Installation
1. Open a terminal (Docker Quickstart Terminal on Windows/Mac or standard terminal on Linux).
2. Build Exareme image (this may take a few minutes the first time):

  ```bash
  $ docker build -t exaspark:latest .
  ```


## Run ExaSpark container

  ```bash
  $ docker run --rm -p 9090:9090 -it exaspark
  ```
3. Leave this console open while you are working and then [stop the container](#exit-exareme-container).
4. Find your docker machine IP
    - On Linux is: localhost
    - On Windows/Mac open a new Docker Quickstart Terminal and run:
  
    ```
    $ docker-machine ip
    ```
    It will return your docker-machine ip **(from now on use this instead of localhost if you are on Windows or Mac)**.

## Exit Exareme container
To gracefully stop your docker container:

1. Select your ExaSpark docker console.
2. Press Ctrl+C.
3. Close the console.

  

