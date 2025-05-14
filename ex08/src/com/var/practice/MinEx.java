package com.var.practice;

import java.util.Scanner;

public class MinEx {

	Scanner m2 = new Scanner(System.in);
	
	public void ma01() {
		
		//입력
		System.out.print("이름 입력: ");
		String na = m2.next();
		
		System.out.print("성별 입력: ");
		char se = m2.next().charAt(0);
		
		System.out.print("나이 입력: ");
		int ag = m2.nextInt();
		
		System.out.print("키 입력: ");
		double he = m2.nextDouble();
		
		
		//출력
		System.out.println("이름: "+na);
		System.out.println("성별: "+se);
		System.out.println("나이: "+ag);
		System.out.println("신장: "+he);
		System.out.printf("당신의 이름은 %s이고 성별은 %s 나이는 %d살이며 키는 %2f cm 입니다.%n",na,se,ag,he);
	}
	
	public void ma02() {
		
		// 정수 입력
		System.out.println("");
		System.out.println("### 입력한 두값의 더하기 빼기 곱하기 나누기 ###");
		
		System.out.print("정수1 입력: ");
		int d01 = m2.nextInt();
		
		System.out.print("정수2 입력: ");
		int d02 = m2.nextInt();
		
		//두수의 + - * / 구하기
		
		int ab = d01 + d02;
		int cd = d01 - d02;
		int ef = d01 * d02;
		double gh = (double) d01 / d02;
		
				
		System.out.println("더하기: "+ab);
		System.out.println("빼기: "+cd);
		System.out.println("곱하기: "+ef);
		System.out.println("나누기: "+gh);
		System.out.printf("더하기의 답은 %d 이다.%n 빼기의 답은 %d 이며 곱하기의 답은 %d 입니다.%n"
				+ "나누기의 답은 %5f 입니다.%n",ab,cd,ef,gh);
		
	}
	
	public void ma03() {
		
		System.out.println("");
		System.out.println("###사각형의 면적과 둘레 구하기###");
		
		//사각형 가로 세로
		System.out.print("가로 입력: ");
		int s01 = m2.nextInt();
		
		System.out.print("세로 입력: ");
		int s02 = m2.nextInt();
		
				
		//면적=가로*세로
		int ee = s01 * s02;
		
		//둘레=(가로+세로)*2
		int ww = (s01 + s02)*2;
		
		//출력
		System.out.println("면적: "+ee);		
		System.out.println("면적: "+ee);
		System.out.println("둘레: "+ww);
		System.out.printf("입력한 사각형의 면적은 %s이고 둘레는 %s 입니다.",ee,ww);
	}
}
