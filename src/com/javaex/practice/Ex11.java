package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("월을 입력해주세요:");
		String word = input.next();
		
		switch(word) {
			case "a":
				System.out.println("모음입니다.");
			break;
			case "e":
				System.out.println("모음입니다.");
			break;
			case "i":
				System.out.println("모음입니다.");
			break;
			case "o":
				System.out.println("모음입니다.");
			break;
			case "u":
				System.out.println("모음입니다.");
			break;
			
			default:
				System.out.println("자음입니다.");
			break;
		
	}	
		input.close();

	}

}
