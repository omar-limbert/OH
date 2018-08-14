# Deploying java webapplication

## Requirements

    Virtual Machine with java8 and tomcat8 installed.

## Now you need clone the repository with following command:

    git clone https://github.com/devops-at06/OH.git

## And go to folder PROJECT_PATH/gradle/webquickstart/

## To execute Gradle wrapper use on Unix base systems:
    - $ ./gradlew clean build --console verbose                                               

## To execute Gradle wrapper use on Windows systems:
    - $ gradlew clean build --console verbose

## Connect to your VM via SSH:

    ssh ubuntu@YOUR_VM_HOST -i YOUR_KEY_PATH

## put "yes" to add your key VM.

## To run deploying file and send .war to VM on Unix base system:

    - $ ./gradlew -b deploy.gradle deploy -Dhost.ip=YOUR_HOST -Dhost.user=YOUR_USER_HOST -Dkey.path=YOUR_KEY_PATH
## To run deploying file and send .war to VM on Windows systems:

    - $ gradlew  -b deploy.gradle deploy -Dhost.ip=YOUR_HOST -Dhost.user=YOUR_USER_HOST -Dkey.path=YOUR_KEY_PATH

## Open your browers on http://YOUR_HOST/quickstart and it is running..!
