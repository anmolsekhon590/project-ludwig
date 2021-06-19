# we will use openjdk 8 with alpine as it is a very small linux distro
FROM openjdk:16.0.1-oraclelinux7

# copy the packaged jar file into our docker image
COPY target/project-ludwig-0.0.1-SNAPSHOT.jar /ludwig.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/ludwig.jar"]