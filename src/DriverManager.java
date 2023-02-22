/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author naveen1651_
 */
public class DriverManager {
    
    
 public static void main (String [] args) {
     String className = "";
     try {
         Class.forName(className);
         System.out.println("Driver loaded Successfully");
     } catch (ClassNotFoundException ex) {
         
         System.out.println("Driver Failed To Load Successfully");
         System.out.println(ex.getMessage());
     }
 }
    
}
