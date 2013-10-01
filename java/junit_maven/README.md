
Init
----

All you need is the pom.xml !


Create the project
------------------

    mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false


Install all the stuff with maven
--------------------------------

    mvn package



Run the tests
=============

    java -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore [test class name]