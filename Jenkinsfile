pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "vinayvb18/calculator-app"
    }

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/vinay592/scientific-calculator-devops.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Push Docker Image') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                    sh 'docker login -u $USER -p $PASS'
                    sh 'docker push $DOCKER_IMAGE'
                }
            }
        }
    }

    post {
        success {
            mail to: 'developer@example.com',
            subject: 'Build Successful',
            body: 'Jenkins build completed successfully.'
        }

        failure {
            mail to: 'developer@example.com',
            subject: 'Build Failed',
            body: 'Jenkins build failed. Please check Jenkins logs.'
        }
    }
}
