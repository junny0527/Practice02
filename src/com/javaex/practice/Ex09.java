package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자:");
		int num = input.nextInt();
		System.out.print("두번째 숫자:");
		int num2 = input.nextInt();
		
		int big;
		int small;
		if(num>num2) {
			big=num;
			small=num2;
		} else {
			big=num2;
			small=num;		
		}
		
		if((big%small) == 0) {
			System.out.println(small + "는(은) " + big + " 의 약수입니다.");
		}
		else {
			System.out.println(small + "는(은) " + big + " 의 약수가 아닙니다.");
		}
		input.close();
	}

}
