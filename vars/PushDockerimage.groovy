#!usr/bin/env groovy
def call(String Dockerhub , String imageName) {

     withCredentials([usernamePassword(credentialsId: "${Dockerhub}" , usernameVariable: 'USERNAME' , passwordVariable: 'PASWWORD')]){
          sh ' docker login -u ${USERNAME} -p ${PASSWORD} '
     }
     sh ' docker push ${imageName} '
}
