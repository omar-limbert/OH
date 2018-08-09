# DEVOPS

##Docker + Apache Tomcat

First you need a web project to deploying.

###Dockerfile

Now let's make our Dockerfile. Create and open yourproject/Dockerfile and copy&paste these:

    FROM tomcat:9.0.1-jre8-alpine
    
    ADD ./webapp /usr/local/tomcat/webapps/webapp
    
    CMD ["catalina.sh", "run"]

###Apache Tomcat Image

    FROM tomcat:9.0.1-jre8-alpine
    
I use official tomcat:9.0.1-jre8-alpine image for our base image. 

###Copying Project and Start up Tomcat

    ADD ./webapp /usr/local/tomcat/webapps/webapp
    
The ADD instruction copies our local files(in our case, yourproject/webapp folder) to container's file system(/usr/local/tomcat/webapps/webapp).

    CMD ["catalina.sh", "run"]
    
Finally, the CMD instruction will start up Apache Tomcat, which runs our web application.

###Build Docker Image and Run

Go to yourproject/ in terminal, and type it to build a Docker image:

    $ docker build -t mywebapp .
    
And then run:

    $ docker run --rm -it -p 8888:8080 mywebapp
    
Visit http://localhost:8888/webapp to see if your web application.

