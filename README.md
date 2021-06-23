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

    ![image](https://lh4.googleusercontent.com/F1oUH4mf6xDVKgWpw9w7NWFaV1N5-lhpCfA9i_Y7un2NHU6ZoIIDYxy9N5VJqnEfqmVpkoJqi4Cza0rQ1QM8vk52nIT8NY0eJBd2V4yTT1nWd46EtU4HyXqz2b4HVZrpfQ=w1280)
    
- #### Login

    ![image](https://lh4.googleusercontent.com/kV13nBG_-jvI4PCvXikdSjVwwCIddP4tovvD4V4yrig4-2krZABgNAAoUsZJ1aCbS5IyIlxWbPqDcLnExfK3R0P8wt7aD9I8ADLNVVbu5Nv1pdGHk2cSaTZYBE2nPkZ0xQ=w1280)

- #### User control panel (CRUD Menu)

    ![image](https://lh6.googleusercontent.com/G_CxxpyOsZfHK31f5qtcuQ-05nqIDFLAohm29WlOs8Qc15UpJiSRPDBpgUB0SrTVSICEOS68227dkiXzdj2CXcP6mPZ3rxPvHmbPmaYRmx0IVo9XkABGYlG6DSF_iQyicw=w1280)
    
- #### Add user

    ![image](https://lh6.googleusercontent.com/WC266gZmnVo3kL7brqxB06N_wUvJuT0zcog7JzgUoqwsXidoz6mYABWRMSKt8Eie69CZEtlYNEtGYtdlrjiI9vkhkWI-avio6WbEPebAQideAdykUWGSKghoJwGN749SVg=w1280)
    
- #### Update user

    ![image](https://lh6.googleusercontent.com/xZMeJNPc0QEELlZ5YiY2jWwKGBoJtHD6trmrfqHtekh2w6fH13KSiWa1L0lQhahzBl5t0RGfdanwG_iMrpk6EhzS6nTNQ2yEtgZdpbHKus7SiRqTYsyopQN6g7HQ94O1kQ=w1280)


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
