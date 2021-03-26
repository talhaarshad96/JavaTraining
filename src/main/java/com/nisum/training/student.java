package com.nisum.training;

public class student
{ //lombok dependency
    private String name;
    private int rollnum;
    private int marks;

    public int getRollnum() {
        return rollnum;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks)
    {
        try
        {
            if(marks>0)
            {
                this.marks = marks;
                System.out.println("Good");
            }
            else{
                throw new ArithmeticException("Invalid");
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


}
