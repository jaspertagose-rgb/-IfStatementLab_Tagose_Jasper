 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joja;
import java.util.Scanner;


/**
 *
 * @author Student
 */
public class Joja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
          Scanner input = new Scanner(System.in);
          System.out.println("1.");
          System.out.println("Hi!!!");
          System.out.print("How old are you ");
          int A=input.nextInt();
          if (A<13){System.out.println("You are a child");}
          else if (A<19){System.out.println("You are a teenager");}
          else if (A>=20){System.out.println("You are an adult");}
          
           System.out.println("2.");
          System.out.println("Hi!!!");
          System.out.print("weather for today (c) ");
          int B=input.nextInt();
          if (B==0){System.out.println("Tugnawaa do!!!!");}
          else if (B<=25){System.out.println("Nindot og panahon da");}
          else if (B>25){System.out.println("Ka init do!!!!");}
          
          System.out.println("3.");
          System.out.println("Hi!!!");
          System.out.print("Scores today ");
          int C=input.nextInt();
          if (C>=90){System.out.println("Pwede na mag oyab-oyab");}
          else if (C>=75){System.out.println("Pwede na manguyab");}
          else if (C<75){System.out.println("Study ang unahon");}
          
          System.out.println("4.");
          System.out.println("Hi User!!!");
          System.out.print("Enter the radius of a Circle ");
          double r=input.nextInt();
          double E= Math.PI*Math.pow(r,2);
          double F= 2*Math.PI*r;
          
         
           if (r>0){System.out.println("the Area of a Circle is "+E);
                       System.out.println("the Area of a Circle is "+F);}
                       else {System.out.println("invalid Radius");}
           
          System.out.println("5.");
          System.out.println("Hi!!!");
          System.out.print("Enter any integer number ");
          int G=input.nextInt();    
        
          if (G%2==0){System.out.println(G+" naay oyab");}
          else {System.out.println(G+" walay oyab");
          }
         
          
                  
          }
         
    }
    
          