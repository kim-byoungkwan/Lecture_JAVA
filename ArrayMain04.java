package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// {} ���Ͱ��� new�� ������� �ʴ� ����� �ݵ�� int[] arr�̶�� �ڵ�� �ݵ�� �԰� ��߸�
		// ������ ����̴�.
		
//		arr = {5, 4, 3};
		
		// �׷��Ƿ� ���� ���� ����� �����Ͻ� ������ �߻��ϰ� �ȴ�.
		
		arr = new int[] {5, 4, 3};

		// ���� ���� new �޼ҵ带 �̿��ؾ߸� ������ �߻����� �ʴ´�.
		
		
//		int[] arr = new int[] {10, 20, 30, 40, 50};
		
		System.out.println("arr : " + Arrays.toString(arr));
		
	}
	

}
