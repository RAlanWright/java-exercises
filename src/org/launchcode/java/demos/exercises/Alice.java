package org.launchcode.java.demos.exercises;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){

//      Hello World
        System.out.print("What is your name? ");
        Scanner name = new Scanner(System.in);
        String uName = name.nextLine();
        System.out.println("Hello, " + uName);

        System.out.println();
        System.out.println();

//      Area of Rectangle
//      Rounding the decimal to 4 decimal places
        DecimalFormat df4 = new DecimalFormat("#.####");
        df4.setRoundingMode(RoundingMode.CEILING);

//      Rounding to 2 places
        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setRoundingMode(RoundingMode.CEILING);

        System.out.println("Now we will calculate the area of a rectangle.");

        Scanner length = new Scanner(System.in);
        Scanner width = new Scanner(System.in);

        System.out.println("What is the length? ");
        Double uLength = length.nextDouble();
        System.out.println("What is the width? ");
        Double uWidth = width.nextDouble();

        Double rectArea = uLength * uWidth;

        System.out.println("The area of your rectangle is: " + df4.format(rectArea));
        System.out.println();
        System.out.println();




//      Miles per gallon used
        System.out.println("Now we'll calculate Miles Per Gallon (MPG)");
        Scanner gallons = new Scanner(System.in);
        Scanner miles = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = miles.nextDouble();
        System.out.println("How many gallons of gas have you consumed?");
        Double gallonsUsed = gallons.nextDouble();

        Double mpgCalculation = milesDriven / gallonsUsed;
        System.out.println("Your vehicle had a fuel economy of: " + df2.format(mpgCalculation) + " MPG");

        System.out.println();
        System.out.println();


//        Short Alice's Adventures in Wonderland story
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";



        System.out.println("Check to see if a term exists within a string.");
        Scanner term = new Scanner(System.in);
        System.out.println("What term will you search for?");
        String uTerm = term.nextLine();
        boolean contains = alice.contains(uTerm);
        System.out.println("Contains search term: " + contains);
    }
}
