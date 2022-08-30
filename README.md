# StudentManagement_ConsoleApp
Use Of java, MYSQL, JDBC

1. Clone the Repositories. 

2. Create a Database using MySQL or You can use another Database Also. 

3. if You are Using MySQL then Downlead mysql-connector-java-8.0.29 (https://dev.mysql.com/downloads/connector/j/8.0.html) and add jar file into your Project or you can Downlead another Version of MySQL-Connector.

4.First Extract mysql-connector-java For adding jar file: 
Click on a Project -> Build path -> Configure build Path -> Libraries -> Add External Jar ->Select The Downlead MySQL-Connector jar file ->import ->apply and Close.

5. These Following steps to Connect Java Program to MySQL Database :
    
    1.     import -> java.sql.*
    1.     load and register the driver //com.mysql.jdbc.Driver
    1.     Create Connection  //Connection

           Go to The Connection_Con.java

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create Connection

			           String user = "root";  //as per Your MySQL - Database Name (When You Install the MySQL database that name are required Here)
			
                        String password = "root";  // as Per Your Database Password (When You Install the MySQL database that Password are required Here)
			
                        String url = "jdbc:mysql://localhost:3306/**gulshan**";      // in palce Of gulshan, write the your Database name (name of database that you are create in 1st step)
			
                        con = DriverManager.getConnection(url,user,password);
    1.     Create a Statement  //Statement
    1.     Execute the Query
    1.     Process the result
    1.     close

6. Execute The Program...








