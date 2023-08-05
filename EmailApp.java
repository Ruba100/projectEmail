   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emailapp;

/**
 *
 * @author roals
 */
public class EmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // اخذ اوبجكت من كلاس الايميل
        Email email = new Email("Sara","smith");
        System.out.println(email.showInfo());     }
    
}
