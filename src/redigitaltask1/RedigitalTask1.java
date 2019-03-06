/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redigitaltask1;

import java.util.Scanner;
import model.Fibonacci;

/**
 *
 * @author ThiLam
 */
public class RedigitalTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); //Declare input key scanner
        Fibonacci fib = new Fibonacci(); //Declare customer object
        System.out.print("Enter a number to generate fibonacci: "); //Ask user to enter number
        fib.setNumber(input.nextInt());
        
        //Recursive way
        System.out.println("Here is recursion: ");
        fib.recursionway();
        
        //Iterational Way
        System.out.println("\nHere is iteration:");
        fib.iterationway();
        
        System.out.println("\nEnding fibonicca process!");
        
    }
    
}
