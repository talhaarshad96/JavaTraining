package com.nisum.training;

import java.util.Scanner;

public class Program_ClassLoopAndDecisionMaking
{
    public static void main(String[] args)
    {
        Program_ClassLoopAndDecisionMaking myObj = new Program_ClassLoopAndDecisionMaking();

        //myObj.whileLoop();
       // myObj.doWhile();
        //myObj.WhileQs();
        //myObj.DoWhileQs();
       // myObj.forLoop();
        //myObj.forEach();
       // myObj.forQs();
        myObj.makePyramid();
        //myObj.ifElse();
        //myObj.Switch();
      //  myObj.calculatorViaSwitch();
    }

    public void calculatorViaSwitch()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("input 1");
        int n1 = input.nextInt();
        System.out.println("input 2");
        int n2 = input.nextInt();

        System.out.println("enter operator \"+\"  \"-\"  \"*\" or \"/\"");
        String operator = input.next();
        switch (operator)
        {
            case "+":
                System.out.println("sum "+ (n1+n2));
                break;
            case "-":
                System.out.println("difference "+ (n1-n2));
                break;
            case "*":
                System.out.println("multip "+ (n1*n2));
                break;
            case "/":
                System.out.println("div "+ (n1/n2));
                break;
        }
    }

    public void Switch()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        switch (n)
        {
            case 1:
                System.out.println("m");
                break;

            case 2:
                switch (n)
                {
                    case 3:
                        System.out.println("nested switch");
                        break;
                }

            default:
                System.out.println("blab");
        }
    }

    public void ifElse()
    {
       // int n=7;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n<8)
        {
            System.out.println("day is valid");
            if (n == 7) {
                System.out.println("day is sunday");
            } else if (n == 6) {
                System.out.println("day is saturday");
            } else if (n == 5) {
                System.out.println("day is friday");
            } else if (n == 4) {
                System.out.println("day is thursday");
            } else if (n == 3) {
                System.out.println("day is wednesday");
            } else if (n == 2) {
                System.out.println("day is tuesday");
            } else if (n == 1) {
                System.out.println("day is monday");
            }

        }
        else {
            System.out.println("wrong day");
        }

    }


    public void whileLoop()
    {
       // int i=5;

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        while(num>0)
        {
            num = input.nextInt();
            System.out.println(num);
            //i--;
        }
    }

    public void doWhile()
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        do
        {
            System.out.println(num);
            num = input.nextInt();
            //i--;
        }while (num>0);
    }

    public void WhileQs() //print n numbers
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;

        while(num!=10)
        {
            //num++;
            System.out.println(num);
            //num = input.nextInt();
            num++;
            sum=sum+num;
        }
        System.out.println("While sum :" + sum);
    }

    public void DoWhileQs() //print n numbers
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;

        do
        {
            //num++;
            System.out.println(num);
            //num = input.nextInt();
            num++;
            sum=sum+num;
        }while(num!=10);
        System.out.println("DoWhile sum :" + sum);
    }

    public void forLoop()
    {
        int sum =0, num = 0;

        for(int i=0; i<10;i++) //print table in reverse negative main karna.
        {
            System.out.println(2*i);
        }
    }
    //print sum of number. Eg - 50 is number; print series that makes it's sum.

    public void forQs()
    {
        int num = 5, sum= 0, i;
        for( i=0; i<=num;i++) //print series
        {
            System.out.println();
            sum=sum+i;
            //System.out.println(" series is : " + i );
        }
        System.out.println(" sum is : " + sum );

    }
    public void forEach()
    {
        //String[] str = {"a","b","c","d"};
        int[] num= {1,2,3,4,5,6,7,8,9,10};
        int sum=0;

//        for(String a : str)
//        {
//            System.out.println(a);
//        }
        for(int a : num)
        {
            sum=sum+a;
        }
        System.out.println("sum is : "+ sum);

    }

    public void makePyramid()
    {

        int num =5;

        for(int i=0;i<num;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
