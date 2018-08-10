#!/usr/bin/env bash
echo "installing Java 8 64 bit"
sudo su

echo "LANG=en_GB.UTF-8" >> /etc/environment
echo "LANGUAGE=en_GB.UTF-8" >> /etc/environment
add-apt-repository -y ppa:webupd8team/java
apt-get update
apt-get -y upgrade
echo debconf shared/accepted-oracle-license-v1-1 select true | sudo debconf-set-selections
echo debconf shared/accepted-oracle-license-v1-1 seen true | sudo debconf-set-selections 
apt-get -y install oracle-java8-installer
