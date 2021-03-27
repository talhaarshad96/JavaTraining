package com.nisum.training;

import javax.swing.text.html.parser.TagElement;

public class Assignment_OOP_Java
{
    public static void main(String[] args)
    {
        Author();
        System.out.println("\tAnswer 1\n");

        //Assignment_OOP_Java myObj = new Assignment_OOP_Java();
        AccountBalance accBal = new AccountBalance();

        accBal.setAccTitle("Talha");
        accBal.setAccBalance(-100);

        System.out.println("Account Title is : "+ accBal.getAccTitle() +" Balance is : "+ accBal.getAccBalance());

        System.out.println("\n\n\tAnswer 2\n");

        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();

        parent.Pprint();
        child.Cprint();
        child.Pprint();

        System.out.println("\n\n\tAnswer 3\n");

        Employee emp = new Employee("Talha Emp",25,+923312549399L,"FB area block 13",20,"Automation Engineer");
        Manager mng = new Manager("Talha Manager",25,+923312549399L,"FB area block 13",90,"QA");

        emp.EmpInformation();
        mng.MngInformation();

    }

    public static void Author()
    {
        System.out.println("\n\t\tCreated by Talha.\n     \tTopic: Ad-Java-OOP\n");
    }
}

//For answer 1
class AccountBalance
{
    int accBalance;
    String accTitle;

    public int getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(int accBalance)
    {
        try
        {
            if(accBalance>0)
            {
                this.accBalance = accBalance;
            }
            else{
                throw new ArithmeticException("Invalid Account Balance");
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public String getAccTitle() {
        return accTitle;
    }

    public void setAccTitle(String accTitle) {
        this.accTitle = accTitle;
    }

}

//For Answer 2
class ParentClass
{

    public void Pprint()
    {
        System.out.println("This is Parent Class");
    }
}

class ChildClass extends ParentClass
{

    public void Cprint()
    {
        System.out.println("This is Child Class");
    }
}

class Member
{
    String name;
    int age;
    long phoneNum;
    String address;
    int salary;

    Member(String name,int age,long phoneNum, String address, int salary)
    {
        this.name=name;
        this.age= age;
        this.phoneNum=phoneNum;
        this.address=address;
        this.salary=salary;
    }

    public int printSalary()
    {
       // System.out.println("Salary is: "+salary);
        return salary;
    }
}

class Employee extends Member
{
    String specialization;

    Employee(String name, int age, long phoneNum, String address, int salary,String specialization)
    {
        super(name, age, phoneNum, address, salary);
        this.specialization=specialization;
    }

    public void EmpInformation()
    {
        System.out.println("Name: "+name+" Age :"+age+" phoneNum : "+phoneNum+" Address: "+address+ " Salary is : "+printSalary() + " Specialization is : "+specialization);
    }
}

class Manager extends Member
{
    String department;

    Manager(String name, int age, long phoneNum, String address, int salary,String department)
    {
        super(name, age, phoneNum, address, salary);
        this.department=department;

    }

    public void MngInformation()
    {
        System.out.println("Name: "+name+" Age :"+age+" phoneNum : "+phoneNum+" Address: "+address+ " Salary is : "+printSalary() + " Department is : "+department);
    }
}
