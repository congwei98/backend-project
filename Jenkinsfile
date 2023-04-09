pipeline {
    agent any
    tools {
        maven 'maven-3.8.7'
    }

    stages {
        stage('SCM'){
            steps {
                git 'https://github.com/congwei98/backend-project'
            }
        }

        stage('TEST'){
            steps {
                sh "mvn clean test"
            }
        }

        stage('BUILD'){
            steps {
                sh "mvn -Dmaven.test.skip=true install"
                sh "scp ./target/*.jar ansadmin@172.31.14.129:/opt/docker/backend-app-pipeline"
                sh "ssh ansadmin@172.31.14.129 ansible-playbook -i /opt/docker/hosts /opt/docker/backend-app-pipeline/create_image_backendapp.yml;"
            }
        }

        stage('DEPLOY'){
            steps {
                sh "ssh ansadmin@172.31.14.129 ansible-playbook -i /opt/docker/hosts /opt/docker/backend-app-pipeline/kube_deploy.yml"
            }
        }
    }
}