package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * a �Է� : 10
 * b �Է� : 3
 * 
 * 10�� 3�� ����ΰ�? False
 * 
 * a �Է� : 10
 * b �Է� : 5
 * 
 * 10�� 5�� ����ΰ�? true
 * 
 */


public class OperationMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a �Է� : ");
		
		int a = sc.nextInt();
		
		System.out.println("b �Է� : ");
		
		int b = sc.nextInt();
		
		System.out.println(a + " : " + b);
		
		boolean result = (b != 0 && a % b == 0);
		// b�� 0�̸� && �ڴ� �ƿ� �������� ���� �ʴ´�.
		// ��, ���� ��� && �յ��� �������� ������ �ٲ�� �ǹ̰� ���� b�� 0�ΰ�� ������ �߱⶧���̴�.
		// ���� && �����ڿ� ���� �������� ��ȯ��Ģ�� �������� �ʴ´ٴ� ���̴�.
		
		System.out.printf("%d�� %d�� ����ΰ�? %b\n", a, b, result);
		
	}
	
}



