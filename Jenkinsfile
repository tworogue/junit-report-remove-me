// Jenkinsfile для простого конвейера CI:
// - сборка и тестирование Maven-проекта с JUnit-отчетами
pipeline {
    agent any

    tools {
        jdk 'jdk11'
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                // Получаем исходники из SCM
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Компиляция проекта
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Запуск тестов
                sh 'mvn test'
                // Публикация JUnit отчетов
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            // Сохраняем артефакты сборки
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            // Очищаем workspace
            cleanWs()
        }
    }
}
