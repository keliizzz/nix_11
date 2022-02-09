#!/bin/sh

cd app

mvn clean package

java -jar target/University.jar