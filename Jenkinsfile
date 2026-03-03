pipeline {
    agent any

    tools {
        maven 'maven-3'
    }

    environment {

        DOCKERHUB_CREDENTIALS_ID = 'Docker_Hub'


        DOCKERHUB_REPO = 'juyint/temperature-converter'


        DOCKER_IMAGE_TAG = 'latest'
    }

    stages {

          stage('Checkout') {
              steps {
                  git 'https://github.com/ADirin/lectDemo_1_f2026.git'
              }
          }

          stage('Run Tests') {
              steps {
                  bat 'mvn clean test'
              }
          }

          stage('Code Coverage') {
              steps {
                  bat 'mvn jacoco:report'
              }
          }

          stage('Publish Test Results') {
              steps {
                  junit '**/target/surefire-reports/*.xml'
              }
          }

          stage('Publish Coverage Report') {
              steps {
                  jacoco()
              }
          }

          stage('Build Docker Image') {
              steps {
                  script {
                      docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}")
                  }
              }
          }

          stage('Push Docker Image to Docker Hub') {
              steps {
                  script {
                      docker.withRegistry('https://index.docker.io/v1/', DOCKERHUB_CREDENTIALS_ID) {
                          docker.image("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}").push()
                      }
                  }
              }
          }
        }
    }

    post {
        always {
            cleanWs()
        }
        success {
            echo 'Pipeline executed successfully!'
        }
    }
}