#!/bin/sh

. ./setantenv.sh

cd app

ant clear_dir compilation make_jar run_program

cd ../