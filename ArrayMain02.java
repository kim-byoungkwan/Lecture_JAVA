package kr.ac.kopo.day04;

import java.util.Arrays;

// �Ʒ��� ���� �ڵ忡�� strArr �̶�� �������� strArr�̸��� ���ڿ� �迭�� �����Ͱ� ����Ǿ� �ִ� �迭�� ����Ű��
// �ּҰ��� ����Ǿ� �ִ�. �׷���, �� �ּҰ��� ��Ʈ�� �迭�� ���� ������ ���� ����� ������ ����Ű�� �ִ� ���� �ƴ϶�,
// ���� �����͸� ����Ű�� �ִ� �ּҰ��� �����ִ� �迭�� ���� �ּҰ��� ����Ű�� �ִ�. �̶�, ���� ���ڿ� �����ʹ�
// ���������� �������� �����ϰ� �ִ� �����̴�. ��������� string �����ڷ������� ������� ��ü�� ������ �ּҰ��� ���� �ִ�
// �迭�� �����ϰ� ���� ���� �����ִ� �����Ͱ� ���������� �����ϴ� ���̴�. 

public class ArrayMain02 {
	
	public static void main(String[] args) {
		
//		String[] strArr = {"�����ͺм�", "�ڹ�", "����"};
		
//		String[] strArr = new String[3];
//		
//		System.out.println("���ڿ��� �� ���� : " + strArr.length + "��");
//		
//		System.out.println("ù��° ���ڿ� : " + strArr[0]);
//		
//		System.out.println("�ι�° ���ڿ� : " + strArr[1]);
//		
//		System.out.println("����° ���ڿ� : " + strArr[2]);
		
		// �����ڷ������� ���� ��ü�� �Ҵ�Ǵ� �ʱ갪�� null�̴�.

		String[] strArr = new String[5];
		
		int loc = 0;
		
		strArr[loc++] = "������";
		
		strArr[loc++] = "�����ͺм�";
		
		strArr[loc++] = "�ڹ�";
		
		strArr[loc++] = "����";

		// ���� ���� ������ ���������� ������� �迭�� ���� �߰��� �� �ִ�.
		
		System.out.println("< index�� �̿��� ��� >");
		
		for(int i = 0; i < strArr.length; i++) {
			
			System.out.println(strArr[i]);
			
		}
	
		System.out.println("< JDK 1.5������ for���� �̿��� ��� >");
		
//		for(��������:�迭��){} �̿� ���� ��Ŀ� ���ؼ� �迭�� �����ϴ� ��� ���Ұ��� ������ �� �ִ�.
		
		for(String s : strArr) {
			
			System.out.println(s);
			
		}
		
		System.out.println("< Arrays.toString() �޼ҵ带 �̿��� ��� >");
		
//		Arrays.toString(�迭��) �̿� ���� ��Ŀ� ���� �迭�� �����ϴ� ��� ��Ҹ� �ϳ��� ���ڿ��� ǥ���Ͽ� ����Ҽ��ִ�.
		
		String result = Arrays.toString(strArr);
		
		System.out.println(result);
		
	}
	
}
