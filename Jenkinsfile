pipeline{

    agent any

    stages {

        stage ('Compile Stage') {

            steps {

                withMaven(maven : 'MAVEN_HOME') {
                    bat 'mvn clean install'

                }

            }
        }
    stage ('Test Stage') {

            steps {

                 withMaven(maven : 'MAVEN_HOME') {
                    bat 'mvn test'

                }

            }
        }


        stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/reports/cucumber-reports/cucumber-html-reports",
                    htmlReportDirectory: 'target'

            }

        }

    }

}