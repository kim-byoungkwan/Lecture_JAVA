package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * if(����1) {
 * 		����1;
 * } else {
 * 		if(����2) {
 * 			����2;
 * 		} else {
 * 			����3;
 * 		}
 * }
 * 		
 * �Ʒ��� ���� ���ǹ��� �ۼ��� ����, ������ ������ ���� ���� �Ϳ��� ���� ���ǹ��� �ۼ��ϰų�, ���� ū �Ϳ������� ���ǹ��� �ۼ��ϴ¹������
 * �ۼ��ؾ� �ڵ� �ۼ��� ȿ�����̴�.
 * 
 */


public class IFMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �ð��� �Է��ϼ���(7��30�� : 730) => ");
		
		int time = sc.nextInt();
		
		if(time < 815) {
			
			if(time < 800) {
				
				System.out.println("�ɾ��");
				
			} else {
				
				System.out.println("������ ź��");
				
			}
			
		} else {
			
			System.out.println("�ýø� ź��");
			
		}
		
		
		
		if(time < 800) {
			
			System.out.println("�ɾ �б��� ����");
			
		} else {
			
			 if(time < 815) {
				 
				 System.out.println("������ Ÿ�� �б��� ����");
				 
			 } else {
				 
				 System.out.println("�ýø� Ÿ�� �б��� ����");
			 }
			
		}
		
	}
	
}
