package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 1 ~ 3 ������ ���� �Է�:
 * 1 �Է½� "one" ���
 * 2 �Է½� "Two" ���
 * 3 �Է½� "Three" ���
 * �׿� "Error" ���
 * 
 * case �������� ��� {} �� �ƹ��� ������ ���� ���� �ʴ�. ���� ����� switch������ �ǹ̰� �ִ�.
 * 
 * ����, switch case ���� if�� n���߿� 1���� ���ϴ� �����̶�� n�� �߿� m���� ���ϴ� ���� ������ �����̴�.
 * ��, switch case ���� å�� �ٿ��� ����Ʈ���� �����̴�. ��, ����Ʈ���� �ٿ����� ���� ��ģ�� �װ����� ���� �����ϸ� ������
 * �װ��������� å�� ���������� �о���ϴ� �Ͱ� ���� �����̴�. �׷��Ƿ�, �̷��� switch case ���� ���߼����� ������ if ó��
 * n���� 1���� ���ϴ� ����ó�� ����ϱ� ���� switch case ���� break �� �Բ� ����Ͽ� 1���� ���ϴ� ����ó�� ����Ѵ�.
 * 
 * break ���� if ���� �ƹ��� ����� ����. break ���� �ݺ���, while�� switch case �������� �ǹ̰� �ִ�. 
 * ���� if������ �ܵ����� break�� ���� ������ ����.
 * 
 * ����, default���� � ��ġ�� �����Ѵ� �ϴ���, �ݵ�� case ���ǹ��� ��� ������ ������ �������� ����ȴ�.
 * �׸���, case �� ���� � ��ġ�� �����Ѵ� �ϴ���, ������ ������ �ƴ϶� case���� ������ ������� ������ �����̱� ������,
 * ���� ���� ����� �� �ִ�.
 * 
 * switch ���� ���Ǽ��Ŀ� ���� �� �ִ� ���� ���� byte, short, char, int�� �����ϴ�.
 * 
 * 
 * 
 */



public class Switchmain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - 3 ������ ���� �Է� : ");
		
		int num = sc.nextInt();
		
		if(num == 1) {
			
			System.out.println("one");
			
		} else if(num == 2) {
			
			System.out.println("Two");
			
		} else if(num == 3) {
			
			System.out.println("Three");
			
		} else {
			
			System.out.println("Error");
		}
		
		
		
		switch(num) {
		
		case 1 :
			System.out.println("one");
			break;
			
		case 2 :
			System.out.println("Two");
			break;
		
		case 3 :
			System.out.println("Three");
			break;
	
		default :
			System.out.println("Error");		
		}
		
	}
	
}
