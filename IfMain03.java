package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * ��ø�� if���� ����ϸ� ���ǵ��� ���� �������� ���迡 �����ִ� ��ó�� ��������, �����δ� ���ǵ��� �������� ���
 * �ڵ带 �ؼ��ϱ⿡ �ſ� ������ ���� �� �ִ�. �׷��Ƿ�, �̷��� ��Ȳ���� �������� ���ǵ��� ���������� �����ϱ� ���� ǥ���ϱ� ���ؼ�
 * elseif ���� ����ϰ� �ȴ�. ���������� �ǹ̰� �����ϱ� �����̴�.
 * 
 * 
 * if ���� ��� ó���� ���ϸ� ������ ������ 1���� �ڵ常 ������� �ν��ϰ� �����Ѵ�. �׸���, �� ���� �ڵ�� ������ ����ǰԵȴ�.
 * 
 * 
 */


public class IfMain03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �ð��� �Է��ϼ���(7��30�� : 730) => ");
		
		int time = sc.nextInt();
		
		if(time >= 800 && time < 815) {
			
			System.out.println("������ Ÿ�� �б� ����");
			
		} else if(time < 800) {
			
			System.out.println("�ɾ �б�����");
			
		} else {
			
			System.out.println("�ý�Ÿ�� �б�����");
			
		}
		
	}
	
}
