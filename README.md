This is a skeleton project for Spring webmvc and maven.  Tested on Wildfly 10.


```bash
mvn clean install package
cp -r target/skeleton-0.0.1-SNAPSHOT.war $JBOSS_HOME/standalone/deployments/
JBOSS_HOME/bin/standalone.sh
```