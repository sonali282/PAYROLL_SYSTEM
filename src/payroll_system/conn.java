/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author sonai priya
 */
public class conn {
    
 
    public Connection c;
    public Statement s;
    
    public conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3308/payroll_system","root","");
            s=c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        } 
    }
    
}
