
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Isuru
 */
public class AddRoomController {
    public static void AddRoom(String roomNo,String roomType,String bed,String price){
        new model.DBAddRoom().AddRoom(roomNo, roomType, bed, price);
        JOptionPane.showMessageDialog(null,"New Room has inserted Successfully","Successfully Update",JOptionPane.INFORMATION_MESSAGE);
        
    }
    public static void AddRoomError(){
  
        JOptionPane.showMessageDialog(null,"Please Check the Credential","Error",JOptionPane.ERROR_MESSAGE);
    }
    
}
