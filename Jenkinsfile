pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        echo 'Build quickstart'
        sh 'mvnw clean verify'
      }
    }

  }
}