package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이:");
		int age = input.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\""); //21,100
		}else {
			System.out.println("\"2번그룹\"");//15,19,20
		}
		System.out.println("입니다.");

		input.close();
	}

}
