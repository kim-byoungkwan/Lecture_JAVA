package kr.ac.kopo.day01;

/* 
 �ּ��� �ȿ� �ִ� �ڵ�� ������ �Ƶ� ������ �� �� ��ȯ���� �ʴ� �κ��̴�. ���� ������ ����ڰ� �����ϱ� ���� �������θ� �����ȴ�.
 �̷��� �ּ��� �������� �� �� �ִ�. ����, �ּ����� ��ø�Ǿ �ȵȴ�. ��ø�Ǹ� �ּ����� �νĵ��� �ʱ⶧���̴�.
 */

// ������ �ΰ��� ���ٴ����� �ּ�ó���� �� �� ���δ�.


/*
 ����� ����
 1. ������ ���
 2. �Ǽ��� ���
 3. ������ ���('A'. 'b')
 4. ���ڿ� ���("abc")
 5. ���� ��� true false
 */


/*
 * ��¸޼ҵ�
 * 1. println() : ���๮�ڸ� �����Ѵ�.
 * 2. print() : ���๮�ڸ� �������� �ʴ´�.
 * 3. printf() : jdk1.5 ������ ���� �߰��� ����, ���๮�ڸ� �����ϰ� ���� ���� �޼ҵ��̴�, f�� ���⼭ formating�� �ǹ��Ѵ�.
 * 				 �̶� f�� �������� ����ϰ����ϴ� ���� �������� �����Ͽ� ���ϰ� ǥ���� �� ������ �ǹ��Ѵ�.
 * 				 ����Ʈf�� ������ "" �ȿ� ����ִ� ���� ����Ѵٴ� �ǹ��̴�. �̶�, ����ϰ����ϴ� ���� ���¸� %��ȣ�� ����Ͽ�
 * 				 ǥ���Ѵ�. 
 * 				%d ����
 * 				%f �Ǽ�
 * 				%c ����
 * 				%s ���ڿ�
 * 				%b ����
 */

public class PrintMain {
	
	public static void main(String[] args) {
		
		System.out.println(10);
		
		System.out.println('a');
		
		System.out.println("abc");
		
		System.out.println(true);
		
		System.out.println(23 + "��");
		
		System.out.print(23);
		System.out.println("��");
		
		System.out.println(10 + "+" + 20 + "=" + 10 + 20);
		
		System.out.println(10 + "+" + 20 + "=" + (10 + 20));
		
		System.out.printf("%d��", 23);
		
		System.out.println();
		
		System.out.printf("%d��\n", 23);
		
		System.out.println();
		
		System.out.printf("%d + %d = %d", 10, 20, 30);
		
		System.out.printf("[%d]\n", 1200);
		
		System.out.printf("[%d]\n", 950);
		
		System.out.printf("[%d]\n", 15800);
		
		System.out.printf("[%7d]\n", 1200);
		
		System.out.printf("[%7d]\n", 950);
		
		System.out.printf("[%7d]\n", 15800);
		
		System.out.printf("[%-7d]\n", 1200);
		
		System.out.printf("[%-7d]\n", 950);
		
		System.out.printf("[%-7d]\n", 15800);
		
		System.out.printf("[%04d]\n", 35);
		
		System.out.printf("[%f]\n", 12.3456);
		
		System.out.printf("[%.4f]\n", 12.3456);

		System.out.printf("[%.2f]\n", 12.3456);
		
		System.out.printf("%b\n", true);
		
		��
	}

}








