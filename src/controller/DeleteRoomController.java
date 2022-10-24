/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Isuru
 */
public class DeleteRoomController {
    public static void DeleteRoom(){
        
        JOptionPane.showMessageDialog(null,"Deleted Room","Successfully",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void DeleteErrorRoom(){
  
        JOptionPane.showMessageDialog(null,"This Room Is Booked\nYou Can't Delete Booked Room","Error",JOptionPane.ERROR_MESSAGE);
    }
}
