package com.nisum.training;

public class Program_Assignment2
{
    public static void main(String[] args)
    {
        q9();
        q10(2, 3);
        q11(3,4);
        int total=q12(5,3);
        System.out.println(total);

        double inchToMeter=q13(1000.0);
        System.out.println(inchToMeter);

    }

    public static void q9()
    {
        System.out.println("\nAns # 9");

        int sum=0, product=0, subtraction = 0, division =0, remainder = 0, num1 = 125, num2 = 24;
        sum= num1+num2;
        product = num1*num2;
        subtraction = num1-num2;
        division = num1/num2;
        remainder = num1%num2;
        System.out.println("Sum : "+ sum +" Product : "+ product +" Subtraction : "+ subtraction+" Division : "+ division+" Remainder : "+ remainder);

    }

    public static void q10(int ab, int cd)
    {
        System.out.println("\nAns # 10");
    }

    public static int q11(int ab, int cd)
    {
        System.out.println("\nAns # 11");

        return ab*cd;
    }

    public static int q12(int ab, int cd)
    {
        System.out.println("\nAns # 12");
        int sum = 0;
        sum=ab+cd;

        return sum;
    }

    public static double q13(double inch)
    {
        //Write a Java program that reads a number in inches, converts it to meters.
        //Note: One inch is 0.0254 meter.
        //Test Data
        //Input a value for inch: 1000
        //Expected Output :
        //1000.0 inch is 25.4 meters
        System.out.println("\nAns # 13");
        double Meters = 0.0254;


        return inch*Meters;
    }
}
