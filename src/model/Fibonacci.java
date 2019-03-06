/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ThiLam
 */
public class Fibonacci {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Fibonacci() { //Default constructor

    }

    public Fibonacci(int number) { //Constructor with parameter
        this.number = number;
    }

    public void recursionway() { //Printing using for loop
        for (int i = 1; i <= this.number; i++) {
            if (this.recursive(i) <= this.number) { //Check if the number id less than or equal to input number
                System.out.print(this.recursive(i) + " ");
            }
        }
    }

    public int recursive(int i) { //return integer using recursive way
        if (i == 1 || i == 2) {
            return 1;
        }
        return this.recursive(i - 1) + this.recursive(i - 2);
    }

    public void iterationway() { //Method to print fibonicca in iterational way with while loop
        int num1 = 0, num2 = 1, sum = 0; //Set num1, num2 and num3 integer variable
        while (num1 < this.number) {//While num1 is less than input number
            if (num1 > 0 && (num1 == 1 || num1 == 2)) { //Check if num1 equal to 1 or 2
                System.out.print(num1 + " ");
            } else if (num1 > 2) {//Else print numbe that is more than 1 or 2
                System.out.print(num1 + " ");
            }

            sum = num1 + num2;

            num1 = num2;

            num2 = sum;
            //To check if the iterational way is the same as recursion
            if (num1 == this.number && (num1 < 2)) {
                System.out.print(num1 + " ");
            } else if (num1 == this.number && (num1 >= 8)) {
                System.out.print(num1 + " ");
            } else if (num1 == this.number && (num1 == 5)) {
                System.out.print(num1 + " ");
            }
        }

    }
}
