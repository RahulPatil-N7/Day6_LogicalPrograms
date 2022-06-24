package com.brdgelabz.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number :");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        
        //Find divisors of entered number
        for (int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        
        //Check sum of divisors equal to the enter num
        if(sum==n)
        {
            System.out.println(+n+" is perfect number");
        }
        else
        {
            System.out.println(+n+" is not a perfect number");
        }
}
}
