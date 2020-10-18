pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        echo 'Build quickstart'
        build 'mvn clean verify'
      }
    }

  }
}