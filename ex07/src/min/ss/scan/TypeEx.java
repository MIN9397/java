package min.ss.scan;

import java.util.Scanner;

public class TypeEx {
	
	public static void main(String[] args) {
		
		TypeEx ss = new TypeEx();
		ss.min();
		
	}
	
	public void min() {
		//정수형 변수 선언 변수명 num
		// 타입 변수명
		// 변수명 = 값
		// 타입 변수명 = 값
		int a;
		a=1;  //2줄 변수 선언
		
		int b = 2;  // 한줄 변수 선언
		
		boolean you = false;
		// 변수값 변경 > 변수는 값이 변경 될수 있다는 뜻
		you = true;
		
		double dd = 3.14;
		
		String na = "\"삼성캠퍼스\"";
		na = "\"" + na + "\"";
		
		System.out.println(na);
		
		String str = "10";
		
		int cv = Integer.parseInt(str);
		
		/*
		 * scanner.nextLine() : 사용자가 입력한 값을 모두 읽어온다. (문자열)
		 * 
		scanner.next
		() : 사용자가 입력한 값 중에 공백이 있을 경우 공백 이전까지의 값만 읽어온다.
		 * scanner.nextInt() : 정수를 입력받을 때 사용한다.
		 * scanner.nextDouble() : 실수를 입력받을 때 사용한다.
		 * ... 그 밖에 byte, boolean 등의 기본 자료형을 입력받을 때도 마찬가지로 nextXXX()로 입력받으면 된다. 
		 */ 
		String mi01 = ss1.next();
		String mi02 = ss1.next();
		String mi03 = ss1.next();
		String mi04 = ss1.next();
		
		System.out.println("하나: "+mi01);
		System.out.println("둘: "+mi02);
		System.out.println("셋: "+mi03);
		System.out.println("넷: "+mi04);
		
		
		String mi05 = ss1.nextLine();
		String mi06 = ss1.nextLine();
		
		System.out.println("다섯: "+mi05);
		System.out.println("여섯: "+mi06);
		
		
		

		System.out.print("이름 입력 : ");
		String name = ss1.next();
		System.out.print("나이 입력 : ");
		int age = ss1.nextInt();
		System.out.print("키 입력 : ");
		Double he = ss1.nextDouble();
		
		// Scanner 객체를 생성
		// 사용자로 부터 이름, 나이, 키를 입력 받아서 출력 해봅시다
		// 키는 소수점 첫째자리까지 입력 합니다
		
		System.out.println("이름 : " + name); 
		System.out.println("나이 : " + age); 
		System.out.println("키 : " + he);
		
		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "세, 키는 " 
								+ he + "cm" + "입니다.");
	
	}
		Scanner ss1 = new Scanner(System.in);
		
		

		

			
		
		

}

