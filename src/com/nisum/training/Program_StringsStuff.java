package com.nisum.training;

import java.util.Arrays;
import java.util.Locale;

public class Program_StringsStuff
{
    String text1 = "tAlha lis at nisum";
    String text2 = "I am concatenated";
    int num = 50;

    public static void main(String[] args)
    {
        Program_StringsStuff value = new Program_StringsStuff(); //to call methods without using static

        value.printLength();
        value.concat();
        value.specialCharacter();
        value.addNumAndString();
        value.declareArry();
        value.replace();
        value.reverse();
        value.q1();
    }

    void printLength()
    {
        System.out.println("length : " + text1.length());
        System.out.println("lowerCase : " + text1.toLowerCase());
        System.out.println("UpperCase : " + text1.toUpperCase());
        System.out.println("indexIsAt : " + text1.indexOf("z"));
    }

    void concat()
    {
        System.out.println("contact String is : " + text1.concat(text2));
    }

    void specialCharacter()
    {
        String textSpecial = "tAlha \"lis\" at \r nisum"; //carriage return
        String textSpecial1 = "tAlha \"lis\" at\b nisum"; //backspace
        String textSpecial2 = "tAlha \"lis\" at \n nisum";
        String textSpecial3 = "tAlha \"lis\" at \f nisum"; //form feed
        System.out.println("special character " + textSpecial);
        System.out.println("special character1 " + textSpecial1);
        System.out.println("special character2 " + textSpecial2);
        System.out.println("special character3 " + textSpecial3);
    }

    void addNumAndString()
    {
        int ab = 10;
        String bc = "tal";

        System.out.println("int + string " + ab+bc);
    }

    void declareArry()
    {
        String[] arr= {"talha", "nisum"};
        String arr1[]= {"talha", "nisum"};

        System.out.println("String array :" + arr.length);
        System.out.println("String array :" + arr1[1]);
    }

    void replace()
    {
        System.out.println("replace function :" + text1.replace("at", "tata"));

        char[] ch = {'n','i','s'};
        String s = new String(ch);

        String arr = "nisum";
        System.out.println("arr print :" + Arrays.toString(ch));
        System.out.println("print arr : " + s);
    }


    void reverse()
    {
        StringBuilder input = new StringBuilder();

        System.out.println("reverse function :" + text1);
    }

    void q1 ()
    { //get the character
        String str = "Java exercise";

        int index1 = str.charAt(0);

        System.out.println("blab :" + (char)(index1));

    }

    void q2 ()
    {
        //find first non repeating char in a string;

        String str1= "talha"; //jo repeat na horaha ho wo print karao.


       /* for(int i=0 ; i<str1.length(); i++)
        {
            boolean unique = true;
            for(int j=0; j<str1.length(); j++ )
            {
                if(i!=j && str1.charAt(i) ==str1.charAt(j))
                {
                    unique = true;
                }
            }
        }*/

    }

}
