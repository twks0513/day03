package day03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int num = 10;
		if(num%2==1) { //������ ���ϰ�� ���ӹ��� ����
			System.out.println("¦��");
		}else { //if���� ������ �����ϰ�� else����
			System.out.println("Ȧ��");
		}
		System.out.println("���� ���� ����");
		//-----------------------------------------------

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int su = scan.nextInt();
		
		if(su%5==0) {
			System.out.println("5�� ����Դϴ�");
		}else {
			System.out.println("5�� ����� �ƴմϴ�");
		}
		
		//--------------------------------------------
		
		
		System.out.print("�� �Է� : ");
		int num1 = scan.nextInt();
		
		if(num1>0 && num1<100) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
		
		//--------------------------------------------
		
		System.out.print("�� �Է� : ");
		int num2 = scan.nextInt();
		
		if(num2 % 2==0 && num2 % 3 == 0) {
			System.out.println(num2+"�� 3�� ����� ¦���Դϴ�");
		}else {
			System.out.println(num2+"�� 3�� ����� ¦���� �ƴմϴ�");
		}
		
		System.out.print("�� �Է� : ");
		int num3 = scan.nextInt();
		
		if(num3 % 2==0 && num3 % 3 == 0) {
			System.out.println(num3+"�� 3�� ����� ¦���Դϴ�");
		}else {
			if(num3 % 2 == 0) {
				System.out.println(num3+"¦��");
			}else {
				if(num3 % 2 == 1 && num3 % 3 == 0) {
					System.out.println(num3+"Ȧ��+3�� ���");					
				}else {					 
						System.out.println(num3+"�ش�X");
					}
				}
			
			
		}
		
	}
		

}
