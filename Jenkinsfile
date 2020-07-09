pipeline{
    agent any

    tools {
         maven 'mvn-3.5.4'
    }

    stages {
        stage('Build'){
            steps{
                // 用maven全局的seting.xml文件初始化项目
                configFileProvider([configFile(fileId:'maven-global-settings',variable:'MAVEN_GLOBAL_ENV')]) {
                        sh "mvn -s $MAVEN_GLOBAL_ENV clean install"
                        sh "mvn package"
                        sh "java -jar /var/lib/jenkins/workspace/lti-branch-maven-pipeline_master/target/multibranch-pipeline-demo-0.0.1-SNAPSHOT.jar"
                }
                // sh "mvn clean package spring-boot:repackage"
                sh "printenv" // 将环境变量打印到 console 中
                echo "测试自动构建"
            }
        }
    }
}