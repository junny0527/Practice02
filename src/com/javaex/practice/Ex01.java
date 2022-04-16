package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("몇살이신가요?");
		System.out.print("나이:");
		int age = input.nextInt();
		
		if(0 < age && age < 18) {
			System.out.println("청소년 입니다.");
		}
		input.close();
	}

}
