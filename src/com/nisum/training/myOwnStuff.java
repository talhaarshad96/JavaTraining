package com.nisum.training;

class myOwnStuff
{
        public static void main(String[] args)
        {
            /*String s = new String("RR");
            s = null;

            //now if I want to clear the Class garbage collector I need to call Class object.
            myOwnStuff s1 = new myOwnStuff();
            s1=null;


            // Requesting JVM to call Garbage Collector method
            System.gc();
            System.out.println("Main Completes");*/

            numbers(1);
        }

        // Here overriding finalize method
        public void finalize()
        {
            System.out.println("finalize method overriden");
        }


    public static void numbers(int n)
    {
        if (n <= 10)
        {
            System.out.println(n);
            numbers(n + 1);
            //System.out.println(n);

        }
    }
}
