package kr.ac.kopo.day02;

public class OperationMain01 {
	
	public static void main(String[] args) {
		
		int a = 1, b = 0, c = -1;
		
//		boolean bool = (++a > 1) || (++b > 1);
		// ��ȣ�� ��� ���迬���ڰ� �켱������ ���� ������ �ùٷ� ����� ���´�
		// �̹� ���� ��ȣ�� ��ǻ�ʹ� ������� True���� �˱� ������ ȿ������ ��ǻ�ʹ� �ڿ����� ������������ �ʴ´�.
		// ���� ���� �Ʒ��� ����Ʈ �������� b���� 0���� ǥ���ȴ�.
		
//		boolean bool = --a > 1 && ++b > 1 || ++c > 0;
		// && �����ڰ� || �����ں��� �켱������ ����. ���� ǥ������ �ʾƵ� �ڵ����� &&�� ��ȣ�� ���� �ִ� ���̴�.
		// �� ��� ++b�� �������� ���� �ʴ´�.
		// �� ��� ++c�� ����ȴ�.

//		boolean bool = a++ > 0 || b-- >= 0 && c++ <= 0;
		// ���� ��쿡�� ��ǻ�ʹ� ������ ���ʿ��� ���������� �о����.
		// ���� a++ ���� ������������ ; �����̴�. ;�������� ������ �����ִ� ���Ҹ��� �ϴ� ���̴�.
		// ���� ; �ݷ� �������� a �������� ��ȭ ���� �ٷ� �������� �Ǵ� ���̴�.
		
		boolean bool = b-- >= 0 && c++ <= 0 || a++ > 0;
		
		
		System.out.println("bool : " + bool);
		
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		
		
	}

}