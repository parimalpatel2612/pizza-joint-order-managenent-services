# pizza-joint-order-managenent-services

pizza order management and persistence service 

## order-management-service
- Service used for generate order of pizza
- Service run on port 8080
- You can check service helth using below URL
     http://localhost:8080/actuator/health
 ## How to run
  - Run the Application

    1. Download the application in Directory from Git Hub.
    2. Run the following command from project root (Using your Terminal or Command Prompt)
    
        ```mvn clean compile spring-boot:run```
    3. The application will run on Port 8080 (Please keep port 8080 free)
    4. The Custom Swagger UI URL is 
        http://localhost:8080/ui.html
## order-persistance-service

- Service used for save order to database
- Database use H2 and use below URL to see data
   -  http://localhost:8098/h2-ui/
    - change JDBC URL
    - jdbc:h2:mem:orderdb
- Service run on 8098
 ## How to run
  - Run the Application

    1. Download the application in Directory from Git Hub.
    2. Run the following command from project root (Using your Terminal or Command Prompt)
    
        ```mvn clean compile spring-boot:run```
    3. The application will run on Port 8098 (Please keep port 8098 free)
