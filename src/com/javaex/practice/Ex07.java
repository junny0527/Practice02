package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫번쨰 숫자:");
		int num = input.nextInt();
		System.out.print("두번째 숫자:");
		int num2 = input.nextInt();
		
		int fi = num/ num2;
		int se = num % num2;
		
		System.out.println("몫: " + fi);
		System.out.println("나머지: "+ se);
		
		input.close();

	}

}
