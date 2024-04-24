#!/usr/bin/env groovy

// KubernetesCredentialsID 'KubeConfig file'
def call(String k8s) {

    // login to k8s Cluster via KubeConfig file
    withCredentials([file(credentialsId: "${k8s}", variable: 'KUBECONFIG_FILE')]) {
        sh "export KUBECONFIG=${KUBECONFIG_FILE} && kubectl apply -f ."
    }
}
