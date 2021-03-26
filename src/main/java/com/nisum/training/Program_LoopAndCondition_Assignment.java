package com.nisum.training;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program_LoopAndCondition_Assignment
{
    public static void main(String[] args) throws ParseException
    {
        Program_LoopAndCondition_Assignment myObect = new Program_LoopAndCondition_Assignment();

        myObect.Author();
        //myObect.Answer1();
        //myObect.Answer2();
        //myObect.Answer3();
        //myObect.Answer4();
        //myObect.Answer5();
        //myObect.Answer6();
        //myObect.Answer7();
        //myObect.Answer8();
        //myObect.Answer9();
        //myObect.Answer10();
        //myObect.Answer11();
        //myObect.Answer12();
        //myObect.Answer13();
        //myObect.Answer14();
    }


    public void Author()
    {
        System.out.println("\n\t\tCreated by Talha.\n     \tTopic: Desion Making & Loops\n");
    }

    public void Answer1()
    {
        System.out.println("\tAnswer 1\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Ramesh's Basic Salary");
        int baseSalary = input.nextInt();
        double dearnessAllowance = baseSalary * 0.4;
        double rentAllowance = baseSalary * 0.2;
        double grossSalary = baseSalary + dearnessAllowance + rentAllowance;

        System.out.println(" Ramesh's Gross Salary is : " + grossSalary);
    }

    public void Answer2()
    {
        System.out.println("\tAnswer 2\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount to be withdrawn in hundred's");
        int amountToBeWithdrawn = input.nextInt();

        System.out.println(amountToBeWithdrawn / 100 * 100);
    }

    public void Answer3()
    {
        System.out.println("\tAnswer 3");

        int countCar=0, countBus=0, countBike=0, countOtherVehicles=0, vehicleOption;
        Scanner input = new Scanner(System.in);

        for(int vehicles = 1 ; vehicles <7 ; vehicles++)
        {
            System.out.println("Choose what kind of vehicle it is : ");
            System.out.println("1. Car");
            System.out.println("2. Bus");
            System.out.println("3. Bike");
            System.out.println("4. Any Other");
            vehicleOption = input.nextInt();

            switch (vehicleOption)
            {
                case 1:
                    countCar++;
                    break;
                case 2:
                    countBus++;
                    break;
                case 3:
                    countBike++;
                    break;
                case 4:
                    countOtherVehicles++;
                    break;
                default:
                    System.out.println("invalid option chosen");
                    break;
            }
        }
        System.out.println("Car count : "+countCar);
        System.out.println("Bus count : "+countBus);
        System.out.println("Bike count : "+countBike);
        System.out.println("Other Vehicle count : "+countOtherVehicles);
    }


    public void Answer4()
    {//string taken as input to take the length and converted back to int to get the first_digit
        System.out.println("\tAnswer 4");

        int Stock=5000;
        int totalCount=0, cdCount=0,dvdCount=0,videoCount=0,bookCount=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 5 digit code:");

        for(int i=0;i<4;i++)  //taking input for 5 records, it can be increased for more record entering.
        {
            String UniqueCode = input.next();
            int convertToInt = Integer.parseInt(UniqueCode);
            int lengthOfInputCode = UniqueCode.length();
            if (lengthOfInputCode == 5)
            {
                int firstDigit = convertToInt;
                while (firstDigit >= 10)
                {
                    firstDigit = firstDigit / 10;
                }
                switch (firstDigit) {
                    case 1:
                        System.out.println("it is CD");
                        cdCount++;
                        break;
                    case 2:
                        System.out.println("it is DVD");
                        dvdCount++;
                        break;
                    case 3:
                        System.out.println("it is Video");
                        videoCount++;
                        break;
                    case 4:
                        System.out.println("it is book");
                        bookCount++;
                        break;
                    default:
                        System.out.println("Enter input again, Range is 10000-40000");
                        break;
                }
            } else {
                System.out.println("The entered Code is not of 5 length as required");
            }
            totalCount=cdCount+dvdCount+videoCount+bookCount;
        }
        System.out.println("Total Count of records is : "+totalCount);

    }

    public void Answer5() throws ParseException
    {
        System.out.println("\tAnswer 5");

        int errorCount = 0, studentID;

        for(studentID = 0 ; studentID<3; studentID++)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Start date in the format dd-MM-yyyy: ");
            String startDate = input.next();
            System.out.print("Enter End date in the format dd-MM-yyyy: ");
            String endDate = input.next();

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");//dd-MM-yyyy
            Date dateStart = formatter.parse(startDate);
            Date dateEnd = formatter.parse(endDate);

            System.out.println(formatter.format(dateStart));
            System.out.println(formatter.format(dateEnd));

            try
            { // 25-05-2021
                File myObj = new File("StudentRecord.txt");
                if (myObj.exists())
                {
                    System.out.println("file exists");
                } else
                    {
                        myObj.createNewFile();
                        System.out.println("File created :" + myObj.getName());
                    }
                FileWriter myWriter = new FileWriter("StudentRecord.txt",true);

                if (dateStart.before(dateEnd))
                {
                    myWriter.write(studentID+","+new SimpleDateFormat("yyMMdd").format(dateStart) + "," + new SimpleDateFormat("yyMMdd").format(dateEnd) + "\n");
                    myWriter.close();
                    System.out.println("successfully written");
                }
                else
                    {
                        System.out.println("Date format Error, enter again.");
                        errorCount++;
                    }
            } catch (IOException e)
            {
                System.out.println("error occured");
                e.printStackTrace();
            }
        }
        System.out.println("Error count is : "+errorCount);
    }

    public void Answer6()
    {
        System.out.println("\tAnswer 6");

        Scanner input = new Scanner(System.in);
        int marriedStatus, gender, age;
        System.out.println("Select from the below Options : ");
        System.out.println("1. Driver is Married");
        System.out.println("2. Driver is Unmarried");
        marriedStatus = input.nextInt();

        switch (marriedStatus)
        {
            case 1:
                System.out.println("Driver is insured");
                break;
            case 2:
                System.out.println("Driver is unmarried, Now please select Gender of driver : ");
                System.out.println("1. Driver is Male");
                System.out.println("2. Driver is Female");
                gender = input.nextInt();
                switch (gender)
                {
                    case 1:
                        System.out.println("Driver is Male, Enter his age now: ");
                        age = input.nextInt();
                        if (age >= 30)
                        {
                            System.out.println("Driver is Male and " + age + " years old and is Insured");
                        } else
                            {
                            System.out.println("Driver is not insured");
                        }
                        break;
                    case 2:
                        System.out.println("Driver is Female, Enter her age now: ");
                        age = input.nextInt();
                        if (age >= 25)
                        {
                            System.out.println("Driver is Female and " + age + " years old and is Insured");
                        } else
                            {
                            System.out.println("Driver is not insured");
                        }
                        break;
                }
                break;
            default:
                System.out.println("Invalid option: Please choose valid options provided next time.");
                break;
        }
    }


    public void Answer7()
    {
        System.out.println("\tAnswer 7\n");

        int numberOfSharesBought = 600;
        double initialBuyingPrice = 21.77, sellingPriceOfShares = 16.44;

        double amountPaidForStocks = numberOfSharesBought * initialBuyingPrice;
        double amountRecievedFromSellingStocks = numberOfSharesBought * sellingPriceOfShares;
        double amountOfMoneyLost = amountPaidForStocks - amountRecievedFromSellingStocks;
        double lossInPercentage = (amountOfMoneyLost / amountPaidForStocks) * 100;

        System.out.println("Total amount paid for the stocks : " + amountPaidForStocks);
        System.out.println("The total amount received from selling the stocks : " + amountRecievedFromSellingStocks);
        System.out.println("The total amount of money he lost : " + amountOfMoneyLost);
        System.out.println("Loss is : " + lossInPercentage + " Percent");
    }

    public void Answer8()
    {
        System.out.println("\tAnswer 8\n");

        for (int years = 1950; years <=2016 ; years ++)
        {
            if (((years % 4 == 0) && (years % 100!= 0)) || (years%400 == 0))
                System.out.println(years+" is a leap year");
            else
                System.out.println(years+" is not a leap year");
        }
    }

    public void Answer9()
    {
        System.out.println("\tAnswer 9\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get the Fibonacci Series of: ");
        int fibo = input.nextInt();
        int num1 = 0, num2 = 1, sum = 0;
        for (int i = 0; i <= fibo; i++) {
            System.out.print(" " + num1);


            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

    }


    public void Answer10()
    {
        System.out.println("\tAnswer 10\n");

        int countPositive =0, countNegative=0;
        Scanner input = new Scanner(System.in);
        int number;

        char quitEnteringInput = 'y';
        while(quitEnteringInput=='y')
        {
            System.out.println("Enter the number ");
            number = input.nextInt();

            if(number>0)
            {
                countPositive++;
            }
            else {
                countNegative++;
            }
            System.out.println("Do you want to continue entering numbers ? Press 'y' else, any other:");
            quitEnteringInput=input.next().charAt(0);
        }
        System.out.println("Positive count is :" + countPositive);
        System.out.println("Negative count is :" + countNegative);

    }

    public void Answer11()
    {
        System.out.println("\tAnswer 11\n");

        double fee_3hour = 20.0, fee_moreThan3hour = 5.0, fee_maxTime=100.0,charge=0.0, chargeForLessThan3=0.0,chargeFor3orMore=0.0;
        double totalCharge=0.0;
        Scanner input = new Scanner(System.in);
        double hoursParked=0.0, totalHours=0.0;

        for(int customers = 1; customers<=3; customers++)
        {
            System.out.println("Enter the number of hours for customer number : "+ customers);
            hoursParked = input.nextDouble();

            totalHours = totalHours + hoursParked;
            //System.out.print("Car hours \n "+hoursParked +" ");
            if (hoursParked<=3)
            {
                totalCharge = totalCharge +fee_3hour;
                charge = fee_3hour;
            }
            else if (hoursParked>3 && hoursParked<24) //5 hour pe 30 aana chaiye. //4 hour pe 25.0
            {
                totalCharge = totalCharge+ fee_3hour + (fee_moreThan3hour*(hoursParked-3));
                charge = fee_3hour + (fee_moreThan3hour*(hoursParked-3));
            }
            else if (hoursParked>=24)
            {
                totalCharge = fee_maxTime;
                charge = fee_maxTime;
            }
            System.out.println("Car Hours\n "+ hoursParked );
            System.out.println("Charge\n "+ charge );
        }
        System.out.println("TOTAL Hours : " +totalHours);
        System.out.println("TOTAL Charge : " +totalCharge);
    }

    public void Answer12()
    {
        System.out.println("\tAnswer 12\n");

        int num = 5;

        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }

    public void Answer13()
    {
        System.out.println("\tAnswer 13\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to see for similar row and columned \"*\"");
        int row = input.nextInt();

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < row; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void Answer14()
    {
        System.out.println("\tAnswer 14\n");

        int num =5;

        for(int i=0;i<num;i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("+");
            }
            System.out.println();
        }
            for (int k=num;k>0;k--)
            {
                for (int l=0;l<k;l++)
                {
                    System.out.print("+");
                }
                System.out.println();
            }
    }
}