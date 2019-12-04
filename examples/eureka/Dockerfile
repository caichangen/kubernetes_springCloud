FROM gmaslowski/jdk
RUN mkdir -p /data/source
ADD eureka.jar /data/source
CMD ["/opt/jdk/bin/java","-jar","/data/source/eureka.jar"]
EXPOSE 8100/TCP
