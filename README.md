# Exercises
Code exercises and questions.

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
```
public static List<String> names() {
  List<String> names = Arrays.asList("Ahmed", "John", "Eric", "AHMEd", "Jay", "Ahmed Kamel", "Ahmed", "Santiago", "Mary", "", null);
  List<String> results = names.stream().filter(name -> !"Ahmed".equals(name)).collect(Collectors.toList());
  return results;
}		
```
2. Given a list of integers 1,2,3,4,5,6,7 etc. remove all values greater than 100
```
public static List<Integer> numbers() {
  List<Integer> numbers = Arrays.asList(1, 2, 14, 100, 2000, 34, 122, 555, 678, 333, null);
  List<Integer> results = numbers.stream().filter(n -> n != null && 100 < n).collect(Collectors.toList());
  return results;
}
```
3. How can we monitor the JVM in a production environment?
  - Utilize a load testing tool like JMeter to simulate traffic and observe resource utilization.  This would aid in provisioning adequate resources to scale infrastructure effectively.  This can also be used to identify problematic software processes or code hotspots to optimize further. 

## Test Mentality
1. Come up with +ve , -ve and edge condition test scenarios for the above Java method
  - Check null values and empty strings. The .equals() already covers this
  - Check case sensitivity. In this question, it is not needed.
  - Check valid string input
  - Check number values are not larger than int range (assuming 100 is of type int)
  - Check that arrays are not empty
2. What is the difference between load test/stress test/functional test?
  - Load testing and Stress testing are related, but with a difference in objective.  
    - In a load test, the goal is to observe how the system operates under "normal" conditions.  Typically based on customer requirements for support or metrics derived from a live environment.  
    - A stress test differs because it attempts to identify the upper bounds of a given environment's capabilities.  This would be useful in identifying performance bottlenecks or hotspots in code or infrastructure. 
    - Functional testing is commonly done to check that an application operates according to provided requirements.  A Non-Functional requirement would take into account the previous forms of testing. Examples of this is often related to system performance, HCI / usability, efficiency, or reliability.
