pipeline {
    agent any
    tools {
        maven 'maven-3'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Juyin-Tang/SoftwareEngineeringProject.git'
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