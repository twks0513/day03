package day03;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. �� �б��� ���� 6���ִ� �� �л����� �Է��ϰ� 
		// �ݴ� �ִ� �ο����� ���� �л����� �� ä�����ٸ� "�б����", 
		// �� ä������ ���ߴٸ� "�б��� �����մϴ�. �����л��� n���Դϴ�"��� ������ִ� ���α׷��� �ۼ��Ͻÿ� 
		// (�� �ݴ� �ִ��ο����� ���� �ο��� ���� ���� ���� ���;��Ѵ�)
		
		// 2. ������������� 70���� �������ϸ� ��������� ���� �Ѵ�.
		// �������� 2���� �Է��ϰ� 3��° ������ ���� �̻��� �޾ƾ� ��������� �����ʴ��� ������ִ� ���α׷��� �ۼ��Ͻÿ� 
		// (3��° �������� 100���� �Ѿ�� ��������� 70�� �ѱ��� "�������Ȯ��"�� ����Ͻÿ�" 
		
		
		// 1������
		
		int allstudent, result, leftstudent; //���� ����
		
		System.out.print("�� �л� �� �Է� : "); // �� �л� �� �Է�
		allstudent = scan.nextInt();
		
		leftstudent = allstudent % 6; // �ݿ� ä���������� �л� �� 
		
		result = allstudent / 6; // �ݴ� �ִ� �ο� �� 
		
		if(leftstudent == 0) { // ���� �л��� ���� ���
			System.out.println("�ݴ� �ִ� �ο��� : "+result );
			System.out.println("�б� ����");
		}else if(leftstudent != 0){ // ���� �л��� �ִ� ���
			System.out.println("�ݴ� �ִ� �ο��� : "+result );
			System.out.println("�б��� �����մϴ�");
			System.out.println("���� �л��� "+leftstudent+"�� �Դϴ�.");
		}
		
		
		// 2������
		
		int test1, test2, test3, total; // ��������
		test3 = 0;						// ���� �ʱ�ȭ
		
		System.out.print("���� ���� �Է� : "); // �������� �Է�
		test1 = scan.nextInt();
		test2 = scan.nextInt();
		
		total = test1+test2+test3; // �� ����
		test3 = 210 - total;		// ��հ��� �����ϱ� ���� ����
		
		
		if(test3 > 100) { // ����°������ �����޾Ƶ� ��� 70�̾ȵɰ��
			System.out.println("������� Ȯ���Դϴ�"); 
		}else { // ��հ� 70�̻��� ���� 3��° �������� ���
			System.out.println(test3+"�� �̻��̾�� �մϴ�");
		}
		
		
		
		
		
	}

}
