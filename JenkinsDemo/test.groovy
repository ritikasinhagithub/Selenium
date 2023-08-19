pipeline {
    agent any

    stages {
        stage('Get Source Code') {
            steps {
               git branch: 'main', url: 'https://github.com/ritikasinhagithub/Selenium.git'
                echo 'Hello World'
            }
        }
        stage('Build code')
                {
                    steps
                            {
                                bat script: 'mvn compile'
                            }
                }
        stage('Run Test')
                {
                    steps
                            {
                                bat script: 'mvn test -Dbrowser=localchrome'
                            }
                }
        stage('Publish Report')
                {
                    steps
                            {
                                echo 'published'
                            }
                }
    }
}
