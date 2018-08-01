pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
		sh 'chmod +x gradle/quickstart/gradlew'
		sh './gradle/quickstart/gradlew clean assemble -p gradle/quickstart/'
		sh './gradle/quickstart/gradlew uploadArchives -p gradle/quickstart/'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		sh './gradle/quickstart/gradlew clean test jacocoTestReport -p gradle/quickstart/'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
		sh './gradle/quickstart/gradlew clean build -p gradle/quickstart/'
            }
        }
    }
    post {
       always {
                archiveArtifacts artifacts: '**/repos/*.jar', fingerprint: true, onlyIfSuccessful: true
		junit 'gradle/quickstart/build/test-results/test/*.xml'
		publishHTML([allowMissing: true,
                       alwaysLinkToLastBuild: false,
                       keepAll: true,
                       'gradle/quickstart/build/reports/coverage/',
                       reportFiles: 'index.html',
                       reportTitles: "SimpleCov Report",
                       reportName: 'Jacoco Coverage Reports'])

      		
        }
    }
}
