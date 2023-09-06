def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
    

    sh 'mvn clean pakage sonar:sonar'
    }
}
