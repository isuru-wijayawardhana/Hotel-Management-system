/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import javax.swing.JOptionPane;
import view.Login;
import view.Home;
/**
 *
 * @author Isuru
 */
public class HomeController {
    public static void ExitYesNo(){
        
    int a=JOptionPane.showConfirmDialog(null,"Do You Really Want To Exit Application ","Select",JOptionPane.YES_NO_OPTION);
    if(a==0){
            System.exit(0);
        }
}
    public static int Logout(int a){
    
    int b=JOptionPane.showConfirmDialog(null,"Do You Really Want To Logout ","Select",JOptionPane.YES_NO_OPTION);
    return b;
}
}
