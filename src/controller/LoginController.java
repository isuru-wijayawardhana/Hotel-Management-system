
package controller;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DBConnection;
import model.DBLogin;
import view.Home;
import view.Login;
import view.Welcome;

/**
 *
 * @author Isuru
 */
public class LoginController {
    public static void login(String usName,String pass){
        try{
            String userName = null; 
            String password = null; 
            
            ResultSet rs = new DBLogin().searchLogin(usName);
            
            
            while (rs.next()){
                userName = rs.getString(2);
                password = rs.getString(3);
            }
            if (userName != null && password !=null){
                if(password.equals(pass)&&userName.equals(usName)){
                    System.out.println("Login Successfully!!");
                    Login.getFrames()[1].dispose();
                    Login.getFrames()[0].dispose();
                    
                    new Home().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Please check the Correct UserName and Password","Error",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Pleace check the credentials","Error",JOptionPane.ERROR_MESSAGE);
            }
           
            DBConnection.closeCon();
            
        }catch (SQLException ex){
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public static void ExitYesNo(){
        
    int a=JOptionPane.showConfirmDialog(null,"Do You Really Want To Exit Application ","Select",JOptionPane.YES_NO_OPTION);
    if(a==0){
            System.exit(0);
        }
}
}
