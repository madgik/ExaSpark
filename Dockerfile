FROM openjdk:8

MAINTAINER Efthymios Theodorakopoulos (etheodorako@di.uoa.gr)

RUN apt-get update
RUN apt-get install -y maven

#COPY pom.xml /root/exaspark/pom.xml
#COPY src /root/exaspark/src
#COPY META-INF /root/exaspark/META-INF
#COPY spark-warehouse /root/exaspark/spark-warehouse

COPY . /root/exaspark

#COPY * /root/exaspark/

WORKDIR /root/exaspark
RUN mvn clean package
#RUN mvn clean compile assembly:single

WORKDIR /root/exaspark/target

EXPOSE 9090

CMD ["java","-jar","ExtendedSpark-0.0.1-SNAPSHOT.jar"]
#CMD ["java","-jar","ExtendedSpark-0.0.1-SNAPSHOT-jar-with-dependencies.jar"]
#CMD ["java","-cp","ExtendedSpark-0.0.1-SNAPSHOT-jar-with-dependencies.jar","madgik.exaSpark.ExaremeSpark"]

