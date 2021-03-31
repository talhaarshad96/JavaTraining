package com.nisum.training;

public class Class_ArrayStuff //31st mar'21
{
    public static void main(String[] args)
    {
        Class_ArrayStuff cArr = new Class_ArrayStuff();

//        int num=5;
//        int rem=num%3;
//        System.out.println("rem" +rem);
        //cArr.arr();
        cArr.revArr();
    }

    public void arr()
    {
        int arr[]={1,2,3,4};

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void revArr() //kro ye
    {
        //int arrRev [] = {1,2,3};
        //String arr[]={"talha", "arshad"};
        String str = "hello,nisum";
        String reverse;

        for(int i= str.length()-1;i>=0;i--)
        {
            System.out.println(str.toCharArray());
        }
    }
}
