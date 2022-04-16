package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		System.out.print("숫자1:");
		int num = input.nextInt();
		System.out.print("숫자2:");
		int num2 = input.nextInt();
		
		if(num > num2) {
			System.out.print("큰수: " + num);
			System.out.print(" 작은수: " + num2+"입니다.");
		} else {
			System.out.print("큰수: " + num2);
			System.out.print(" 작은수: " + num+"입니다.");
		}
		input.close();
	}

}
