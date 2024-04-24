#! usr/bin/env groovy
def call (String imageName) {
  sh "sed -i 's|image:.*|image:ahmedmoo/nti:${BUILD_NUMBER}|g' deploym.yaml"
}
