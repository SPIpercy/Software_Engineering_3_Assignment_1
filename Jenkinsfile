pipeline {
    agent any
   
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/SPIpercy/Software_Engineering_3_Assignment_1.git'
                
                bat './gradlew build'
            }
        }
    }
}
