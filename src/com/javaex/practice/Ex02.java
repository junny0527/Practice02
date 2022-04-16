package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		System.out.print("입력:");
		String txt = input.nextLine();
		if(x == 0) {
			System.out.println(txt+ "는 0이다.");
		}
 input.close();
	}

}
