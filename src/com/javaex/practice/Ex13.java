package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int x = input.nextInt();
		
		if( x <= 0 ) {
			System.out.println("계산 결과는 " + (((double)x*x*x)-((double)9*x)+(double)2) + "입니다."); 
		} else {
			System.out.println("계산 결과는 " + (((double)7*x) + (double)2));
		}
		
	input.close();
	}
}
