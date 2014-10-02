# Edit this file to set custom options
# Tomcat accepts two parameters JAVA_OPTS and CATALINA_OPTS
# JAVA_OPTS are used during START/STOP/RUN
# CATALINA_OPTS are used during START/RUN

JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.7.0_67.jdk/Contents/Home"
AGENT_PATHS=""
JAVA_AGENTS="-javaagent:$CATALINA_BASE/bin/insight-weaver-1.9.2.SR5.jar"
JAVA_LIBRARY_PATH=""
CLASSPATH="$CATALINA_BASE/bin/insight-bootstrap-tomcat-extlibs-1.9.2.SR5.jar"
JVM_OPTS="-Xss256K -Dinsight.devedition=true -Daspectj.overweaving=true -Dorg.aspectj.tracing.factory=default -Dinsight.base=$CATALINA_BASE/insight -Dinsight.logs=$CATALINA_BASE/logs -Xmx1024m -Djava.awt.headless=true -XX:MaxPermSize=256m -Dgemfire.disableShutdownHook=true -Dgemfire.ignoreMisses=true"
JAVA_OPTS="$JVM_OPTS $AGENT_PATHS $JAVA_AGENTS $JAVA_LIBRARY_PATH"
