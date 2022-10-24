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
public class DBCustomerDetailsBill {
    ResultSet rs;
    Statement stmt;
    
    
    public ResultSet CheckOutDate(){
        try {
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM customer WHERE checkOut IS NOT NULL");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet SelectCheckOutDate(String checkOutDate){
        try {
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM customer WHERE checkOut='"+checkOutDate+"'");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}

    
    
