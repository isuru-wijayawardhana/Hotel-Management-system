
package controller;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


/**
 *
 * @author Isuru
 */
public class CustomerCheckOutController {

    /**
     *
     * @param roomNumber
     */
    public static void DisplayInformationCustomerCheckOut(){
        
        JOptionPane.showMessageDialog(null,"Now You Can See Booked Room Details \nYou Want See Another Room Details Please Click Reset Button","Alert",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void DisplayCustomerErrorCheckOut(){
        
        JOptionPane.showMessageDialog(null,"Room Number Is Not Booked Or Room Number Does Not Exist","Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void UpdateCustomerCheckOut(String numberOfDayStay,String totalAmount,String checkOut,String id){
        
        new model.DBCustomerCheckOut().UpdateCustomerCheckOut(numberOfDayStay, totalAmount, checkOut, id);
          JOptionPane.showMessageDialog(null,"Customer Table Update Successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
        
    }
    public static void UpdateRoomTableStatus(String roomNumber){
        
        new model.DBCustomerCheckOut().UpdateRoomTableStatus(roomNumber);
        JOptionPane.showMessageDialog(null,"Room Table Update Successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
        
    }
    public static void bill(String id,String name,String mobileNumber,String email,String checkOut,String numberOfDayStay,String totalAmount,String roomNo,String roomType,String bed,String pricePerDay,String checkInDate){
        File file1=new File("src\\bill\\bill"+id+".txt");
        try {
            FileWriter fw=new FileWriter(file1);
            PrintWriter pw =new PrintWriter(fw);
            
            pw.println("\t\t\t\t\t\t\tMaha Gedara Hotel");
            pw.println("******************************************************************************************************************************************");
            pw.println("Bill ID:"+id);
            pw.println("******************************************************************************************************************************************");
            pw.println("\t\t\t\t\t\t\tCustomer Details");
            pw.println("******************************************************************************************************************************************");
            pw.println("Name:"+name);
            pw.println("Mobile Number:"+mobileNumber);
            pw.println("Email Address:"+email);
            pw.println("******************************************************************************************************************************************");
            pw.println("\t\t\t\t\t\t\tRoom Details");
            pw.println("******************************************************************************************************************************************");
            pw.println("Room Number:"+roomNo);
            pw.println("Room Type:"+roomType);
            pw.println("Bed"+bed);
            pw.println("Price Per Day:"+pricePerDay);
            pw.println("******************************************************************************************************************************************");
            pw.println("Check In Date:"+checkInDate);
            pw.println("Check Out Date:"+checkOut);
            pw.println("No Of Days Stay:"+numberOfDayStay);
            pw.println("Total Amount:"+totalAmount);
            pw.println("******************************************************************************************************************************************");
            pw.println("Thank You, Please Visit Again");
            pw.println("This Please Your Home");

            pw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
    }
    public static void BillShowMessage(String id){
        
  
        
       int a = JOptionPane.showConfirmDialog(null,"Do You Want To Show Bill","Select",JOptionPane.OK_CANCEL_OPTION);
       if(a==0){
           try {
               Desktop.getDesktop().open(new java.io.File("src\\bill\\bill"+id+".txt"));
           } catch (Exception e) {
               e.printStackTrace();
           }
       }else{
           JOptionPane.showMessageDialog(null,"Bill Printed Successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
       }
        
        
    }
   
}
