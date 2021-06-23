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
    ![image](https://lh4.googleusercontent.com/FyypQAhD6RuUkPGg24QTkDizIOM69Qmjpr-1r6ir_LRr8zU_2sRhQUiIqV_bJEDo5ErLvPCSKKaq8DxUd_N-2tW90byR-rsBeylFArPeHD3Hq6U9wxwXfV6u37j5U7j7Nw=w1280)
    
- #### Login

    ![image](https://lh6.googleusercontent.com/BckFMa6gwQU6qN98Y9SPYGd0cpVhUVqsv9WPW7xQkOpcX6c8SFUE1rt0hMctmnGe9xy7n0OjgZLtJ--P-r4_3csGgmwQjO12CNvaeIVIxcT48e04WwWi4Yb8kz0aJFaCMA=w1280)

- #### User control panel (CRUD Menu)

    ![image](https://lh6.googleusercontent.com/tNWy2jtBhDdaA-EMw40hyyAY3fDsffDFpllegACc3bLUBw49lcfpJDCGeeZKleXS8PESxwBKrYILI_THkhj95jDyitQagv7ZY8C2XgRN7AHNhChmNJj1sI3WfyRcME2XZw=w1280)
    
- #### Add user

    ![image](https://lh3.googleusercontent.com/SeC1O9Vf3rueMKZt2d8YdS9idHd02wdqcWShCA5Qgs4V93F0RQht1gQcWMkfhOfULCAXQPdaAIDOMtY717AHPgMMAh8SRod7b5cD0zQgks2aBdyLFYrY0HgbvAsbrEZnfg=w1280)
    
- #### Update user

    ![image](https://lh4.googleusercontent.com/SFNTrpplstlTX4337DxPM5ajylRv4Gztc1Efitb2OxUrr6LVAGognUkvGFVl_VLOq9bnTdrG5LDwU6MRzwxfn78X9hCS6arER4GfCR2G_mCYkK3u9upzJCzZskDdDhDSJQ=w1280)


## Set up

### 1. You need to have installed Java, at least 8 version
https://www.oracle.com/ru/java/technologies/javase/javase-jdk8-downloads.html
### 2. You need to install MySQL DB connector ->
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
