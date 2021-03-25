package com.nisum.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program_ClassFile_IO
{
    public static void main(String[] args)
    {
        Program_ClassFile_IO ob = new Program_ClassFile_IO();

        ob.Author();
        ob.createFile();
        ob.WriteToFile();
        ob.ReadFromFile();
        ob.DeleteFile();
        ob.getFileInfo();
    }

    public void Author()
    {
        System.out.println("created by Talha.\n");
    }

    public void getFileInfo()
    {

        File myObj = new File("talhaFile.txt");
        if (myObj.exists())
        {
            System.out.println("file name : " +myObj.getName());
            System.out.println("file isWritable? : " +myObj.canWrite());
            System.out.println("file path : " +myObj.getAbsolutePath());
            System.out.println("file size in bytes : " +myObj.length());
        }
        else
        {
            System.out.println("file not exists");
        }
    }

    public void DeleteFile()
    {
        try {
            File myObj = new File("talhaFile.txt");

            if(myObj.isFile())
            {
                System.out.println("file exists, now deleting");
                myObj.delete();
                System.out.println("file deleted" +myObj.getName());
            }
            else {
                System.out.println("file doesn't exists");
            }
        } catch (Exception e) {
            System.out.println("error occured");
            e.printStackTrace();
        }
    }

    public void ReadFromFile()
    {
        try
        {
            File reader = new File("talhaFile.txt");
            Scanner myReader = new Scanner(reader);

            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine(); //next() works by reading word by word and nextLine() reads full string
                System.out.println(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("error occured");
            e.printStackTrace();
        }

    }

    public void WriteToFile()
    {
        try
        {
            FileWriter myWriter = new FileWriter("talhaFile.txt");
            myWriter.write(("file writing is difficult \n Next line was really difficult"));
            myWriter.close();
            System.out.println("successfully written");


        }
        catch (IOException e)
        {
            System.out.println("error occured");
            e.printStackTrace();
        }
    }

    public void createFile()
    {
        try
        {
            File myObj = new File("talhaFile.txt");

            if (myObj.createNewFile())
            {
                System.out.println("File created :" + myObj.getName());
            }
            else
                {
                System.out.println("file already existss");
            }
        }
        catch (IOException e)
        {
            System.out.println("error occured");
            e.printStackTrace();
        }
    }

}
