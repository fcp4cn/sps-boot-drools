# sps-boot-drools
sps (SPS) :  Stored Procedures Service

When plan migrate our Enterprise Database to cloud database TiDB, We were blocked.
Root reason is not the big data , but, are many SP(stored procedures), which are key and complex.
So, firstly, jump to split these SP from database server to cloud service.

The project are our solution , key stack:
1. Spring Boot - great tools for cloud service
2. Drools - java script for biz rule and more powerful than SQL
3. MapReduce - apply to biz data flow


#### The demo base MySQL, read mysql.txt firstly. 
* Drools can also run as war or jar, when you do not want setup micro service.
* Drools support hot deployment, same as SP. 

== See Also

The following guides may also be helpful:

* https://github.com/spring-guides/gs-spring-boot [Spring Boot]
