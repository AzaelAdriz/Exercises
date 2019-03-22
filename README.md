# Exercises
Code exercises and questions. See Java class for questions not addressed below.

## SQL
1. Assume you have 2 database tables, table 1 and table 2, both have the exact same column names and data types. The ask is to write a SQL query to verify that the data in table 1 is exactly the same as in table 2. 
2. Write a query to retrieve fully duplicated records from a database table.
```
SELECT * FROM (SELECT * FROM table1 UNION ALL SELECT * FROM table2) temp GROUP BY id, col1, col2, col3 HAVING count(*) = 2 ORDER BY id
```
  - Both questions above can be resolved with the above query with a tweak to the count.  
    - If all records are the same, the count will equal two records for each row, meaning they are all duplicated. 
    - If count is changed to one, a mismatch will be reflected in the result.

## Java
1. Given a list of people’s names “Ahmed”,”John”,”Eric” , write a  java operation to remove all the names named “Ahmed”
2. Given a list of integers 1,2,3,4,5,6,7 etc. remove all values greater than 100
3. How can we monitor the JVM in a production environment?
  - Utilize a load testing tool like JMeter to simulate traffic and observe resource utilization.  This would aid in provisioning adequate resources to scale infrastructure effectively.  This can also be used to identify problematic software processes or code hotspots to optimize further. 

## Test Mentality
1. Ask candidate to come up with +ve , -ve and edge condition test scenarios for the above Java method
2. What is the difference between load test/stress test/functional test?
  - Load testing and Stress testing are related, but with a difference in objective.  
    - In a load test, the goal is to observe how the system operates under "normal" conditions.  Typically based on customer requirements for support or metrics derived from a live environment.  
    - A stress test differs because it attempts to identify the upper bounds of a given environment's capabilities.  This would be useful in identifying performance bottlenecks or hotspots in code or infrastructure. 
    - Functional testing is commonly done to check that an application operates according to provided requirements.  A Non-Functional requirement would take into account the previous forms of testing. Examples of this is often related to system performance, HCI / usability, efficiency, or reliability.
