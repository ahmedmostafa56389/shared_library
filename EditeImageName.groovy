#! usr/bin/env groovy
def call (String imageName) {
  sh "sed -i 's|image:.*|image: ${imageName}:${BUILD_NUMBER}|g' deployment.yaml"
}
