package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// S�� �빮�� �̹Ƿ� Scanner Ŭ������ ���� �ڷ����̴�.
		// Scanner �����ڷ����� ���� Ű����� �Է��� ���� ���� �� �ִ� ���̴�.
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		char ch = sc.nextLine().charAt(0);
		// ���ڴ� �̿Ͱ��� ���ڿ��� ù��° ����� ǥ���ϴ� ������� �Է¹޴´�.
		
		
		
		
		System.out.print("���ڿ��� �Է� �Է��ϼ���: ");
		String str = sc.nextLine();
		// �������� �Է¹ޱ� ���ؼ��� nextLine �޼ҵ带 ����ؾ��Ѵ�. next()�� ����ϸ� next �޼ҵ�� �����̽���
		// ���͸� �������� ���ڴ����� ��� �޾Ƶ��̱� ������ �� ���� �ѵ���� str�� ����ǰԵǾ� ���ڿ��� �Է¹��� �� ����.
		System.out.print("str :  " + str);
		
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		// Ű����� �Է¹������� �׻� ���Ͱ��� ����Ʈ���� �������� ����Ʈ�� ������� �ʰ� ���ӵǴ� ���� ������ �� �ִ�.
		
		int a = sc.nextInt();
		// Ű����� ���� �Է¹ް� ������ �� ���� ���������� �Է¹ް��� �ϴ� ���� nextint()�� �ǹ��Ѵ�.
		System.out.println("a : " +a);
		
		
	}

}
