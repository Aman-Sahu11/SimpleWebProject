pipeline {
    agent any

    

    stages {
        stage('Compile Stage') {
            steps {
            	withMaven(maven: 'MAVEN'){
            		sh 'mvn clean compile'
            	}
               
            }

        }
        stage('Build Stage') {
            steps {
            	withMaven(maven: 'MAVEN'){
            		sh 'mvn package'
            	}
               
            }

        }
    }
}
