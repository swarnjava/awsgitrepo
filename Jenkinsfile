node{
stage('SCM Checkout')
{
git 'https://github.com/swarnjava/awsgitrepo'
}

stage('Compile-Package'){
  def mvnHome = tool name: 'MVN3.6', type: 'maven'
  sh "${mvnHome}/bin/mvn package"
}
}
