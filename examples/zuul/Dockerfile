FROM gmaslowski/jdk
RUN mkdir -p /data/source
ADD zuul.jar /data/source
CMD ["/opt/jdk/bin/java","-jar","/data/source/zuul.jar"]
EXPOSE 80/TCP
