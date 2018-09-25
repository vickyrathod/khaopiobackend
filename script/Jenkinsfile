pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
        }
    }
    stages {
	stage('SCM') {
	    steps {
		git = "https://github.com/vickyrathod/khaopiobackend.git"
	    }
	}
        stage('Build') {
            steps {
                mvn clean package docker:build
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
