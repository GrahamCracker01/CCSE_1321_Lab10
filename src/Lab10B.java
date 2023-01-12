//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab10B {

    //valid check
    public static boolean isValid(double w, double h) {
        return (w + h) > 30;
    }

    //area
    public static double area(double w, double h) {
        return (w * h);
    }

    //perimeter
    public static double perimeter(double w, double h) {
        return (2 * w + 2 * h);
    }

    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        double dblWidth, dblHeight;
        boolean boolStop = false;
        char charStop;

        //begin loop
        while (!boolStop) {

            //initial output and get input
            System.out.print("Enter width: ");
            dblWidth = scan.nextDouble();
            System.out.print("Enter height: ");
            dblHeight = scan.nextDouble();

            //call valid check
            if (isValid(dblWidth, dblHeight) == false) {
                System.out.println("This is an invalid rectangle");
            }
            else {
                System.out.println("This is a valid rectangle");
                System.out.println("The area is: " + area(dblWidth, dblHeight));
                System.out.println("The perimeter is: " + perimeter(dblWidth, dblHeight));
            }
            System.out.println("Do you want to enter another width and height (Y/N)? : ");
            charStop = scan.next().charAt(0);
            if (charStop == 'N' || charStop == 'n') {
                boolStop = true;
                System.out.println("Program Ends");
            }

        }
    }
}