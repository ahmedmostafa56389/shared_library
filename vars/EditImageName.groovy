#! usr/bin/env groovy
def call (String imageName) {
  sh "sed -i 's|image:.*|image: ${imageName}|g' deploym.yaml"
}
