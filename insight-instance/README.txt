Operating System Family: unix
Virtual Machine Architecture: x64
Virtual Machine Name: hotspot
========================================================================================================================
Template: base
Version: 3.0.0.RELEASE
Build Date: 20140808202033

* Sets Xmx to 512M
* Sets Xss to 256K
* Adds a control script to the instance
* Adds the Windows service wrapper libraries
* Adds a default jmxremote configuration with a read/write user called 'admin' with a generated password
* Adds a default JULI logging configuration
* Adds a default server configuration containing:
	* A JRE memory leak prevention listener
	* A tc Runtime Deployer listener
	* A JMX socket listener
	* A LockOutRealm to prevent attempts to guess user passwords via a brute-force attack
	* An in-memory user database
	* A threadpool that has up to 300 threads
	* A host that uses 'webapps' as its app base
	* An AccessLogValve
* Adds a default Tomcat user configuration that is empty
* Adds an init.d script configured to start the instance as a specific user
* Adds a root web application
========================================================================================================================
Template: base-tomcat-7
Version: 3.0.0.RELEASE
Build Date: 20140808202033

* Adds Tomcat 7-specific ThreadLocalLeakPreventionListener
* Adds Tomcat 7-specific catalina.properties
* Adds Tomcat 7-specific default catalina.policy to be used when starting with the -security option
* Adds Tomcat 7-specific JspServlet configuration
* Adds Tomcat 7-specific web-app declaration
========================================================================================================================
Template: insight
Version: 1.9.2.SR5
Build Date: 20140728142318

* Adds Spring Insight Developer Edition
       * Insight Dashboard accessible at /insight
       * Standard collection plugins

* Sets Xmx to 1024M
* Sets MaxPermGen to 256M for Hotspot VMs
* Sets java.awt.headless to true
* Sets javaagent to insight-weaver-1.9.2.SR5.jar
