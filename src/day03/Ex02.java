package day03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.print("�� �Է� : ");
		num = scan.nextInt();
		
		if(num>100) {
			System.out.println("100���� ũ��");
		} if(num >70) {
			System.out.println("70���� ũ��");
		} if(num>40) {
			System.out.println("40���� ũ��");
		} {
			System.out.println("�� ���� ��");
		}

	}

}
