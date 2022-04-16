package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("금액: ");
		int income = input.nextInt();
		
		if(income <= 1000 && income > 0) {
			System.out.println("소득세는 " + 0.09 * income + "입니다.");
		} else if(income > 1000 && income <= 4000) {
			System.out.println("소득세는 " + (1000*0.09 + 0.18*(income-1000)) + "입니다.");
		} else if(income > 4000 && income <= 8000) {
			System.out.println("소득세는 " + ((1000*0.09 + 3000*0.18 + 0.27*(income-4000))) + "입니다.");
		} else if(income > 8000) {
			System.out.println("소득세는 " + (1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(income-8000)) + "입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	
	
	input.close();

	}

}
