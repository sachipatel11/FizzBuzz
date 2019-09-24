import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Your solution to MIE250 Project 1 goes here
// This is the "default pasckage" hence there should be *no* line that starts with "package ...;"

public class FizzBuzz {
    /**
     *
     * @param args
     * @throws IOException
     */ //need to include something for negative value 
    public static void main(String args[]) throws IOException {
        int fizz, buzz, i;
        int start, end;
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("   JAVA FIZZBUZZ PROGRAM");
        System.out.print("Enter Fizz number: ");
        fizz = Integer.parseInt(cin.readLine());

        while (fizz < 0) {
            System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
            fizz = Integer.parseInt(cin.readLine());
        }

        if (fizz == 0) {
            System.out.println("\nThe end.");
            return;
        } else if (fizz != 0) {
            System.out.print("Enter Buzz number: ");
            buzz = Integer.parseInt(cin.readLine());
            while (buzz < 0) {
                System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
                buzz = Integer.parseInt(cin.readLine());
            }
            if (buzz == 0) {
                System.out.println("\nThe end.");
                return;
            }
            while (fizz != 0 && buzz != 0) {
                System.out.print("Enter starting number: ");
                start = Integer.parseInt(cin.readLine());
                System.out.print("Enter ending number: ");
                end = Integer.parseInt(cin.readLine());

                while (end < start) {
                    System.out.print("ERROR: Ending number cannot be less than starting number! Try again: ");
                    end = Integer.parseInt(cin.readLine());
                }
                System.out.println("");
                for (i = start; i <= end; i++) {

                    if (i % fizz == 0 && i % buzz == 0) {
                        System.out.println(i + "." + " FizzBuzz");
                    } else if (i % fizz == 0) {
                        System.out.println(i + "." + " Fizz");
                    } else if (i % buzz == 0) {
                        System.out.println(i + "." + " Buzz");
                    } else {
                        System.out.println(i + ". " + i);
                    }
                }
                System.out.println("\n   JAVA FIZZBUZZ PROGRAM");
                System.out.print("Enter Fizz number: ");
                fizz = Integer.parseInt(cin.readLine());
                while (fizz < 0) {
                    System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
                    fizz = Integer.parseInt(cin.readLine());
                }
                if (fizz == 0) {
                    System.out.println("\nThe end.");
                    return;
                } else if (fizz != 0) {
                    System.out.print("Enter Buzz number: ");
                    buzz = Integer.parseInt(cin.readLine());
                    while (buzz < 0) {
                        System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
                        buzz = Integer.parseInt(cin.readLine());
                    }
                    if (buzz == 0) {
                        System.out.println("\nThe end.");
                        return;
                    }
                }
            }
        }
    }
}