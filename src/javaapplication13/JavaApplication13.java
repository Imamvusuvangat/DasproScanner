
package javaapplication13;

import java.util.Scanner;
public class JavaApplication13 {

    public static void main(String[] args) {
        
     String s = "hallo.";  
         
          Scanner scan = new Scanner(s);  
          
          System.out.println("String: " +scan.nextLine());  
          scan.close();           
          System.out.println("--------masukan perintah berikut-------- ");  
          Scanner in = new Scanner(System.in);  
          System.out.print("User: ");    
          String user = in.next();   
          System.out.println("User: " + user);
         
          System.out.print("Password: ");
          String password = in.next();
          System.out.println("Password: " + password);
          System.out.print("usia: ");  
          int i = in.nextInt();  
          System.out.println("Usia: " + i);  
          System.out.print("nomor: ");  
          double d = in.nextDouble();  
          System.out.println("Nomor: " + d);         
          in.close();           
          
          
          }    
}  
