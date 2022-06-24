package com.brdgelabz.LogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rev=0;
        while (n!=0) //repeat until number becomes zero
        {
            int r=n%10; //remainder of number calculated using modulo
            rev=rev*10+r;  // multiplying reverse variable by and adding remainder to it  
            n=n/10; //divide the number by 10

        }
        System.out.println("Reverse number is "+rev);

	}

}
