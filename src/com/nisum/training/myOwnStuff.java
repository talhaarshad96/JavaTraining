package com.nisum.training;

class myOwnStuff
{
        public static void main(String[] args)
        {
            String s = new String("RR");
            s = null;

            //now if I want to clear the Class garbage collector I need to call Class object.
            myOwnStuff s1 = new myOwnStuff();
            s1=null;


            // Requesting JVM to call Garbage Collector method
            System.gc();
            System.out.println("Main Completes");
        }

        // Here overriding finalize method
        public void finalize()
        {
            System.out.println("finalize method overriden");
        }
}
