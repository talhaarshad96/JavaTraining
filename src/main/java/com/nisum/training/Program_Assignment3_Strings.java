package com.nisum.training;

public class Program_Assignment3_Strings
{


    public static void main(String[] args)
    {
        Program_Assignment3_Strings myObject = new Program_Assignment3_Strings();
        myObject.Author();
        myObject.Ans1();
        myObject.Ans2();
        myObject.Ans3();
        myObject.Ans4();
        myObject.Ans5();
        myObject.Ans6();
        myObject.Ans7();
        myObject.Ans8();
        myObject.Ans9();
        myObject.Ans10();
    }

    public void Author()
    {
        System.out.println("\n        Assignment is done by Talha Arshad.\n");
    }

    public void Ans1()
    {
        System.out.println("Answer 1");

        String str = "String Assignment";

        int index1 = str.charAt(7);

        System.out.println("Char at Given Index :" + (char)(index1));
    }

    public void Ans2()
    {
        System.out.println("\nAnswer 2");

        String str1 = "talha";
        String str2 = "tal";

        boolean contains = str1.contains(str2);
        System.out.println("contains : " + contains);

    }

    public void Ans3()
    {
        System.out.println("\nAnswer 3");

        String str1 = "talha";
        String str2 = "tal";

        System.out.println("ContentEquals : " + str1.contentEquals(str2));//contentEquals entertains all kind of String Objects, i.e. StringBuilder, StringBuffer etc
    }

    public void Ans4()
    {
        System.out.println("\nAnswer 4");

        String str1 = "talha";
        String str2 = "talha";

        System.out.println("Equals : " + str1.equals(str2)); //String Equals only entertains String type of objects.
    }

    public void Ans5()
    {
        System.out.println("\nAnswer 5");

        String str1 = "This is orange juice";
        String strToFind = "orange";

        boolean exists = str1.contains(strToFind);

        System.out.println("The substring \"orange\" exists :" + exists);
    }

    public void Ans6()
    {
        System.out.println("\nAnswer 6");

        String str1 = "Hello, World";

        System.out.println("first occurance of \"o\" " + str1.indexOf("o"));
        System.out.println("first occurance of \",\" " + str1.indexOf(","));
        System.out.println("last occurance of \"o\" " + str1.lastIndexOf("o"));
    }

    public void Ans7()
    {
        System.out.println("\nAnswer 7");

        String str = "123";
        boolean isDigits;

        if (str.matches("[0-9]+"))
        {
            isDigits=true;
        }
        else
            {
            isDigits=false;
        }
        System.out.println("String Contains only digits : " + isDigits);
    }

    public void Ans8()
    {
        System.out.println("\nAnswer 8");

        String str1 = "talha";
        String str2 = "lh";

        boolean contains = str1.contains(str2);
        System.out.println("contains : " + contains);
    }

    public void Ans9()
    {
        System.out.println("\nAnswer 9");

        StringBuilder input = new StringBuilder("talha");
        System.out.println("String Reversal : " + input.reverse());
    }

    public void Ans10()
    {
        System.out.println("\nAnswer 10");

        String str = "tal,ha,Ars,had";
        String[] splitted = str.split(",");

        for (String a : splitted)
        System.out.println("String Split : " + a);
    }
}
