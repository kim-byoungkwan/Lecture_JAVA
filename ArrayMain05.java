package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 50, 70, 30};
		
//		int[] copy = arr;
		
		// ���� �ڵ�� copy�� ǥ���ϴ� �ּҰ��� arr������ ǥ���Ǿ� �ִ� �ּҰ��� �Ҵ��ϴ� ���̴�. ��,
		// �� ������ �ϳ��� ��������� �ΰ��� ���� arr�� copy�� ����Ű���� �ϴ� ����ΰ��̴�.
		// �̷��� ����� shallow copy ���� ������ �Ѵ�. �̷��� ����� ���� ���� ������ ���̾ƴ϶�,
		// �ּҰ��� ������ ����̴�.
		
//		System.out.println("arr : " + Arrays.toString(arr));
//		
//		System.out.println("copy : " + Arrays.toString(copy));
		
		// shallow copy�� ���� �ּҰ��� ǥ���ϴ� ��������� ���ڿ��� ǥ���ϰԵȴ�.
		

//		int[] copy = new int[arr.length];
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			copy[i] = arr[i];
//			
//		}
		
		// ���� ����� deep copy ���
		
		int[] copy = new int[arr.length];
		
		System.arraycopy(arr, 0, copy, 0, arr.length);
		
		// ���� ���� �޼ҵ带 ����ؼ� deepcopy�� ������ �����ִ�.
		// �̶�, System Ŭ������ import ���� �ʾҴ� �� Ŭ������ java.lang ��Ű���� ��� �ֱ� �����̴�.
		// �ֳĸ� JVM�� �ڹٸ� �����Ҷ� �ڵ����� java.lang ��Ű���� �ҷ����� �����̴�.
		
		
		System.out.println("arr : " + arr);
		
		System.out.println("copy : " + copy);
		
		// shallow copy�� ��� ���� ��������� ����Ű�� �����Ƿ�, �����ּҰ��� ���� �ִ� ���� arr�� copy��
		// �ּҰ��� ������, deep copy�� ���� �ٸ���.
		
		System.out.println("arr : " + Arrays.toString(arr));
		
		System.out.println("copy : " + Arrays.toString(copy));

		
		
		
		copy[2] = 100;
		
		// shallow ī���� ��� copy�� ���� ��������� ����Ű�� �ּҰ��� ���� �ְ�, �̰�� copy�� arr�� ����
		// ��������� �迭�� ����Ű�Ƿ� arr�� copy �迭�� ���� ���� ������, ���� deep copy ����� ��� ���� 
		// copy ������ arr�迭�� �ٸ� �������� ��������� ����Ű�Ƿ�, �� ��������� �迭�� ���� �ٲٰ� �ȴ�.
		
		
		System.out.println("arr : " + Arrays.toString(arr));
		
		System.out.println("copy : " + Arrays.toString(copy));
		
		
	}

}
