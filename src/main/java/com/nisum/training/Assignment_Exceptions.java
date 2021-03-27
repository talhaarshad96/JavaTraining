package com.nisum.training;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_Exceptions
{
    public static void main(String[] args) throws FileNotFoundException {
        Assignment_Exceptions asExp = new Assignment_Exceptions();

        asExp.Author();
//        asExp.Ans1();
//        asExp.Ans2();
//        asExp.Ans3();
//        asExp.Ans4();
//        asExp.Ans5();
//        asExp.Ans6();
//        asExp.Ans7();
//        asExp.Ans8();
//        asExp.Ans9();
    }

    public void Author()
    {
        System.out.println("\n\t\tCreated by Talha.\n     \tTopic: Exceptions\n");
    }

    public void Ans1()
    {
        System.out.println("\tAnswer 1\n");

        System.out.println("A- java.lang.Exception class is the parent class of Exceptions\n");
        System.out.println("B- An Error \"indicates serious problems that a reasonable application should not try to catch.\" \nAn Exception \"indicates conditions that a reasonable application might want to catch.\" \nErrors mostly occur at runtime that's they belong to an unchecked type. Exceptions are the problems which can occur at runtime and compile time.\n It mainly occurs in the code written by the developers.\n");
        System.out.println("C- Exceptions are events that occur during the execution of programs that disrupt the normal flow of instructions (e.g. divide by zero, array access out of bound, etc.).");
    }

    public void Ans2()
    {
        System.out.println("\tAnswer 2\n");

        System.out.println("@Throwable\n\t*Error\n\t   -AssertionError\n\t   -LinkageError");
        System.out.println("          \n\t*Exception\n\t   -NullPointerException\n\t   -NegativeArraySizeException");
        System.out.println("            \n\t+RuntimeException\n\t    -ArithmeticException\n\t    -IndexOutOfBoundException");
    }

    public void Ans3()
    {
        System.out.println("\tAnswer 3\n");

        System.out.println("Case 1- only S3 will run in this case");
        System.out.println("Case 2- S2 will be executed and then S3 will be executed.");
    }

    public void Ans4()
    {
        System.out.println("\tAnswer 4\n");

        String line, name;
        double qualityPoints;
        int semHours;
        double gpa;

        try
        {
            File reader = new File("student.dat");
            Scanner scanner = new Scanner(reader);

            File writerTo = new File("warning.dat");
            FileWriter writer = new FileWriter(writerTo);

            writer.write("\tAcademic Warning Students List.\n");

            while (scanner.hasNextLine())
            {
                line = scanner.nextLine();
                String[] data = line.split(" ");

                name = data[0]; //hasName
                semHours = Integer.parseInt(data[1]); //Semester hours
                qualityPoints = Double.parseDouble(data[2]); // //Quality Points
                gpa = qualityPoints / semHours;

                if (gpa < 2.0)
                {
                    System.out.println(name+" gpa is "+gpa);
                    writer.write(line + "\n");
                }
            }
            writer.close();
        } catch (FileNotFoundException exception)
        {
            System.out.println("File !Found.");
        } catch (IOException exception)
        {
            System.out.println("Exception Occured");
        } catch (NumberFormatException e)
        {
            System.out.println("Format error in input file: " + e);
        }
    }


    public void Ans5()
    {
        System.out.println("\tAnswer 5\n");

        try {
            int[] myNumbers = {1, 2, 3, 4, 5, 6, 7};
            System.out.println(myNumbers[9]);
        }
        catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println("Element 9 does not exist");
        }
    }

    public void Ans6()
    {
        System.out.println("\tAnswer 6\n");

        try
        {
            Scanner input = new Scanner(System.in);
            int enter = input.nextInt();

            System.out.println(enter);
        } catch (InputMismatchException e)
        {
            //e.printStackTrace();
            System.out.println("Error! Invalid Input. Try again.");
        }
    }

    public void Ans7()
    {
        System.out.println("\tAnswer 7\n");

        try
        {
            File fileObj = new File("talhaFile123.txt");
            Scanner reader = new Scanner(fileObj);

            while (reader.hasNextLine())
            {
                String data = reader.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e)
        {
            //e.printStackTrace();
            System.out.println("Error! File not Found!.");
        }
    }

    public void Ans8()
    {
        System.out.println("\tAnswer 8\n");
        //uncomment the folllowing Code before running the code

        /*BufferedReader reader = new BufferedReader(new FileReader("tal.txt")); //add throws exception to fix this FileNotFOund
        try {

            while (reader.readLine() != null)
            {

                System.out.println(reader.readLine());
            }

        } catch (IOException e)
        {
            System.out.println("This is an Exception");

        }*/ //uncomment till here
    }

    void ArrayIndexOutOfBound()
    {
        try {
            int[] myNumbers = {1, 2, 3, 4, 5, 6, 7};
            System.out.println(myNumbers[9]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            //e.printStackTrace();
            System.out.println("Element 9 does not exist\n");
        }
    }

    void ArithmeticException(){
        try{
            int data=100/0;
        } catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code...\n");
    }

    void NullPointerException()
    {
        try{
            String str = null;

            System.out.println(str.length());
        } catch(NullPointerException e)
        {
            System.out.println(e);
        }
        System.out.println("Null Exception..\n");
    }

    void NumberFormatException()
    {
        try
        {
            String str = "abc";
            int i = Integer.parseInt(str);

        } catch(Exception e)
        {
            System.out.println(e);
        }
    }

    void NegativeArraySizeException()
    {
        try {
            int[] myNumbers = {1, 2, 3, 4, 5, 6, 7};
            System.out.println(myNumbers[-1]);
        }
        catch (NegativeArraySizeException e)
        {
            e.printStackTrace();
        }
    }

    public void Ans9()
    {
        System.out.println("\tAnswer 7\n");

        ArithmeticException();
        ArrayIndexOutOfBound();
        NullPointerException();
        NumberFormatException();
        NegativeArraySizeException();;
    }
}
