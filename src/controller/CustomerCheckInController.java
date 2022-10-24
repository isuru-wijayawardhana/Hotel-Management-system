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

public class CustomerCheckInController {
    public static void UpdateBooking(String roomNumber){
        
        new model.DBCustomerCheckIn().UpdateBooking(roomNumber);
        JOptionPane.showMessageDialog(null,"Update room ","Successfully",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public static void AddCustomer(String name,String mobileNumber,String nationality,String gender,String email,String idProof,String address,String checkIn,String roomNumber,String bed,String roomType,String price){
        
        new model.DBCustomerCheckIn().AddCustomer(name, mobileNumber, nationality, gender, email, idProof, address, checkIn, roomNumber, bed, roomType, price);
        JOptionPane.showMessageDialog(null,"Room Booked has inserted ","Successfully",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void AddCustomerNotFill(){

        JOptionPane.showMessageDialog(null,"Please Check the Credential","Error",JOptionPane.ERROR_MESSAGE);
    }
}
