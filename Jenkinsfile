pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
		sh 'chmod +x gradle/quickstart/gradlew'
		sh './gradle/quickstart/gradlew clean assemble -p gradle/quickstart/'
		sh './gradle/quickstart/gradlew uploadArchives -p gradle/quickstart/'
                archiveArtifacts artifacts: '**/repos/*.jar', fingerprint: true, onlyIfSuccessful: true
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		sh './gradle/quickstart/gradlew clean test -p gradle/quickstart/'
 		junit 'gradle/quickstart/build/test-results/test/*.xml'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
		sh './gradle/quickstart/gradlew clean build -p gradle/quickstart/'
            }
        }
	post {
           always {
            	archiveArtifacts artifacts: '**/repos/*.jar', fingerprint: true, onlyIfSuccessful: true
		junit 'gradle/quickstart/build/test-results/test/*.xml'
           }
       }
    }
}
