pipeline {

        agent any
        stages {
                stage('Checkout Git'){
                   
                steps{
                        echo 'Pulling...';
                        git branch: 'hammouda_',
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
<<<<<<< HEAD
          stage('JUnit and Mockito Test'){
=======
                     stage('JUnit and Mockito Test'){
>>>>>>> b05e93571595cc2d53c8d1eb2d068e9f68c47213
            steps{
                script
                {
                    if (isUnix())
                    {
                        sh 'mvn --batch-mode test'
                    }
                    else
                    {
                        bat 'mvn --batch-mode test'
                    }
                }
            }
        }
         stage('SonarQube analysis 1') {
            steps {
                sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=admin'
            }
        }
<<<<<<< HEAD
      
=======
   
>>>>>>> b05e93571595cc2d53c8d1eb2d068e9f68c47213
        
       
       
    }
}
