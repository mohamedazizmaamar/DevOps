pipeline {

        agent any
        stages {
                stage('Checkout Git'){
                   
                steps{
                        echo 'Pulling...';
                        git branch: 'houssem',
                        url : 'https://github.com/MohamedAzizMaamar/DevOps.git';
                    }
                }
       
        stage('Testing maven') {
            steps {
                sh """mvn -version"""
                 
            }
        }
       
        stage('Mvn Clean') {
            steps {
                sh 'mvn clean'
                 
            }
        }
        stage('Mvn Compile') {
            steps {
                sh 'mvn compile'
                 
            }
        }
         stage('SonarQube analysis 1') {
            steps {
                sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=admin'
            }
        }
       stage ('Test'){
            steps {
                echo 'Testing... ';
                sh 'mvn test -Dtest="OperateurServiceImplTest"';
            }
        }
        
       
       
    }
}