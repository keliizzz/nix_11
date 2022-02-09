#!/bin/sh

. ./remove.sh

echo Main-Class: ua.com.alevel.Main>MANIFEST.MF

javac -sourcepath ./src -d build/classes -cp ./libs/commons-lang3-3.11.jar:./libs/commons-collections-3.2.2.jar src/ua/com/alevel/university/Student.java src/ua/com/alevel/university/Teacher.java src/ua/com/alevel/Main.java

mkdir -p build/jar

cd build/classes

jar xf ../../libs/commons-lang3-3.11.jar org

jar xf ../../libs/commons-collections-3.2.2.jar org

cd ../../

jar cfm build/jar/University.jar MANIFEST.MF -C build/classes/ .

java -jar build/jar/University.jar