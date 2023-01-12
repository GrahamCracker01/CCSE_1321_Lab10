//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab10A {

    //minimum method
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    //maximum method
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    //average method
    public static int average(int a, int b) {
        return (((a + b)) / 2);
    }

    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intFirst, intSecond;

        //initial output and get input
        System.out.print("Enter number 1: ");
        intFirst = scan.nextInt();
        System.out.print("Enter number 2: ");
        intSecond = scan.nextInt();

        //final output calling methods
        System.out.println("Min is " + min(intFirst, intSecond));
        System.out.println("Max is " + max(intFirst, intSecond));
        System.out.println("Average is " + average(intFirst, intSecond));

    }
}