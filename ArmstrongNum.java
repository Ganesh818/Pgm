package com.first.java;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {

		int count = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = in.nextInt();

		in.close();
		int temp = num;

		for (; num > 0;) {

			int rem = num % 10;

			count = count + (rem * rem * rem);

			num = num / 10;

		}

		if (count == temp) {

			System.out.println(temp + " is an armstrong number");

		} else

			System.out.println(temp + " is not an armstrong number");

	}

}
