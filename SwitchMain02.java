package kr.ac.kopo.day02;

/*
 * 
 * ���� �ڷ������� ������ ��ü�� ���Ͽ� == �� ����񱳸� �Ҷ��� �׻� ��ü�� ����� �����Ͱ� �ƴ϶�, ��ġ���� �����Ǵ� ���谡 �ִ�.
 * ����, ���� ���� ���ϱ� ���ؼ� == ���ϸ� ��ġ���� �񱳵ǹǷ� false�� �����Ƿ� equals�� ���Ǿ���Ѵ�.
 * 
 * ����, switch case ������ switch �������ǰ� case ������ ���� ��Ī�Ǵ����� �ľ��ϴ� ���������� ==�� �ƴ϶�,
 * equals �޼ҵ尡 switch case���� �۵��ϰ� �ִ� ���̴�.
 * 
 */


public class SwitchMain02 {
	
	public static void main(String[] args) {
		
		String str = new String("Hello");
		
		if (str == "Hello") {
			
			System.out.println("True");
			
		} else {
			
			System.out.println("False");
			
		}
		
		
		switch(str) {
		
		case "Hello" :
			
			System.out.println("True");
			
			break;
			
		default:
			
			System.out.println("False");
	
		}
			
	}
	
}
