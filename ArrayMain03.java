package kr.ac.kopo.day04;

public class ArrayMain03 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = i+1;
			
		}
				
		
		System.out.println("< PRINT >");
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + '\t');
			
		}
		
		System.out.println();
		
		
		System.out.println("< PRINT >");
		
		for(int num : arr) {
			
			System.out.println(num + "\t");
			
		}
		
		
		int data = 1;
		
		for(int num : arr) {
			
			num = data++;
			
		}
		
		// ���� num������ arr�迭�� �����͸� ��� �ִ� ���纻���ν� � ���� ���� ���� data++ �� ���� �����ϴ���
		// for���� 1.5���������� ���� num ������ {} ����� �ѻ���Ŭ �ݺ��ɶ������� �������ִ� ���̹Ƿ�, �ٽ� ó������
		// ���ư� ��� num������ �ʱ�ȭ �Ǿ� �ٽ� arr�� ��Ұ��� �Ҵ�ǰ� �ȴ�. ��, 1.5������ for���� ����� ���ؼ�
		// �����ϴ� �޼ҵ��̴�.
		
		
		
	}

}
