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
public class DBCustomerCheckIn {
    ResultSet rs;
    Statement stmt;
    
    public ResultSet GetRoomDetails(String bed,String roomType){
        try{
            stmt = DBConnection.getStatementConnection();
               
        rs = stmt.executeQuery("SELECT roomNo FROM room WHERE bed='"+bed+"' and roomType='"+roomType+"' and status='Not Booked'");
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet GetRoomDetails2(String roomNumber){
        try{
            stmt = DBConnection.getStatementConnection();
               
        rs = stmt.executeQuery("SELECT * FROM room WHERE roomNo='"+roomNumber+"'");
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
   
    public void UpdateBooking(String roomNumber){
        
        try {
             stmt = DBConnection.getStatementConnection();
             stmt.executeUpdate("UPDATE room SET status='Booked' WHERE roomNo='"+roomNumber+"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    
    public void AddCustomer(String name,String mobileNumber,String nationality,String gender,String email,String idProof,String address,String checkIn,String roomNumber,String bed,String roomType,String price){
        
        try {
             stmt = DBConnection.getStatementConnection();
             stmt.executeUpdate("INSERT INTO customer(name,mobileNumber,nationality,gender,email,idProof,address,checkIn,roomNo,bed,roomType,pricePerDay) VALUES('"+name+"','"+mobileNumber+"','"+nationality+"','"+gender+"','"+email+"','"+idProof+"','"+address+"','"+checkIn+"','"+roomNumber+"','"+bed+"','"+roomType+"','"+price+"')");
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
