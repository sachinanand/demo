# demo
Basic template for spring boot app

1. It is recommended to add your own `application-dev.yml` file, for your local configuration settings.
2. To run the application do `./gradlew bootRun`
3. There is only one url right now : `/api/account`
4. To run test cases : `./gradlew test`
5. To run test reports : `./gradlew jacocoTestReport`

Note : It is necessary to run test cases before running jacocoTestReport. We can also build.gradle to run test automatically 
before you run jacocoTestReport, but I have not done it yet.
