/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;




import java.sql.*;  

public class conn{
    Connection c, myDbConn;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
//            c =DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6403109","sql6403109","s3Qv4iiGYD"); 
             String url ="jdbc:mysql://serverdbs.mysql.database.azure.com:3306/sql6403109?useSSL=true&requireSSL=false&serverTimezone=UTC"; 
            myDbConn = DriverManager.getConnection(url, "Ansh@serverdbs", "Dbmsproject1234");
            s = myDbConn.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

