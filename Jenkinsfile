pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'chmod +x gradle/quickstart/gradlew'
                sh './gradle/quickstart/gradlew clean assemble -p gradle/quickstart/'
            }
        }
        stage('Publish') {
            steps {
                echo 'Publishing Artifact....'
		        sh './gradle/quickstart/gradlew uploadArchives -p gradle/quickstart/'
		        echo 'Publishing Reports....'
		        sh './gradle/quickstart/gradlew clean test jacocoTestReport -p gradle/quickstart/'
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
                               reportDir: 'gradle/quickstart/build/reports/coverage/',
                               reportFiles: 'index.html',
                               reportTitles: "Code Coverage Report",
                               reportName: 'Code Coverage Report'])
        }

    }
}
