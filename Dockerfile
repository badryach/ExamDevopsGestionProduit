FROM maven:3.8.2-jdk-11
ADD target/ExamDevopsGestionProduit-0.0.1-SNAPSHOT.jar ExamDevopsGestionProduit-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "ExamDevopsGestionProduit-0.0.1-SNAPSHOT.jar"]


