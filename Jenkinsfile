pipeline {
    agent any
    tools {
        maven 'maven-3'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
            }
        }

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