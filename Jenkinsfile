pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
		sh 'chmod +x gradle/quickstart/gradlew'
		sh ./gradle/quickstart/gradlew clean assemble -p gradle/quickstart/'
		sh ./gradle/quickstart/gradlew uploadArchives -p gradle/quickstart/'
                archiveArtifacts artifacts: '.jar', fingerprint: true, onlyIfSuccessful: true
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		sh './gradle/quickstart/gradlew clean test -p gradle/quickstart/'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
		sh './gradle/quickstart/gradlew clean build -p gradle/quickstart/'
            }
        }
    }
}
