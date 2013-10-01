JUnit Example
=============

- https://github.com/junit-team/junit/wiki
- https://github.com/junit-team/junit/wiki/Assertions

Install
-------

Download the jars and put them in your lib folder:

- http://search.maven.org/remotecontent?filepath=junit/junit/4.11/junit-4.11.jar
- http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

(included in this git, but this is so you can update or start from scratch)


Test
====

Compile
-------

    javac -cp .:lib/junit-4.11.jar:lib/hamcrest-core-1.3.jar HelloWorld.java
    javac -cp .:lib/junit-4.11.jar:lib/hamcrest-core-1.3.jar HelloWorldTest.java

Run
---

     java -cp .:lib/junit-4.11.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore HelloWorldTest



