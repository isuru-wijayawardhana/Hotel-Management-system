
package model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Isuru
 */
public class DBCustomerCheckOut {
        ResultSet rs;
        Statement stmt;
    public ResultSet DisplayCustomerCheckOutTable(){
        try {
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM customer WHERE checkOut IS NULL");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet DisplayCustomerCheckOut(String roomNumber){
        try {
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM customer WHERE roomNo='"+roomNumber+"' AND checkOut IS NULL");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public void UpdateCustomerCheckOut(String numberOfDayStay,String totalAmount,String checkOut,String id){
        
        try {
             stmt = DBConnection.getStatementConnection();
             stmt.executeUpdate("UPDATE customer SET noOfDaysStay="+numberOfDayStay+",totalAmount='"+totalAmount+"',checkOut='"+checkOut+"'WHERE id='"+id+"'");
        } catch (Exception e) {
            e.printStackTrace();
        }  
}
    
    public void UpdateRoomTableStatus(String roomNumber){
        
        try {
             stmt = DBConnection.getStatementConnection();
             stmt.executeUpdate("UPDATE room SET status='Not Booked' WHERE roomNo='"+roomNumber+"'");
        } catch (Exception e) {
            e.printStackTrace();
        }  
}
}
