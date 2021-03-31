package com.nisum.training;

public class Assignment2_OOP
{
    public static void main(String[] args)
    {
        Author();
        Account acc = new Saving(0);

        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(600);
        System.out.println("\n");

        Account curr = new Current(0);

        curr.deposit(1000);
        curr.withdraw(500);
        curr.withdraw(600);
        System.out.println("\n");

        Account OD = new OverDraft(0);

        OD.deposit(500);
        OD.withdraw(500);
        OD.withdraw(600);
    }

    public static void Author()
    {
        System.out.println("\n\t\tCreated by Talha.\n     \tTopic: Ad-Java-OOP_Assignment2\n");
    }
}
abstract class  Account
{
    int totalBal = 0;
    public int getTotalBal()
    {
        return totalBal;
    }

    public void setTotalBal(int totalBal)
    {
        this.totalBal = totalBal;
    }

    public Account(int totalBal)
    {
        this.totalBal = totalBal;
    }
    public abstract void deposit(int amount);

    public abstract void withdraw(int amount);
}

class Current extends Account
{
    public Current(int totalBal)
    {
        super(totalBal);
    }

    @Override
    public void deposit(int amount)
    {
        System.out.println("Amount dep in CurrAcc : " + amount );
        setTotalBal( getTotalBal() + amount);
        System.out.println("Total Amount in CurrAcc : " + getTotalBal() );
    }

    @Override
    public void withdraw(int amount)
    {
        if(getTotalBal() < amount)
        {
            System.out.println("Withdraw from Overdraft");
            Account ac = new OverDraft(getTotalBal());
            ac.withdraw(amount);
        }else
        {
            System.out.println("Amount Withdraw from CurrAcc : " + amount);
            setTotalBal(getTotalBal() - amount);
            System.out.println("Amount After Withdraw from Curr: " + getTotalBal());
        }
    }
}

class Saving extends Account
{
    public Saving(int totalBal)
    {
        super(totalBal);
    }

    @Override
    public void deposit(int amount)
    {
        System.out.println("Amount dep in SavAcc : " + amount );
        setTotalBal( getTotalBal() + amount);
        System.out.println("Total Amount in SavAcc : " + getTotalBal());
    }

    @Override
    public void withdraw(int amount)
    {

        if(getTotalBal() < amount)
        {
            System.out.println("Deducted from Overdraft");
            Account ac = new OverDraft(getTotalBal());
            ac.withdraw(amount);
        }else
        {
            System.out.println("Amount Withdraw from SavAcc : " + amount);
            setTotalBal(getTotalBal() - amount);
            System.out.println("Amount After Withdraw from Sav : " + getTotalBal());
        }
    }
}

class OverDraft extends Account
{
    final int SOME_LIMIT = -2000;
    public OverDraft(int totalBal)
    {
        super(totalBal);
    }

    @Override
    public void deposit(int amount)
    {
        System.out.println("Amount dep in OD : " + amount );
        setTotalBal( getTotalBal() + amount);
        System.out.println("Total Amount in OD : " + getTotalBal() );
    }

    @Override
    public void withdraw(int amount)
    {
        int amnt  = getTotalBal() - amount;

        if(getTotalBal() < 0 && amnt < SOME_LIMIT)
        {
            System.out.println("Readed Limit, !Withdraw");
        }else
        {
            System.out.println("Amount Withdraw from OD : " + amount );
            setTotalBal( getTotalBal() - amount);
            System.out.println("Amount After Withdraw from OD : " + getTotalBal() );
        }
    }
}