package com.nisum.training;

import java.util.Arrays;

public class Assignment_ArrayProblems
{
    public static void main(String[] args)
    {
        Author();
        Assignment_ArrayProblems myObj = new Assignment_ArrayProblems();

        myObj.FindMissingNumQ1();
        myObj.RemoveDuplicateFromArrayQ2();
        myObj.MaximumDifferenceQ3();
        myObj.AddMinimumToMakeEvenQ4();
        myObj.LargestNumberQ5();
    }

    public static void Author()
    {
        System.out.println("\n\t\tCreated by Talha.\n     \tTopic: Array Problems\n");
    }

    public void FindMissingNumQ1()
    {
        System.out.println("\n\tAnswer 1, Find Missing Number\n");
        int arr[]={1,2,3,4,5,7,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        //int arr[]={1,2,4,5,9,15,17}; //assuming this is a sorted Array
        int diff=0, prev=0, next=0;

        for(int i = 0; i <arr.length-1; i++)
        {
            diff= arr[i+1]-arr[i];

            if(diff!=1) //agar difference a[i] and a[i+1] ka 1 se bara hay toh print missing with 1 increment.
            { //difference zada hay toh aik bar wo aagaya hay loop main, ab loop k andar difference wapas check karo
                //a+1 wala aur jo print karadia hay, uska difference barabar hogaya hay like 1 toh phir next iterate hoay
                //like  5,8 ka difference 1 se bara hay toh wo loop main aajega, but aik kaam kar k wapas bahar chala jaega
                //phir wo loop main 7 print nahe hoga.

                //System.out.println("diff :"+diff);
                //System.out.println(arr[i] +" "+ arr[i+1]);
                prev=++arr[i];
                System.out.println("Missing number is "+ (prev));

                next=arr[i+1]-prev; //jab tak a[i] ka next aur a[i+1] k darmiyyaan na difference 1 na ho,
                                    // incrememnt kardo while main ja kar.
                while(next!=1)
                {
                    next--;
                    System.out.println("Missing number is "+ (++prev));
                }
            }
        }
    }

    public void RemoveDuplicateFromArrayQ2()
    {
        System.out.println("\n\tAnswer 2, Remove Duplicates\n");
        int arr[] ={2,3,1,5,6,1,5,6,7,8,8,9},j=0;
        int sortedArray[] = new int[0];
        int[] temp = new int[arr.length];

        Arrays.sort(arr);
        //Arrays.toString(arr);

        System.out.println("Sorted Array is :");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nNon-duplicating element Array is :");
        for (int i = 0; i < arr.length; i++)
        {
            if(i == arr.length-1)
            {
                temp[j]=arr[i];
                System.out.print(temp[j]);
                j++;
            }
           else if (arr[i] != arr[i+1]) //1,1,2,3,5,5,6,6,7 //agar next element same hay toh temporary main save na karwao.
            {
                temp[j]=arr[i];
                System.out.print(temp[j]+" ");
                j++;
            }
        }
    }

    public void AddMinimumToMakeEvenQ4()
    {
        System.out.println("\n\tAnswer 4, Adding Odd number to make sum Even if it is ODD\n");
        int arr[] = {6,4,2,1,4,5,6,7,8};
        int sum=0, oddNumFromArr = 0;
        boolean isEven=true;

        for (int i = 0; i < arr.length; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of array is: "+sum);

        if(sum%2==0)
        {
            System.out.println("Sum is Even: "+isEven);
        }
        else
        {
            System.out.println("Sum is Even: "+!isEven);

            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i]%2!=0 && arr[i]>0) //finding ODD number from the array to add into the odd sum and make it even
                {
                    System.out.println("Odd element from Array is: "+arr[i] +" at index :"+i);
                    oddNumFromArr = arr[i];
                    break;
                }
            }
            System.out.println("Making the ODD sum Even: "+ (sum+ oddNumFromArr));
        }
    }

    public void MaximumDifferenceQ3()
    {
        System.out.println("\n\n\tAnswer 3, Maximum Difference\n");
        int arr[] = {2,3,1,7,9,5,11,3,5};
        int maxNum = arr[0], minNum=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] > maxNum) //finds maximum num
            {
                maxNum = arr[i];
            }
            if (arr[i] < minNum) //finds minimum num
            {
                minNum = arr[i];
            }
        }
        System.out.println("Maximum Difference is : "+ (maxNum-minNum));
    }
    public void LargestNumberQ5()
    {
        System.out.println("\n\tAnswer 5, Largest Number\n");
        int arr[] = {8,7,56,90,1};
        int maxNum = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxNum)
            {
                maxNum=arr[i];
            }

        }
        System.out.println("Largest Number in the Given Array is : "+maxNum);
    }

}
