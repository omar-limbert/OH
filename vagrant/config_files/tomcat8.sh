#!/usr/bin/env bash
echo "Installing Tomcat8"
cp /tmp/tomcat.service /etc/systemd/system/
cd /tmp/
wget http://www-us.apache.org/dist/tomcat/tomcat-8/v8.5.32/bin/apache-tomcat-8.5.32.tar.gz
groupadd tomcat
useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat
mkdir /opt/tomcat
tar xvf apache-tomcat-8*tar.gz -C /opt/tomcat --strip-components=1
chgrp -R tomcat /opt/tomcat
chmod -R g+r /opt/tomcat/conf/
chmod g+x /opt/tomcat/conf/
chown -R tomcat /opt/tomcat/webapps/ /opt/tomcat/work/ /opt/tomcat/temp/ /opt/tomcat/logs/
ufw allow 8080
systemctl daemon-reload
systemctl start tomcat
