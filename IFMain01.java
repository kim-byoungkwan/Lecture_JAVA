package kr.ac.kopo.day02;

/*
 * ���ǹ��� ����̶�� �Ѵ�. �̹����� �������� ������ �����ϴ� �����̱⶧���̴�.
 * 
 * �����ϰ� �ִ� å �Ǽ� : 1
 * 1 book
 * 
 * �����ϰ� �ִ� å �Ǽ� : 4
 * 4 books
 * 
 * if���� else�� ���� ȥ�ھ��� �� ������, else���� if���� ���� �� ����.
 * 
 * �ڹٿ����� ��� {}�� �׻� Ű���� ���� ���� ���� �ǰ�����̴�.
 * 
 */


public class IFMain01 {
	
	public static void main(String[] args) {
		
		int book = 4;
		
		System.out.print(book + " book");
		
		if(book >= 2) {
			
			System.out.println("s");
			
		}
		
		if(book == 1) {
			
			System.out.println(book + " book");
			
		} else {
			
			System.out.println(book + " books");
			
		}
				
	}
	
}
