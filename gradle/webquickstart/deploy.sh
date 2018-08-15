echo 'Stopping Tomcat service...'		
sudo service tomcat stop
sudo rm -f ${tomcat_webapps}/${war_name}.war
sudo rm -rf ${tomcat_webapps}/${war_name}

echo 'Sending war file...'
sudo cp -f /tmp/${war_name}.war ${tomcat_webapps}/${war_name}.war
sudo rm /tmp/${war_name}.war

echo 'Starting Tomcat service...'
sudo service tomcat start
