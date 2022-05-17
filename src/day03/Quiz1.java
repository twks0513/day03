package day03;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 한 학교에 반이 6개있다 총 학생수를 입력하고 
		// 반당 최대 인원수와 남은 학생없이 다 채워졌다면 "학기시작", 
		// 다 채워지지 못했다면 "학급이 부족합니다. 남은학생은 n명입니다"라고 출력해주는 프로그램을 작성하시오 
		// (단 반당 최대인원수는 남은 인원이 가장 적은 경우로 나와야한다)
		
		// 2. 시험평균점수가 70점이 넘지못하면 보충수업을 들어야 한다.
		// 시험점수 2개를 입력하고 3번째 시험은 몇점 이상을 받아야 보충수업을 듣지않는지 출력해주는 프로그램을 작성하시오 
		// (3번째 시험결과가 100점이 넘어야 평균점수가 70을 넘길경우 "보충수업확정"을 출력하시오" 
		
		
		// 1번문제
		
		int allstudent, result, leftstudent; //변수 선언
		
		System.out.print("총 학생 수 입력 : "); // 총 학생 수 입력
		allstudent = scan.nextInt();
		
		leftstudent = allstudent % 6; // 반에 채워지지못한 학생 수 
		
		result = allstudent / 6; // 반당 최대 인원 수 
		
		if(leftstudent == 0) { // 남은 학생이 없는 경우
			System.out.println("반당 최대 인원수 : "+result );
			System.out.println("학기 시작");
		}else if(leftstudent != 0){ // 남은 학생이 있는 경우
			System.out.println("반당 최대 인원수 : "+result );
			System.out.println("학급이 부족합니다");
			System.out.println("남은 학생은 "+leftstudent+"명 입니다.");
		}
		
		
		// 2번문제
		
		int test1, test2, test3, total; // 변수선언
		test3 = 0;						// 변수 초기화
		
		System.out.print("시험 점수 입력 : "); // 시험점수 입력
		test1 = scan.nextInt();
		test2 = scan.nextInt();
		
		total = test1+test2+test3; // 총 점수
		test3 = 210 - total;		// 평균값에 도달하기 위한 점수
		
		
		if(test3 > 100) { // 세번째시험을 만점받아도 평균 70이안될경우
			System.out.println("보충수업 확정입니다"); 
		}else { // 평균값 70이상을 위한 3번째 시험점수 출력
			System.out.println(test3+"점 이상이어야 합니다");
		}
		
		
		
		
		
	}

}
