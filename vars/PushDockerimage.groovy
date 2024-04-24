#!usr/bin/env groovy
def call(String Dockerhub , String imageName) {

     withCredentials([usernamePassword(credentialsId: "${Dockerhub}" , usernameVariable: 'USERNAME' , passwordVariable: 'PASSWORD')]){
          sh ' docker login -u ${USERNAME} -p ${PASSWORD} '
     }
     sh ' docker push ${imageName}:${BUILD_NUMBER} '
}
