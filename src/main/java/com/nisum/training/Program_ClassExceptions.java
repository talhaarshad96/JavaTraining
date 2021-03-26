package com.nisum.training;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Program_ClassExceptions
{
    public static void main(String[] args)
    {
        Program_ClassExceptions obj = new Program_ClassExceptions();

        //obj.ArithmaticExp();
       // obj.printCustomMessage();
       // obj.resolveExp();
      //  obj.NullPointerExp();
        //obj.NUmberFormatExp();
//        obj.arrQs();
//        obj.finallyStatement();
       // obj.NUmberFormatExp();
//        validate(11);
//        System.out.println("rest of code");
        obj.FileNotFoundExp();
    }

    //ArrayIndexOutOfBound ye hoti hay k string str - 10 hay and we are fiding out the 11th one.
    //koi aisa index call karwao jo array main mojood na ho.

    public void FileNotFoundExp()
    {
        PrintWriter pw ;

        try{
            pw= new PrintWriter("tal.txt");
            pw.println("saved");
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }

    public static void validate(int age)
    {
        if (age<15)
        {
            throw new ArithmeticException("not valid");
        }
        else
            System.out.println("can vote");
    }

    public void finallyStatement()
    {
        try
        {
            int [] num = {1,2,3};
            System.out.println("wut" +num[10]);
        } catch (Exception e)
        {
            System.out.println("something wrong");
        } finally {
            System.out.println("finally block");
        }
    }

    public void arrQs()
    {
        String[] str = {"t", "a"};

        try{
            System.out.println(str[5]);
        } catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("exception is "+ ex.getMessage());

        }

    }

    public void NUmberFormatExp()
    {
        String s = "abc";

        int i = Integer.parseInt(s);

        System.out.println(i);
    }

    public void NullPointerExp()
    {
        String s=null;

        System.out.println(s.length());
    }

    //public void ArithmaticExp()
    {

    }

    public void printE()
    {
        try
        {
            int data=100/0;
        } catch (ArithmeticException e)
        {
            System.out.println("rest of code");
        }

    }

    public void printCustomMessage()
    {
        try
        {
            int data=50/0;
        } catch (Exception e)
        {
            System.out.println("cant divide");
        }
    }

    public void resolveExp()
    {
       int i=50,j=0, data;

       try
       {
           data=i/j;
       } catch (Exception e) {
           System.out.println(e);
           System.out.println(i/(j+2));
       }
    }

    public void catchBlock()
    {

    }
}
