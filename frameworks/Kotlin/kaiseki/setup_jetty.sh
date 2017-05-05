#!/bin/bash

fw_depends mysql java

gradle wrapper

gradle clean build jetty
java -server -XX:+UseNUMA -XX:+UseParallelGC -XX:+AggressiveOpts -XX:+AlwaysPreTouch -jar build/libs/kaiseki-standalone.jar &
