package com.nisum.training;

import java.util.Arrays;

public class Program_StringsStuff
{
    String text1 = "tAlha lis at nisum";
    String text2 = "I am concatenated";
    int num = 50;

    public static void main(String[] args)
    {
        Program_StringsStuff value = new Program_StringsStuff();

//        value.printLength();
//        value.concat();
//        value.specialCharacter();
//        value.addNumAndString();
//        value.declareArry();
//        value.replace();
//        value.reverse();
       value.q1();
       // value.q2();
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
        StringBuilder input = new StringBuilder("talha");


        System.out.println("reverse function :" + input.reverse());
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

        String str1= "talhal"; //jo repeat na horaha ho wo print karao.

//inner loop works like if i=0, and the inner one is j=0 till the condition of j ends, "j" will
        //iterate completely first and then the second index of "i" loop with run and "j" will run
        //again completely.

        for(int i=0 ; i<str1.length(); i++)
        {
            boolean foundChar = true;
            for(int j=0; j<str1.length(); j++ )
            {
                if(i!=j && str1.charAt(i) ==str1.charAt(j)) //doing i!=j because if i and j both are 0 then they will match on same index which we do not want.
                {                       //also checking the found condition which is false for us.
                    foundChar = false;
                    System.out.println("here i is " + i + " and j is : " + j + " found :" + str1.charAt(i));
                }System.out.println("out of if here i is " + i + " and j is : " + j);

            }
            if (foundChar) {
                System.out.println("first non repeated char is: " + str1.charAt(i));
            }
        }

    }

}
