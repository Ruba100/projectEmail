/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author Ruba
 */
public class Email {

    //  كلاس الايميل وخصائصه
    private String firstName;
    private String email;
    private String lastName;
    private String password;
    private String deparment;
    private int mailboxCapcity=500;
    private int passwordLength = 10;
    private String alternateEmail;
    private String compantfix = "compant.com";

    // Constructor to receive the fist name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED :" + this.firstName + " " + this.lastName);
        // call a method ask for the department , return the departemnt
        this.deparment = setDeparment();
        System.out.println("deparment :" + this.deparment);

        // call amethod return a random password
        this.password = randomPassword(passwordLength);
        System.out.println("Your password is :" + this.password);
        
        // combine elements to gerate email
        email = firstName.toLowerCase()+"" + lastName.toLowerCase()+"@"+ deparment+"." +compantfix;
        System.out.println("Your email is :"+email);
        
    }

    // ِAsk for the department
    private String setDeparment() {
        System.out.print("Deparment codes \n 1 for Sales\n 2 for the Devlopment\n 3 for the Accounting \n 0 for none\n Enter department code ");
        Scanner input = new Scanner(System.in);

        int deparmentChoice = input.nextInt();

        if (deparmentChoice == 1) {
            return "sales";
        } else if (deparmentChoice == 2) {
            return "devlopment";
        } else if (deparmentChoice == 3) {
            return "counting";

        } else {
            return "nothig";
        }

    }
    // Ganerate a random password

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // set the malibox capcity
    public void setmaliboxCapcity(int capcity){
        this.mailboxCapcity= capcity;
        
        
    }
    // set the alternate email
    public void setAlternateEmail(String altEmail ){
        this.alternateEmail=altEmail;
    }
    
    // change the password
    
    public void changePassword(){
        this.password = password;
    }
    
    public int getmaliboxCapcity(){
        return mailboxCapcity;
        
     }
    public String getAlternateEnail(){
        return alternateEmail ;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME :"+firstName+" " + lastName +
                "CONPNYEMAIL : "+ email + 
                "MAILBOX CAPCITY" +mailboxCapcity+"mb";
    }
}
