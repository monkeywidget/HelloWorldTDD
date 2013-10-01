Maven example
=============

http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html


Create the project
------------------

http://maven.apache.org/guides/getting-started/index.html

    mvn archetype:generate \
      -DarchetypeGroupId=org.apache.maven.archetypes \
      -DgroupId=com.mycompany.app \
      -DartifactId=my-app

This will:

- make the app directory "my-app"
- generate the pom.xml
- make the App.java file
- make the first test file AppTest.java


Compile!

    mvn compile


Run the tests
=============

Compile the code

    mvn clean; mvn compile

Run the tests:

    mvn test

