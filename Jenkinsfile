pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'
            }
        }

        stage('Custom Groovy') {
            steps {
                script {
                    def name = "Sumit"
                    def msg = "Hello, ${name}! Jenkins is using Groovy 😄"
                    echo msg
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
            }
        }
    }
}
