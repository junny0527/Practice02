package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int small;
		System.out.println("숫자를 3개를 입력해주세요");
		System.out.print("숫자1:");
		int num = input.nextInt();
		System.out.print("숫자2:");
		int num2 = input.nextInt();
		System.out.print("숫자3:");
		int num3 = input.nextInt();
		
		if((num<=num2)&&(num<=num3)){
			 small=num;
		}else if((num2<=num)&&(num2<=num3)) {
			 small = num2;
		}else {
			 small=num3;
		}
		System.out.println("가장 작은수는 " + small +" 입니다");
		input.close();
	}

}
