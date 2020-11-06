node{
stage('SCM Checkout')
{
git 'https://github.com/swarnjava/awsgitrepo'
}

stage('Compile-Package'){
  def mvnHome = tool name: 'Maven 3.5.2', type: 'maven'
  //bat "F:/software/Maven/apache-maven-3.6.3/bin/mvn package"
  sh "${mvnHome}/bin/mvn package"
}
}
