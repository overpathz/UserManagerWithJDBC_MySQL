# [Java] User manager

#### CRUD web app with registration, authorization, authentication.

## Features
- ##### CRUD operations
- ##### Connected database
- ##### Servlet API, JDBC

## Techonologies
- ##### Java 8
- ##### Tomcat
- ##### Maven
- ##### JSP
- ##### BCrypt
- ##### MySQL
- ##### Servlet API
- ##### HTML/CSS

## Application review
- #### Register
    ![image](https://i.ibb.co/nPqtWxT/Screenshot-50.png)
    
- #### Login

    ![image](https://i.ibb.co/0D8WJdd/Screenshot-51.png)

- #### User control panel (CRUD Menu)

    ![image](https://i.ibb.co/PC7Mw3y/Screenshot-52.png)
    
- #### Add user

    ![image](https://i.ibb.co/B203PCL/Screenshot-53.png)
    
- #### Update user

    ![image](https://i.ibb.co/9Gk3MSS/Screenshot-54.png)


## Set up

### 1. You need to have installed Java 8
https://www.oracle.com/ru/java/technologies/javase/javase-jdk8-downloads.html
### 2. You need to install MySQL JDBC connector ->
(jar connector in downloaded archive) https://dev.mysql.com/downloads/connector/j/<br><br>
<b>DO:</b><br>
IDE -> File -> Project Structure -> Dependencies tab in Modules -><br>
-> "+" button -> "Jar or.." -> Find unzipped jar file and import to the project

### 3. You need to install Apache Tomcat Server (Servlet container) ->
https://tomcat.apache.org/download-80.cgi<br>
After downloading, unzip the archive in any directory you want.<br><br>
IDE -> Run/Debug configuration -> Add new configuration ("+") -> Tomcat Server -><br>
-> Local -> Application server (Choose the location of unzipped folder)<br>

### 4. Input your connection data in UserDAO class in DAO package ->
private static final String dbURL = "jdbc:mysql://localhost:3306/user_manager";<br>
private static final String dbUser = "root";<br>
private static final String dbPassword = "root";<br>

### 5. Run the application (Tomcat server)
![image](https://i.ibb.co/98LFt2T/Screenshot-55.png)
<br><br>
