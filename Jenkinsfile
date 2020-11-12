node{
stage('SCM Checkout')
{
git 'https://github.com/swarnjava/awsgitrepo'
}

stage('Compile-Package'){
  def mvnHome = tool name: 'MAVEN 3.5.2', type: 'maven'
  //bat "F:/software/Maven/apache-maven-3.6.3/bin/mvn package"
  sh "/usr/share/apache-maven/bin/mvn package"
}
  stage('Deployment'){
    echo "deployment stage"
   // sh "mvn --settings settings.xml clean deploy -Diam-user-access-key-id=AKIAQL3ILATYQXDIIEPT -Diam-user-secret-key=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"
   sh "aws s3 cp /var/lib/jenkins/workspace/jenkins-ec2-project/target/TestMaven1-0.0.1-SNAPSHOT.jar s3://swarnjenkinsbucket/employeeapp/"
       
    //sh "scp /var/lib/jenkins/workspace/jenkins-ec2-project/target/TestMaven1-0.0.1-SNAPSHOT.jar s3://swarnjenkinsbucket/employeeapp/"
  }
}
