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
    ![sign_up1](https://user-images.githubusercontent.com/72043323/190868517-dd3bcb53-b71b-4381-b311-8c7dbd1f22e8.png)

    
- #### Login

    ![log_in2](https://user-images.githubusercontent.com/72043323/190868523-42d04181-4616-48e6-8ed0-8b3cc0df919b.png)


- #### User control panel (CRUD Menu)

    ![man_system3](https://user-images.githubusercontent.com/72043323/190868525-bf8fe4a1-ed83-499a-8219-90d932e81afd.png)

    
- #### Add user

    ![add4](https://user-images.githubusercontent.com/72043323/190868530-b0cd86aa-6690-40a0-a9fd-d244970f3632.png)

    
- #### Update user

    ![upd5](https://user-images.githubusercontent.com/72043323/190868538-b62fdbfa-3daa-4883-a1a0-9e4655124f54.png)



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
