package com.nisum.training;

public class myOwnStuff
{
    static int plusMethod(int x,int y)
    {
        return x+y;
    }
}
class Main
{
    static int plusMethod(int x,int y)
    {
        return x+y;
    }
    public static void main(String[] args)
    {
        int myNum1 = plusMethod(8,5);
        myOwnStuff m2 = new myOwnStuff();
        Main m1 = new Main();
        int myNum2 = m1.plusMethod(1,3);
        int myNum3 = m2.plusMethod(2,3);
        System.out.println(myNum1);
        System.out.println(myNum2);
        System.out.println(myNum3);
    }
}
//        public static void main(String[] args)
//        {
//            /*String s = new String("RR");
//            s = null;
//
//            //now if I want to clear the Class garbage collector I need to call Class object.
//            myOwnStuff s1 = new myOwnStuff();
//            s1=null;
//
//
//            // Requesting JVM to call Garbage Collector method
//            System.gc();
//            System.out.println("Main Completes");*/
//
//            numbers(1);
//        }
//
//        // Here overriding finalize method
//        public void finalize()
//        {
//            System.out.println("finalize method overriden");
//        }
//
//
//    public static void numbers(int n)
//    {
//        if (n <= 10)
//        {
//            System.out.println(n);
//            numbers(n + 1);
//            //System.out.println(n);
//
//        }
//    }
//}
