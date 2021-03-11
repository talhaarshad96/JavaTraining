package com.nisum.training;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.math.BigDecimal;
import java.util.Scanner;

public class Program_Assignment1 {
    public static void main(String[] args)
    {
      /*  String arr[];
        float arr1[];

        float myFloat = 10.0F;
        double myDouble = 100.0;
        long myLong = 100;
        char myChar = 'T';
        boolean myBoolean = true;
        String bla = "1";

        System.out.println(300 + bla + 11 + bla);

        System.out.println(myBoolean + " " + myChar + " " + myDouble + " " + myFloat);
        System.out.println("Hey");*/

        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        fibonacci(10);
    }

    public static int fibonacci(int fibo)
    {
        System.out.println("\nfibo");
        int num1 = 0, num2= 1;

        for(int i =0; i<fibo; i++)
        {
            System.out.print(" " + num1);

            int sum=num1 + num2;
            num1 = num2;
            num2=sum;
        }

        return fibo;
    }

    public static void q1()
    {
        System.out.println("Ans # 1");
        System.out.println("Talha");
        System.out.println("Alexandra");
    }

    public static void q2()
    {
        System.out.println("\nAns # 2");
        int a = 50, b = 3;
        System.out.println(a / b);
    }

    public static void q3()
    {
        System.out.println("\nAns # 3");
        int a = -5, b = 8, c = 6, d = 55, e = 9, f = 9, g = 20, h = -3, i = 5, j = 8, k = 5, l = 15, m = 3, n = 2, o = -8, p = 3;

        System.out.println("part a : " + (a + b * c));
        System.out.println("part b : " + ((d + f) % f));
        System.out.println("part c : " + (g + h * i / j));
        System.out.println("part d : " + (k + (l / m) * n + o % p));
    }

    public static void q4()
    {
        System.out.println("\nAns # 4");
        float km_meter = 1000;
        double km_feet = 3280.8399;
        double km_inch = 39370.078;
        double km_cm = 100000;
        double distance_City = 50; //This is input taken in kilometer.

        System.out.println("Distance of the City in - Meters is :" + distance_City*km_meter);
        System.out.println("Distance of the City in - Feet is :" + distance_City*km_feet);
        System.out.println("Distance of the City in - Inches is :" + distance_City*39370.078);
        System.out.println("Distance of the City in - Centimeter is :" + distance_City*km_cm);
    }

    public static void q5()
    {
        System.out.println("\nAns # 5");
        int subj1 = 50, subj2 = 55, subj3 = 65,subj4 = 45,subj5 = 35;

        System.out.println (" THE ANSWER IS THE VALUES INITIALIZED IN THE VARIABLE ABOVE SINCE (markObtained / 100 ) * 100");
    }

    public static void q6()
    {
        System.out.println("\nAns # 6");
        //f a five-digit number is input through the keyboard, Write an algorithm and draw a
        // flowchart to calculate the sum of its digits.

        int input =12345, rem=0,sum=0, div;

        rem = input%10;
        sum = sum+rem;
        div=input/10;

        rem= div%10;
        sum = sum+rem;
        div=div/10;

        rem= div%10;
        sum = sum+rem;
        div=div/10;

        rem= div%10;
        sum = sum+rem;
        div=div/10;

        rem= div%10;
        sum = sum+rem;
        div=div/10;


        System.out.println(sum);

    }

     public static void q7()
     {
         System.out.println("\nAns # 7");
         int num = 54115;

         int sec;
         int temp;
         temp= num%10;
         sec=num/10000;
         System.out.println(temp +sec);
     }

    public static void q8()
    {
        System.out.println("\nAns # 8");
        int a=25, b=5;

        System.out.println(a*b);
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
}
