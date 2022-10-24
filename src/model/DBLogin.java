/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Isuru
 */
public class DBLogin {
    ResultSet rs;
         Statement stmt;
    
    public ResultSet searchLogin(String usName){
        try{
            stmt = DBConnection.getStatementConnection();
            String name = usName;
            
           
        rs = stmt.executeQuery("SELECT * FROM login WHERE username='"+name+"'");
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
