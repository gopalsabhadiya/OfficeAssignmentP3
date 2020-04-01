# OfficeAssignmentP3

Project folder contains two projects "host" and "consumer".
"host" project contains Hosts folder, which has two jar files.
  1. SG-9090.jar : This jar runs on port 9090. To run the jar, execute below given command:
  
    java -jar SG-9090.jar
  
  2. IG-9191.jar : This jar runs on port 9191. To run the jar, execute velow given command:
  
    java -jar IG-9191.jar
    
After running these two hosts (Which are acting as airline service providers), proceed to run consumer project.
Consumer is also secured with basic authentication with 
  
  username: 
  
    toor 
  
  password: 
  
    toor

  Note: Consumer is configured for two hosts, so without running these two hosts, consumer will throw error.
