pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		sh 'chmod +x gradle/quickstart/gradlew'
		sh './gradle/quickstart/gradlew clean assemble -p gradle/quickstart/'
                archiveArtifacts artifacts: '.jar', fingerprint: true, onlyIfSuccessful: true
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		sh './gradle/quickstart/gradlew clean test -p gradle/quickstart/'
		junit 'test.xml'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
		sh './gradle/quickstart/gradlew clean build -p gradle/quickstart/'
		when {
              		expression {
                		currentBuild.result == null || currentBuild.result == 'SUCCESS' 
                	}
            	}
            }
        }
    }
}
