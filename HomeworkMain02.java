package kr.ac.kopo.day03.homework;

public class HomeworkMain02 {
	
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random() * 30) +1;
		
		int num2 = (int)(Math.random() * 30) +1;
	
		int num3 = (int)(Math.random() * 30) +1;
		
		int num4 = (int)(Math.random() * 30) +1;
		
		// Math.random()�� 0���� 1�̸��� ������ ����ȴ�.
		// 10�̸��� ������ �����Ϸ��� ���� ���� �Ҽ����� �Ǽ������� ���� �� ���� ������ ������ ��������ȯ�ϴ� ������ �ʿ��ϴ�.
		
		System.out.println(num1 + " : " + num2 + " : " + num3 + " : " + num4);
		
		
		int max = num1 > num2 ? num1 : num2;
		// = ���� �������� �켱������ ��� �������߿� ���� ����.
		// ���� ���� �ڵ�� ���׿����ڰ� ���� ����ǰ�, �� ������� max�� �켱������ ���� ���� ���� ������ = �� ����
		// ���������� ���ԵǴ� ���̴�.
		
		if(max < num3) {
			
			max = num3;
			
		}
		
		if(max < num4) {
			
			max = num4;
			
		}
		
		// ���� �ڵ�� if���� ���������� ǥ���Ǿ� ������, max��� �������� ������ ���ؼ� ��ʸ�Ʈ���� ��������� ����Ǵ� ���̴�.

	}
	
}
