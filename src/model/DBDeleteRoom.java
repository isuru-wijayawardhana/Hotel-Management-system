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
public class DBDeleteRoom {
    ResultSet rs;
    Statement stmt;
    public void DeleteRoom(String roomNumber){
        
        try {
            stmt=DBConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM room WHERE roomNo='"+roomNumber+"' AND status = 'Not Booked'");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public ResultSet DisplayRoomTable(){
        try {
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM room");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet GetStatus(String roomNumber){
        try{
            stmt = DBConnection.getStatementConnection();
               
        rs = stmt.executeQuery("SELECT * FROM room WHERE roomNo='"+roomNumber+"'");
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
