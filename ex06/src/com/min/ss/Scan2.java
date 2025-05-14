package com.min.ss;

import java.util.Scanner;

public class Scan2 {
	
	public void input() {
		Scanner ss = new Scanner(System.in);
		
		 // 사용자에게 이름 입력을 요청하고 입력값을 문자열로 받음
        System.out.print("이름 입력: ");
        String mmm = ss.next(); // 공백 전까지 입력받음 (예: "홍길동" 입력 시 "홍길동" 저장)
        
        // 사용자에게 나이 입력을 요청하고 정수로 받음
        System.out.print("나이 입력: ");
        int kkk = ss.nextInt();
        
        // 사용자에게 몸무게 입력을 요청하고 실수로 받음
        System.out.print("몸무게 입력: ");
        Double ddd = ss.nextDouble();
        
        // 사용자에게 키 입력을 요청하고 실수로 받음
        System.out.print("키 입력: ");
        Double ggg = ss.nextDouble();
        
        // 사용자에게 취미 입력을 요청하고 문자열로 받음
        System.out.print("취미 입력: ");
        String hhh = ss.next(); // 공백 없는 한 단어만 입력 가능
        
        // BMI 계산 >> BMI 계산 공식 = 몸무게(kg) / (키(m) × 키(m))
        double he = ggg / 100.0; // 키를 m 단위로 변환
        double bmi = ddd / (he * he); // BMI 계산

        // 입력받은 내용을 출력 (결과 확인)
        System.out.println("====출력확인====");
        System.out.println("이름 : " + mmm);
        System.out.println("나이 : " + kkk);
        System.out.println("몸무게 : " + ddd + "kg");
        System.out.println("키 : " + ggg + "cm");
        System.out.println("취미 : " + hhh);
        
        // BMI 계산 공식 = 몸무게(kg) / (키(m) × 키(m))
        // BMI 출력
        System.out.println("BMI 지수 : "+ bmi +"입니다."); // 소수점 둘째 자리까지 출력
        
        // BMI 상태 출력
        if (bmi > 29.9) {
            System.out.println("비만입니다.");
        } else if (bmi > 24.9) {
            System.out.println("과체중입니다.");
        }

        // Scanner 닫기 
        ss.close();
	}

}

