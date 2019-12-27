# Micro Service - Zuul Service
# Author GeekTech
# Version 1.0.0

FROM geekcarnegie/centos:1.0
MAINTAINER GeekTech
VOLUME /tmp
ADD zuul-service-1.0.0.jar zuul-service.jar
RUN bash -c 'touch /zuul-service.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/zuul-service.jar"]