pipeline {
	agent {
		node {
			label 'master'
		}
	}
	
	options{
		timestamps()
	}
	
	
	stages{
		stage("Checkout, Test") {
			steps{
				checkout scm
				
				script{
					bat(/mvn clean  test /)
				}
				
			}
		}
		
		stage("Email"){
			steps{
				emailext (to: 'mouryagv@gmail.com', replyTo: 'mouryagv@gmail.com', subject: "Email Report", body: "Build Suc", mimeType: 'text/html');
			}
		}
	}
	

}