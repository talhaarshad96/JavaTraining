package com.nisum.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;

public class Assignment_File_IO
{
    public static void main(String[] args)
    {
        Assignment_File_IO obj = new Assignment_File_IO();

        obj.Author();
//        obj.Ans1();
//        obj.Ans2();
//        obj.Ans3();
//        obj.Ans4();
//        obj.Ans5();
//        obj.Ans6();
//        obj.Ans7();
//        obj.Ans8();
//        obj.Ans9();
//        obj.Ans10();
//        obj.Ans11(); //baaqi
    }

    public void Author()
    {
        System.out.println("\n\t\tCreated by Talha.\n     \tTopic: File I/O\n");
    }
//
    public void Ans1()
    {
        System.out.println("\tAnswer 1\n");
    }

    public void Ans2()
    {
        System.out.println("\tAnswer 2\n");

        try
        {
            File fileObj = new File("talhaFile.txt");
            boolean exists = fileObj.exists();
            if(exists)
            {
                System.out.println("File exists");
            }
            else
            {
                System.out.println("File doesn't exist");
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Ans3()
    {//check if file exists, if not then create it, then check read/write permissions
        System.out.println("\tAnswer 3\n");

        try
        {
            File fileObj = new File("talhaFile.txt");
            boolean exists = fileObj.exists();
            if(exists)
            {
                System.out.println("File exists");
                System.out.println("File is Writeable: " + fileObj.canWrite());
                System.out.println("File is Readable " + fileObj.canRead());
            }
            else
            {
                System.out.println("File doesn't exist, creating new file");
                fileObj.createNewFile();
                System.out.println("File is Writeable: " + fileObj.canWrite());
                System.out.println("File is Readable " + fileObj.canRead());
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Ans4()
    {//check directory or file
        System.out.println("\tAnswer 4\n");

        try
        {
            File fileObj = new File("talhaFile.txt");
            boolean exists = fileObj.exists();
            if(exists)
            {
                System.out.println("File exists");
                if(fileObj.isFile())
                {
                    System.out.println("Pathname is a File");
                }
                else if(fileObj.isDirectory())
                {
                    System.out.println("Pathname is a Directory");
                }
            }
            else
            {
                System.out.println("File or Pathname doesn't exist");
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Ans5()
    {//check file exist, if not -create, get the last modified time.
        System.out.println("\tAnswer 5\n");

        try
        {
            File fileObj = new File("talhaFile.txt");
            boolean exists = fileObj.exists();
            if(exists)
            {
                System.out.println("File exists");
            }
            else
            {
                System.out.println("File doesn't exist, creating new file");
                fileObj.createNewFile();
            }
            Date fileModifiedTime = new Date(fileObj.lastModified());
            System.out.println("Last modified time for the file : '"+ fileObj.getName() + "' is " + fileModifiedTime);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //read file content line by line
    public void Ans6()
    {
        System.out.println("\tAnswer 6\n");

        try
        {
            File fileObj = new File("talhaFile.txt");
            Scanner reader = new Scanner(fileObj);
            while (reader.hasNextLine())
            {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Append text to existing file
    public void Ans7()
    {
        System.out.println("\tAnswer 7\n");

        try
        {
            File fileObj = new File("talhaFile.txt");
            boolean exists = fileObj.exists();
            if(exists)
            {
                System.out.println("File exists");
            }
            else
            {
                System.out.println("File doesn't exist, creating new file");
                fileObj.createNewFile();
            }
            FileWriter myWriter = new FileWriter("talhaFile.txt",true);
            myWriter.write("\nI have appended");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Ans8()
    { //read first 3 lines
        System.out.println("\tAnswer 8\n");

        int counter=0;
        try
        {
            File fileObj = new File("talhaFile.txt");
            Scanner reader = new Scanner(fileObj);
            while (counter!=3)//reader.hasNextLine()
            {
                String data = reader.nextLine();
                System.out.println(data);
                counter++;
            }
            reader.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void Ans9()
    {//find longest word in a file
        System.out.println("\tAnswer 9\n");

        int prevLen=0; String LongestWord="";
        try
        {
            File fileObj = new File("talhaFile.txt");
            Scanner reader = new Scanner(fileObj);
            while (reader.hasNextLine())
            {
                String data = reader.next();
                if(data.length() > prevLen) //i = 1 prev, am = 2 next;
                {
                    prevLen = data.length();
                    LongestWord = data;
                }
//                System.out.println("ada" +prevLen); //prints length of all words in file.
            }
            System.out.println("Longest word in the file is : " +LongestWord);
            reader.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void Ans10()
    {//character appeared in the file count. take input from command line for character.
        //do this by comparing the index and if found then increment the counterChar
        System.out.println("\tAnswer 10\n");

        int charCount=0; char characters;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a character: ");
        char myChar = input.next().charAt(0);

        try
        {
            File fileObj = new File("talhaFile.txt");
            Scanner reader = new Scanner(fileObj);
            while (reader.hasNextLine())
            {
                String data = reader.next();
                //System.out.println(data);
                for (int i = 0; i < data.length(); ++i)
                {
                    characters = data.charAt(i);
                    //System.out.println("characters : "+ characters);
                    if (myChar==characters)
                    {
                        charCount++;
                    }
                }
            }
            System.out.println("Character count for the character : '"+myChar+"' is "+charCount);
            reader.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void Ans11()
    {
        System.out.println("\tAnswer 11\n");
    }
}
