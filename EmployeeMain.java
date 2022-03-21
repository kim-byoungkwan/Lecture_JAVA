package kr.ac.kopo.day08;

/*
 * 멤버변수를 객체인스턴스에 점. 을 통해 직접 접근하는 방법은 클래스내부에 존재하는 멤버변수가 겉으로 드러나기때문에,
 * 그렇게 좋은 코드는 아니다. 은닉성이 훼손되기 때문이다.
 * 
 * static 키워드는 어떤 공통적으로 사용하는 멤버변수를 설정하여 공유된 접근을 해야하는 경우에 사용된다.
 * 
 * 어떠한 변수를 main 메소드에 설정하는 것은 그리 좋은 것이 아니다. 공유된 변수의 접근을 해야하는 경우에 오류가 생길 수 
 * 있기 때문이다.
 * 
 * static 변수는 JVM이 객체를 생성하기 이전에 이미 존재하는 클래스를 가장먼저 로딩하는데 이때 이미 메소드영역이라는저장공간
 * 에 가장 먼저 생성되게된다.
 * 
 * static변수는 클래스이름.static변수 와같은 형태로 유일하게 클래스에 직접 .을 사용해서 접근할 수 있는 것이다.
 * 
 * static 변수를 컨트롤하기 위해선, 가장 빨리 형성되어 저장공간에 객체로서 존재하는 static변수가 생성된 시점에 마찬가지로
 * 생성된 메소드가 있어야 하므로, 이러한 메소드를 정의할 대, static 메소드를 정의하게된다. 일반 메소드로는 
 * static변수가 생성된 시점에 일반 메소드는 오직 new 를 통해 생성된 객체인스턴스가 존재해야만 그것을 통해 접근할 수 있으므로
 * static변수가 생성된 시점에는 사용할 수 없기 때문이다.
 * 
 * 이클립스에선 일반 멤버변수와 static 변수를 구분하기 위해 static 변수를 이텔릭체로 기울여서 표현하게된다.
 * 
 * 일반적으로 static변수를 자신의 클래스에서는 그냥 변수이름으로 접근할 수 있지만, 일반적으로 static변수임을 표현하기 위해
 * 클래스이름.static변수 와같은 형태로 접근하여 표현하게된다. 더 좋은 가독성을 위해서이다.
 * 
 * 필드값 = 멤버변수 는 일반적으로 절대 외부에 공개하지 않는다.
 * 
 * static을 쓰는 가장 큰 이유는 서로 관련이있는 것들을 클래스로 묶을 수 있기때문이다.
 * 
 * System.out.println 에서 System은 클래스이고 out은 static 변수이다. 그런데 이경우 out 변수는 static변수이면서
 * new를 통해 생성된 인스턴스객체이므로, 그 객체가 갖고 있는 println이라는 메소드를 사용할 수 있는 것이다.
 * 이와같은 방식으로 실제로 static 변수를 매우 많이 사용하고 있다.
 * 
 * String.valueof() 에서 valueof() 메소드는 static 메소드이지만, "문자열".length()에서는 "문자열"이라는 객체에 있는
 * 일반 메소드 length()에 접근하는 것이다. 즉, 인스턴스 객체에 .점을 통해 접근하는 것은 일반 메소드이다.
 * 왜냐하면, 일반적으로 static 메소드는 클래스이름.메소드 로접근하기 때문이다. static 메소드를 객체.static 메소드이름 과같이
 * 접근할 수 있지만, 이러한 방식은 선호되지 않는다. 
 * 
 * 
 * static 변수는 한 클래스당 하나씩만 정의할 수 있다.
 * 어떠한 한 클래스에 static name; 이라는 static 변수가 정의됐을때, 다른 클래스에 static name이라는 static 변수를
 * 똑같은 이름으로 정의할 수 있지만, 두 static 변수는 엄연히 메소드 영역이라는 저장공간에 다른 저장공간에 할당되어 생성된
 * 서로다른 static 변수이다. 이러한 의미에서 한 클래스당 하나의 static 변수를 정의할 수 있다는 것이다.
 * 
 * 상속이란 부모의 것을 자식인 내것인것처럼 사용하는것을 말한다. 즉, 부모의 클래스의 멤버변수와 메소드를 자식인 나의 클래스에 있는
 * 멤버변수나 메소드처럼 사용할 수 있도록 해주는 기능을 말한다.
 * 
 * 상속이라는 것은 클래스와 클래스의 관계를 말한다.
 * 
 * 상속은 어떠한 클래스에 있는 멤버변수나 메소드를 다른 클래스에서 중복적으로 사용할 때, 사용하는 기능이다.
 * 
 * is a pattern, kind of 패턴 일때 서로 상속관계로 만들 수 있다.
 * 
 * has a pattern은 일반적으로 상속관계가 아닌 멤버변수화시킨다.
 * 
 * class 경찰{
 * 
 * 		총 gun;(소유하고 있는 총과 같은 것은 멤버변수화 시킨다)
 * ) 
 * 이와 같은 has a pattern에서는 멤버변수화시킨다.
 * 
 * class 동물 {
 * 
 * }
 * 
 * 
 * class 강아지 extends 동물 {
 * 
 * 
 * }
 * 
 * 이와 같이 강아지는 동물의 한 종류인 관계에 있을 때, 상속관계를 규정할 수 있다.
 * 
 * 눈에 보이는 사물들을 클래스화시켜서 상속관계로 규정하기 위해서는 kind of pattern이나 is a pattern을 반드시 만족해야만이
 * 사용할 수 있다.
 * 
 * 위의 조건을 만족해야만 다형성이라는 개념을 사용할 수 있다.
 * 
 * 상속관계를 쓰는 가장 큰 목적은 변화에 둔감하게 해주기 위해서 사용하는 것이다.
 * 
 * A -> B-> C-> D 와 같은 클래스의 상속관계가 형성됐을대, 만약 B 클래스가 b-1 클래스로 바뀌었을때또, A클래스와 C클래스는
 * B 클래스가 B-1 클래스로 바뀌었는 지를 모르는 것이 상속관계가 형성됐을때 성립한다. 이것을 상속에 의해서 B라는 클래스의 변화에
 * 다른 클래스들이 둔감하게 된 것이다.
 * 즉. 위와같이 클래스들을 변화에 둔감하게 만들기 위해서는 표준이 있어야한다.
 * 
 * extends 키워드의 왼쪽의 클래스는 오른쪽 클래스의 한 형태이다 라고 말할 수 있다.
 * 
 * class Employee{
 * 
 * }
 * 
 * class Manager extends Employee{
 * 
 * 
 * }
 * Manager 클래스는 Employee 클래스의 한 형태이다 라고 말할 수 있는 것이다.
 * 이때 Manager 클래스를 하위클래쓰 또는 서브클래스 혹은 자식클래스 라고 하고,
 * Employee클래스를 super 클래스 라고 하거나, 부모클래스라고한다.
 * 이러한 상속관계가 있을때, Manager m = new Manager() 를 통해 객체 m을 생성하면 Manager 클래스는 Employee클래스를
 * 상속받으므로, m에는 Manager 클래스의 모든 멤버변수와 메소드와함께 Employee 클래스의 모든 멤버변수와 메소드가 모두 저장되어있는
 * 객체공간이 힙영역에 생성된다.
 * 그리고, 이와같이 상속관계가 규정된 경우 자식 클래스에서 this 키워드를 통해서 부모클래스의 멤버변수와 메소드에 접근할 수 있는데,
 * 내가 접근한 것이 부모클래스의 것이라는 것을 명확히 해주기 위해 this가 아닌 super를 사용해서 super.변수 or 메소드 와 같이
 * 표현할 수 있다.
 * 
 * 그리고, 자식클래스에 존재하는 생성자를 정의할때, 자식클래스를 통해 객체인스턴스를 new 키워드에 의해 생성할때,
 * 내부적으로 자식클래스의 {}블록 안에서는 super() 이라는 부모클래스를 생성하는 생성자가 자동으로 JVM에 의해 생성되게된다.
 * 따라서, super()와 this() 생성자는 동시에 사용할 수 없다. 만약 super() 생성자를 표현하지 않아도, 가장 먼저 자식클래스의
 * 생성자가 동작할 때 super() 생성자가 동작하면서 부모클래스의 객체공간을 먼저 형성하고 그 다음에 자식클래스의 생성자의 디폴트클래스가
 * 표현되어있지 않아도 동작하여 자식클래스의 객체공간이 형성된다음에, 최종적으로 Manager m = new Manager() 에의해 생성된 
 * 인스턴스객체 m에는 부모클래스의 객체공간과 자식클래스의 객체공간이 합쳐진 객체공간, 즉, 이안에 부모클래스의 모든 변수와 메소드와
 * 자식클래스의 모든 변수와 메소드가 존재하는 하나의 객체공간이 형성되고, m 변수는 이 하나의 객체공간을 가리키는 주소값이 저장되어있다.
 * 
 *  
 * 
 * 자식클래스에 부모클래스와 똑같은 이름과 자료형의 변수를 규정할 수 있다.
 * 
 * 
 * 
 * 
 * 객치지향의 개념에서는 클래스와 클래스의 관계를 그림으로 표현해야할 필요성이 있다. 이때 필요한 것이 UML이다.
 * 
 * 클래스와 클래스들의 관계를 보기위해 사용하는 것이 class diagram이라고 한다.
 * 클래스다이어그램의 네모박스에 맨윗칸에는 패키지의 이름을 포함한 클래스의 이름을 쓴다.
 * 두번째 칸에는 클래스의 이름:자료형
 * 세번째 칸에는 생성자를 포함한 메소드():return 타입
 * 로 규정하여 표현하게된다.
 * 
 * 자바에서는 하위클래스가 가질 수 있는 상위클래스는 오직 한개이다. 즉, 오직 단일 상속만 지원한다.
 * 즉, A라는 자식클래스가 C클래스를 상속받고 D클래스를 상속받는 것은 불가능 하다는 것이다.
 * 따라서, 하나의 자식클래스 A에 대한 부모클래스는 오직 하나만 존재한다는 것이다. 다중상속을 지원하지 않는다는 것이다.
 * cf. c++은 다중상속을 지원한다.
 * 
 * 서브클래스는 수퍼클래스가 가지고 있는 멤버변수와 메소드를 나의 클래스, 즉 서브클래스에 존재하지 않더라도 내것처럼 사용할 수 있다.
 * 또한, 부모클래스 즉, 수퍼클래스는 자식클래스에 존재하는 멤버변수나 메소드에 마음대로 접근할 수 없다.
 * 그리고, 부모클래스에 존재하는 모든 멤버변수와 메소드를 자식클래스에서 내것처럼 모두 사용할 수없는 경우도 존재하는데 이경우는
 * 접근 제한자가 존재할 때이다.
 * 
 * 
 * 오버로딩은 동일한 클래스내에서 매개변수가 다르지만 이름은 같은 동일한 이름의 메소드를 정의하는 것이지만, 
 * 오버라이딩은 부모클래스의 메소드를 하위클래스에서 동일한 이름과 자료형으로 다시 선언하는 것을 말한다. 이때, 하위 클래스에 다시 선언된
 * 오버라이딩된 메소드는 부모클래스의 메소드와 자료형과 return타입, 그리고 매개변수가 완벽히 무조건 같아야
 * 오버라이딩의 개념이 성립하는 것이다. 오버라이딩의 개념에서는 {}안의 내용부만 다를 수 있다. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 *  
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class EmployeeMain {

	public static void main(String[] args) {
		
//		System.out.println("총사원수 : " + Employee.employeeCnt + "명");
		Employee.employeeCntInfo();
		
		Employee e = new Employee("홍길동", 3300, "사원");
		Employee e2 = new Employee("강길동", 3800, "대리");
				
		e.info();
		e2.info();
		
		Employee.employeeCntInfo();
	
		
	}
}
