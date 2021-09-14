/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 barhom alko
 */

package com.company;

import java.util.Scanner;
import java.lang.*;

public class Main{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width of the ceiling in feet");

        float length = sc.nextFloat();
        float width = sc.nextFloat();
        float area = length * width;

        int total = (int) Math.ceil(area / 350);
        System.out.println("You will need to purchase "+total+" gallons of paint to cover "+area+" square feet.");
    }
}