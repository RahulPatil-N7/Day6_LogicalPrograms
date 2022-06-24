package com.brdgelabz.LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number :");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        
        for (int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count=count+1;
            }
        }
        
        //Check if number is prime or not
        if(count==2)
        {
            System.out.println(+n+" is a prime number.");
        }
        else {
            System.out.println(+n+" is not a prime number.");
        }
		
	}

}
