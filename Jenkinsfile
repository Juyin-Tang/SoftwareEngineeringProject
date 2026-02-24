pipeline {
    agent any
    tools {
        maven 'maven-3'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Report') {
            steps {
                sh 'mvn jacoco:report'
            }
        }
    }
}