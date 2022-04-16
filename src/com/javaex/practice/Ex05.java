package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	int total = 0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total;
		
		System.out.println("키와 몸무게를 입력하세요.");
		System.out.print("키: ");
		double tall = input.nextDouble();
		System.out.print("몸무게: ");
		double weight = input.nextDouble();
		
		total = (tall - 100) * 0.9;
		
		if(weight < total) {
			System.out.println("저체중 입니다.");
		}
		else if(weight == total) {
			System.out.println("표준 입니다.");
		}
		else {
			System.out.println("과체중 입니다.");
		}
		
		System.out.println("표준체중: " + total);
		
		input.close();
	}

}
