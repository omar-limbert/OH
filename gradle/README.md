# Gradle Config

## Requirements

    JavaJDK version 7 or higher.

## Now you need clone the repository with following command:

    git clone https://github.com/devops-at06/OH.git

## To execute Gradle wrapper use on Unix base systems:

    - $ ./gradlew clean build --console verbose
                                               
## To execute Gradle wrapper use on Windows systems:

    - $ gradlew.bat clean build --console verbose
        
## To verify Gradle version on Unix base systems:

    - $ ./gradlew clean build --console verbose
                                               
## To verify Gradle version on Windows systems:

    - $ gradlew.bat clean build --console verbose
    
## Also to change to other gradle version you can use:

    - $ gradle wrapper --gradle-version 4.9
    
    Replace "4.9" to your version as needed

## To generate reports with Jacoco plugin execute command on Unix base systems:

    - $ ./gradlew test jacocoTestReport

## To generate reports with Jacoco plugin execute command on Windows systems:

    - $ gradlew.bat test jacocoTestReport
