package min.ss.scan.pr;

import java.util.Scanner;

public class Bmi02 {
	
	public void wr2() {
		
		Scanner bm = new Scanner(System.in);
		
		System.out.println("====BMI 구하기 입니다.====");
		
		System.out.print("키(m) 입력: ");
		Double ccc = bm.nextDouble();
        
        System.out.print("체중(kg) 입력: ");
        Double ddd = bm.nextDouble();
		
        System.out.println("키 : " + ccc+"m");
        System.out.println("체중 : " + ddd+"kg");
        
        //BMI 구하기 체중 / (키(m)*키(m))
        double bmi1 = ddd/(ccc*ccc);
        
        /*
        System.out.println("당신의 BMI는 : " + bmi1+"입니다.");
        
        if (bmi1 > 29.9) {
            System.out.println("비만입니다.");
        } 
        else if (bmi1 > 24.9) {
            System.out.println("과체중입니다.");
        } 
        else if (bmi1 < 24.9) {
            System.out.println("정상입니다.");
        }
        */
        
        String type;

        if (bmi1 < 18.5) {
            type = "저체중";
        } else if (bmi1 < 24.9) {
            type = "정상";
        } else if (bmi1 < 29.9) {
            type = "과체중";
        } else {
            type = "비만";
        }
		
        System.out.printf("당신의 BMI 수치는 %.2f입니다.%n %n체형은 %s입니다.%n", bmi1, type);
	}
	
	
	public void wr() {
	
		Scanner bm = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
        String mmm = bm.next();
        
        System.out.print("나이 입력: ");
        int kkk = bm.nextInt();
        
        System.out.print("키(cm) 입력: ");
        int aaa = bm.nextInt();
        
        System.out.print("체중(kg) 입력: ");
        int bbb = bm.nextInt();
        
        //BMI 구하기 체중 / (키(m)*키(m))
        //double bmik = aaa/100;  // 키 cm > m 변환
        //double bmi = bbb/(bmik*bmik);
        
        
        System.out.println("====출력확인====");
        System.out.println("이름 : " + mmm);
        System.out.println("나이 : " + kkk);
        System.out.println("키 : " + aaa+"cm");
        System.out.println("체중 : " + bbb+"kg");

        


	}
	
}
