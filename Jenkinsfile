pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'chmod +x gradle/quickstart/gradlew'
                sh './gradle/quickstart/gradlew clean assemble -p gradle/quickstart/'
            }
        }
        stage('Test') {
            steps {
                sh './gradle/quickstart/gradlew clean test jacocoTestReport -p gradle/quickstart/'
            }
        }
        stage('Code Quality') {
            steps {
                sh './gradle/quickstart/gradlew sonarqube -D sonar.host.url=http://localhost:9000 -p gradle/quickstart/'
            }
        }
        stage('Publish') {
            steps {
                sh './gradle/quickstart/gradlew uploadArchives -p gradle/quickstart/'
                
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
