#!/bin/sh

find . -name "*.class" -type f -print0 | xargs -0 /bin/rm --force
rm -rf build
find . -name "*.MF" -type f -print0 | xargs -0 /bin/rm --force