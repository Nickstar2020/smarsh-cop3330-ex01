/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

//counting the number of characters

package org.example;
import java.util.Scanner;

public class assignment2 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the string?");

        String theString = scan.nextLine();

        System.out.println("String length is " + theString.length());

    }

}
