
package model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Isuru
 */
public class DBAddRoom {
    ResultSet rs;
    Statement stmt;
    
    public void AddRoom(String roomNo,String roomType,String bed,String price){
        
        try {
             stmt = DBConnection.getStatementConnection();
             stmt.executeUpdate("INSERT INTO room VALUE ('"+roomNo+"','"+roomType+"','"+bed+"','"+price+"','Not Booked')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
    public ResultSet DisplayAddRoom(){
        try {
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM room");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
