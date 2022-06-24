package com.brdgelabz.LogicalPrograms;

public class Coupon {

	 //Static Function to generate random numbers and to process distinct coupons.
	public static void couponNumbers()
		{
		char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        
		int max = 100000000;
       
        int random = (int) (Math.random() * max);
        StringBuffer sb = new StringBuffer();

        while (random > 0) {
            sb.append(chars[random % chars.length]);
            random /= chars.length;
        }
        String couponCode = sb.toString();
        System.out.println("Coupon Code: " + couponCode);

		}
	public static void main(String[] args) {
        couponNumbers();
	}

}
