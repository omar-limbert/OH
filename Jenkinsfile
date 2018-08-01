pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		sh 'chmod +x gradle/quickstart/gradlew'
		sh './gradle/quickstart/gradlew clean assemble -p gradle/quickstart/'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		sh './gradle/quickstart/gradlew clean test -p gradle/quickstart/'
 		sh 'make check || true'
		junit '**/target/*.xml'
 		junit '**/target/*.html'
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
            	steps {
               	 sh 'make publish'
            	}
            }
        }
    }
}
