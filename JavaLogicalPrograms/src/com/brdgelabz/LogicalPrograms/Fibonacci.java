package com.brdgelabz.LogicalPrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter the range number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
         
        System.out.println("\nFibonacci series for number "+n+ " is :");
        //printing 0 and 1   
        System.out.println(a);
        System.out.println(b);
        
        for(int i=2;i<n;i++)
        	//loop starts from 2 because 0 and 1 are already printed 
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
	}


