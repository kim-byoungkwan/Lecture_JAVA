package kr.ac.kopo.day07;

//유니코드값이 같지 않은 순간 바로 그 유니코드값의 차이를 return하고 동작을 멈추어 필요없는 뒤의 동작을 하지않는다.
// "hello"와 같은 문자열을 상수문자열이라고 한다. 이러한 상주 문자열은 문자열 공간이 계속해서 만들어지는 것이아니다.
// 이러한 상수 문자열은 메소드영역이란 공간에 형성된다.
// 반면에 new string("hello") 를 사용하면 힙영역에 저장공간이 형성되어 str과 str2가 갖고 있는 주소값이
// 다르므로 서로 다른 객체 공간을 가리키고 있으므로 다르다는 값이 도출된다.
// 공유할 수 있는 영역을 메소드 영역이라고한다. 이러한 메소드영역에 저장된 상수문자열은 한번 메소드영역에 만들어지면
// 소프트웨어를 종료하기전까지는 사라지지 않는다.이러한 비효율이 있기때문에 항상 상수문자열을 사용할수는 없는 것이다.
// 상수문자열로 메소드 영역에 생성된 상수문자열은 오직하나만 존재하는 그 상수 문자이므로, str = 상수문자열 ,
// str2  = 상수문자열은 str 과 str2모두 오직 하나 메소드영역이라는 공유영역에 존재하는 그 상수를 가리키므로,
// 같은 주소값을 가져서 str == str22는 이경우 true가 도출된다.

// == 동등비교는 그 어떤 언어에서도 참조변수와 참조변수를 비교하는 상황에서는 항상 주소값을 비교하는 것이다. 그러나
// 기본자료형 변수는 변수 그자체가 값을 직접갖고있으므로 변수가 주소값을 갖고 있지 않으므로 값을 비교하게되는것이다.

// str == str2는 본질적으로 변수안에 들어있는 값는 주소값이므로, 결과적으로 주소값이 같은지 다른지를 비교하는 문장이다.

// 이러한 == 동등비교의 성격에 의해서 실제 변수가 가리키고 있는 문자열의 문장그자체를 비교하기 위해선 ==가 아닌
// equals 메소드를 사용해서 비교하게된다.

// string로 한번만들어진 문자열은 변화하지 않는다.

// 객체.메소드(주소값을갖고있는변수즉객체를가리키고있는변수) 의 경우에서는 객체는 클래스의
// 모든 멤버변수와 메소드를 갖고있으므로, 점. 을통해 멤버변수와 메소드에 접근할 수 있고, 이때 메소드의 정의부
// {} 블록안의 부분에는 메소드가 객체와 ()안의 변수를 비교하는 역할을 하는 메소드인경우 메소드안에는 this.멤버변수
// 의 형태가 정의되어 객체.에서의 객체가 갖고 있는 멤버변수를 의미하는 문장이 있을 것이다.
// 이와같이 객체.메소드(변수) 의 경우에서 객체가 멤버변수를 갖고 있고, 메소드가 그 멤버변수에 접근하여 메소드를
// 적용하는 경우인지를 아닌지를 생각할줄알아야한다. 만약 아닌 경우, 객체에 존재하는 메소드에 접근하여 ()안의 
// 매개변수를 적용하는 경우로 동작하는 것이다.


public class StringMain02 {

	public static void main(String[] args) {
		
//		String str = "Hello";
//		String str2 = "Hello";
		String str = new String("Hello");
		String str2 = new String("HELLO");
		
		System.out.println("str  : " + str);
		System.out.println("str2 : " + str2);
		
		if(str == str2) {
			System.out.println("주소비교 : 같다");
		} else {
			System.out.println("주소비교 : 다르다");
		}
		
		if(str.equals(str2) == true) {
			System.out.println("문자열비교 : 같다");
		} else {
			System.out.println("문자열비교 : 다르다");
		}
		
		System.out.println("대소문자관계없이 문자열 비교 : " 
						+ str.equalsIgnoreCase(str2));
		
		
	}
}
