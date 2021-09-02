/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

//simple prompt for name

package org.example;
import java.util.Scanner;

public class assignment1 {

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");

        String yourName = scan.nextLine();

        System.out.println("Hello " + yourName + "!");
    }

}




