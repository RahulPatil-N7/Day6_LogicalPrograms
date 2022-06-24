package com.brdgelabz.LogicalPrograms;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		StopWatchFuctions st1 = new StopWatchFuctions();
        System.out.println("Press 1 to start watch then Press 2 to stop watch!");
        Scanner sc=new Scanner(System.in);
        int check=sc.nextInt();
        switch(check) {
        case 1:
        	st1.start();	//timer start
        	System.out.println("Watch timer started.");
        break;
        default:
        	System.out.println("Invalid input");
        }
        int check2=sc.nextInt();
        switch(check2) {
        case 2:
        	st1.stop();	//timer stop
        	System.out.println("Watch timer stopped.");
        break;
        default:
        	System.out.println("Invalid input");
        }


        System.out.println("Elapsed time in milliseconds: "
                + st1.getElapsedMilliseconds());

        System.out.println("Elapsed time in seconds: "
                + st1.getElapsedSeconds());

        System.out.println("Elapsed time in minutes: "
                + st1.getElapsedMinutes());

        System.out.println("Elapsed time in hours: "
                + st1.getElapsedHours());


	}

}
