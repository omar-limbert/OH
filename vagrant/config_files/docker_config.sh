#!/usr/bin/env bash
echo "Configuring folders to run Jenkins and GoCD"
mkdir go_server
mkdir go_agent
mkdir jenkins
mkdir godata_server
mkdir godata_agent
sudo su
cp /tmp/docker-compose.yml /home/ubutun/
cp /tmp/daemon.json /etc/docker/
systemctl daemon-reload
systemctl restart docker
docker-compose up -d
