package kr.ac.kopo.day12;

/*
 * 객체와 객체가 객체 내부에 들어있는 메소드와 멤버변수까지 완벽히 동일한지를 판단하기 위해서는 equals()메소드를 사용한다.
 * 왜냐하면 객체를 가리키는 참조변수의 주소값이 같은지아닌지를 비교하는 것이 아니기때문이다.
 * 
 * equals() 메소드는 object 클래스의 equals()메소드를 상속해서 사용하고 있는 것이다.
 * 그런데, 애초에 object 클래스에 존재하던 equals() 메소드는 객체의 참조변수가 갖는 주소값을 비교하는 것이 본질적인 형태였다.
 * 이러한 equals() 메소드를 인스턴스객체와 인스턴스객체가 완벽히 서로 같은지를 판단하기 위한 형태로 사용하려면 자식클래스에서
 * 다시 equals() 메소드를 오버라이딩해서 정의해야만한다.
 * 
 * 문자열을 비교할 수 있게해주는 equals() 메소드는 String클래스에 존재하는 equals() 메소드이고, equals()메소드는
 * object 클래스에존재하는 메소드가 오버라이딩되어 주소값이 아닌 실제 객체내부에 존재하는 값을 비교할 수 있도록 하는 것이다.
 * 
 * 어떤 객체와 객체가 같다고 하는 의미는 객체의 해쉬코드와 해쉬코드가 서로 같으면서 equals() 메소드가 true여야 성립되는 것이다.
 * 
 * 이미 String 클래스는 해쉬코드까지 고려된 메소드가 이미 기본적으로 만들어져 있기 때문에 메소드를 불러서 사용하면 되는 것이다.
 * 그래서 일반적으로 객체와 객체가 같은지를 비교할때에는 equals() 메소드를 새롭게 정의해야하기때문이다.
 * 
 * 오브젝트 클래스에 존재하는 clone 메소드는 기본적으로 shallow copy 방식을 구현한다.
 * 
 * 
 * 
 * 
 * 
 */


public class MapMain03 {

	public static void main(String[] args) {
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		if(m.equals(m2)) {
			System.out.println("m == m2");
		} else {
			System.out.println("m != m2");
		}
	}
}