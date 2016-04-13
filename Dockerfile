FROM ttnd/tomcat:7-jdk7

RUN shutdown.sh \
    && rm -rf $CATALINA_HOME/webapps/*

COPY . /code
WORKDIR /code
RUN ./grailsw clean
RUN ./grailsw -Dgrails.env="$GRAILS_ENV" war $CATALINA_HOME/webapps/ROOT.war

# Remove code base from image
RUN rm -rf *

EXPOSE 8080
CMD ["catalina.sh", "run"]
