package kr.ac.kopo.day02_assignment;

import java.util.Scanner;

public class assignment_num_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� : ");
		
		System.out.println("���� ���� �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		
		int divider = sc.nextInt();
		
		int result = num / divider;
		
		int residual = num % divider;
		
		System.out.printf("�� : %d\n", result);
		
		System.out.printf("������ : %d ",residual);
				
	}
	
}
	
	