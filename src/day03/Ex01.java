package day03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int num = 10;
		if(num%2==1) { //조건이 참일경우 종속문장 실행
			System.out.println("짝수");
		}else { //if문의 조건이 거짓일경우 else실행
			System.out.println("홀수");
		}
		System.out.println("다음 문장 실행");
		//-----------------------------------------------

		Scanner scan = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int su = scan.nextInt();
		
		if(su%5==0) {
			System.out.println("5의 배수입니다");
		}else {
			System.out.println("5의 배수가 아닙니다");
		}
		
		//--------------------------------------------
		
		
		System.out.print("수 입력 : ");
		int num1 = scan.nextInt();
		
		if(num1>0 && num1<100) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
		
		//--------------------------------------------
		
		System.out.print("수 입력 : ");
		int num2 = scan.nextInt();
		
		if(num2 % 2==0 && num2 % 3 == 0) {
			System.out.println(num2+"는 3의 배수인 짝수입니다");
		}else {
			System.out.println(num2+"는 3의 배수인 짝수가 아닙니다");
		}
		
		System.out.print("수 입력 : ");
		int num3 = scan.nextInt();
		
		if(num3 % 2==0 && num3 % 3 == 0) {
			System.out.println(num3+"는 3의 배수인 짝수입니다");
		}else {
			if(num3 % 2 == 0) {
				System.out.println(num3+"짝수");
			}else {
				if(num3 % 2 == 1 && num3 % 3 == 0) {
					System.out.println(num3+"홀수+3의 배수");					
				}else {					 
						System.out.println(num3+"해당X");
					}
				}
			
			
		}
		
	}
		

}
