package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3306/bms"; // Assuming your database is named "bms"
            String user = "root";
            String password = "";
            c =DriverManager.getConnection(url, user, password);    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  