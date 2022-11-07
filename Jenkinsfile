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
         stage('JUnit and Mockito Test'){
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
                sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=admin1'
            }
        }
       stage('Docker build')
        {
            steps {
                 sh 'docker build -t hammouda997/achat  .'
            }
        }
        stage('Docker login')
        {
            steps {
                sh 'echo $dockerhub_PSW | docker login -u hammouda997 -p dckr_pat_JEx-Xhde4T-nwgJTdlmg1tn0yQ8'
            }    
       
        }
      stage('Push') {

			steps {
				sh 'docker push hammouda997/achat'
			}
		}
        stage('NEXUS') {
            steps {
                sh 'mvn deploy -DskipTests'
                  
            }
        }
        
       stage('Run app With DockerCompose') {
              steps {
                  sh "docker-compose -f docker-compose.yml up -d  "
              }
              }
        
       
       
    }
    }
}
