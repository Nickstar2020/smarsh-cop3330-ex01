package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String answer = "no";

        while(answer == "no" ) {
            System.out.println("which sentence?");
            int sentence = scan.nextInt();

            System.out.println("how many do u wanna print out?");

            int i = scan.nextInt();
            scan.nextLine();

            if(sentence == 1)
                for(int j=0; j<i; j++)
                {
                    System.out.println("YOOOOOOO");

                }
            else
            {
                for(int j=0; j<i; j++)
                    System.out.println("WELCOME BOYS AND GIRLS");
            }

            System.out.println("do you want to exit?");

            answer = scan.nextLine();

            return;
        }



    }
}
