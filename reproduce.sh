#!/bin/sh

./gradlew clean :app:assembleDebugUnitTest
printf "\n" >> ./app/src/stuffTest/java/com/example/A.kt
./gradlew :app:assembleDebugUnitTest

