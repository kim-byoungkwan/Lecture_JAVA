package kr.ac.kopo.day02_assignment;

import java.util.Scanner;

public class assignment_num_5 {
	
	public static void main(String[] args) {
		
		final double fixed_dollar = 1092.50;
		
		System.out.println("�޷��� �Է��ϼ��� ? ");
		
		Scanner sc = new Scanner(System.in);
		
		int putted_dollar = sc.nextInt();
		
		System.out.printf("��ȭ : %.2f��", fixed_dollar*putted_dollar);
		
	}
	
}
