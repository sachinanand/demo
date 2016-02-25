# demo
Basic template for spring boot app

1. It is recommended to add your own `application-dev.yml` file, for your local configuration settings.
2. To run the application do `./gradlew bootRun`
3. There are 2 urls right now : `/api/user` which returns a json for user. and `/api/saveUser` which saves a new user 
   with hardcoded values.
4. Save user first before getting it. :-)   
5. To run test cases : `./gradlew test`
6. To run test reports : `./gradlew jacocoTestReport`

Note : It is necessary to run test cases before running jacocoTestReport. We can also build.gradle to run test automatically 
before you run jacocoTestReport, but I have not done it yet.

## To Run this application

1. Using Docker (Recommened)
2. [Install Docker](https://docs.docker.com/engine/installation/)
3. [Install & setup Docker machine](https://docs.docker.com/machine/install-machine/) (I think this is needed only for Mac OS)
4. [Install Docker-compose](https://docs.docker.com/compose/install/)
5. Start Docker machine
6. Run  `eval "$(docker-machine env <machine-name>)"`
7. Run `docker-compose up`

The last command should start a bunch of download for postgres, gradle, java and other images. Grab a cup of coffee and your app should run.

Without using Docker :

1. Setup gradle and postgres on your machine.
2. Create a new application-dev.yml (in src/main/resources/config) for your local configurations. (Do not commit this file.)
3. Run `./gradlew bootRun`. If all is good. This should make your application come up, after a bunch of downloads of course.
