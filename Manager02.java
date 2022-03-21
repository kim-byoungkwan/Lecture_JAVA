package kr.ac.kopo.day08.extend;

/*
 * 관리자 Manager은 사원 Employee의 한 형태이므로 상속관계로 표현할 수 있다. 즉, Employee가 Manager보다 훨신 큰 형태의 개념이다.
 * 
 * 상속관계에 있을 때, employee 클래스에 대한 객체공간이 먼저 만들어지고, manager 클래스에 대한 객체공간이 뒤이어 만들어진다. 이는
 * super() 생성자가 먼저 생성되어 동작하기 때문에 가능한 것이다.
 * 즉, 자식 클래스의 생성자가 동작할 때는 항상 블록{}안에 부모 클래스의 객체공간을 생성해주는 super() 생성자가 생성되어 가장 먼저 동작하고
 * 있는 것이다.
 * 
 * 자식 클래스에서 생성자가 존재할때, 그 생성자의 매개변수가 존재하는 생성자일 경우 디폴트 생성자는 동작하지 않는다. 그러므로, 
 * 자식클래스가 부모클래스를 상속받아서 동작할 때, super() 생성자가 자식클래스의 생성자가 동작하기전에 자동으로 동작하지만,
 * 이경우 자식 클래스의 디폴트 생성자는 존재하지 않으므로, 에러가 발생하게 된다. 따라서,
 * 항상 상속의 관계에서 자식클래스에서 오류발생하지 않게하기위해 디폴트생성자를 먼저 생성해줘야한다.
 * 자식클래스의 디폴트생성자가 실행될땐, 항상 내용부{}안에 존재하는 super()생성자가 자동으로 먼저 가장먼저 실행되어 부모클래스의 객체가 생성되고,
 * 자식클래스의 생성자가 실행되어 자식클래스의 객체가 생성된다.
 * 
 * 
 * 어떠한 메소드를 실행할 때, 나의 메소드에 존재하지 않으면 자동으로 this.메소드를 호출하여 부모클래스에 있는 동일한 이름의 메소드를 찾게된다.
 * 
 * 이때 void info() 메소드는 부모클래스에도 존재하고 자식클래스에도 동일한 선언부의 형태로 존재하므로 자식 클래스에 부모클래스의 메소드가 오버라이딩
 * 된 것이다. 이때 자식 클래스에서 void info() 메소드는 {} 블록안의 내용부만 부모클래스의 void info()와 다르다.
 * 
 * 또한, 부모클래스의 메소드가 오버라이딩 됐을 때, 이를 구분하기 위해 자식클래스의 오버라이딩된 메소드에 @override와 같은 표시를 해주게된다.
 * @Override 기호를 사용하면 부모클래스의 메소드가 자식클래스의 메소드와 오버라이딩 관계가 완벽히 성립하고 있는지까지 판단해서 보여주게된다.
 * 
 * 부모클래스와 자식클래스의 상속관계가 성립할때, this.변수,메소드 기호를 통해서 자신의 클래스 내부에 있는 변수와 메소드 뿐만 아니라, 
 * 부모클래스에 존재하는 변수와 메소드까지 접근할 수 있게된다. 단 이경우는 자신의 클래스에 this.뒤에 표현한 변수와 메소드가 존재하지 않는 경우에만
 * this의 범위가 부모클래스까지 확장되는 것이다.
 * 즉, this 의 범위는 본질적으로 "manager extends employee" 하나의 이름을 갖는 클래스의 객체공간에 존재하는 모든 변수와 메소드를 접근할 수 있고
 * 이때의 객체공간에는 manager 객체와 employee 객체가 합쳐진 객체공간이므로 하나의 클래스의 객체공간을 의미하는 this가 자식 클래에스에서
 * 부모클래스의 멤버변수와 메소드에 까지도 접근할 수 있는 것이다.
 * 단, 메소드가 부모클래스에서 자식클래스로 오버라이딩된 경우에는 자식클래스에 부모클래스의 메소드와 동일한 이름의 메소드가 존재하므로,
 * this.메소드는 자식클래스에 존재하는 메소드를 의미하게된다. 즉, 이때의 this의 범위는 부모클래스의 메소드까지 확장되지 않고,
 * 자식클래스의 범위에서만 작용하는 것이다.
 * 
 * 그래서 자식클래스의 void info() {
 * 
 * 			this.info() //는 자기자신 info를 의미하여무한순환에 빠지게된다.
 * 
 * }
 * 
 * 매개변수가 있는 자식클래스의 생성자는 super() 와같은 부모클래스의 기본생성자는 실행되지만 super(매개변수) 와 같은 형태의 생성자는
 * 자동으로 실행되지 않는다. super(매개변수) 와같은 매개변수가 존재하는 부모클래스의 생성자는 구체적으로 선언해줘야만 실행될 수 있게된다.
 * 
 * 멤버변수나 메소드를 접근할 수 있는 범위를 지정해주는 것을 접근제한자라고 한다. 이때 모두가 접근할 수 있음을 의미하는 접근제한자를 public이라고하고,
 * 그러므로, public는 누구나 접근할 수 있는 변수나 메소드가 되므로 보안성이 취약해진다.
 * 반면, 나만 접근할 수 있도록 변수나 메소드를 설정하는 것을 private라고 하고, 이렇게 private로 선언된 부모클래스의 변수나 메소드는
 * 자식클래스가 부모클래스를 상속했다 할지라도, 자식클래스에서 접근할 수 없게 된다.
 * 그래서, 이와같은 private를 활용하여 자신의 클래스에 있는 멤버변수와 메소드는 private로 설정하는 것이 보안이 높으므로 원칙으로 정한다.
 * 다만, 자식에서 직접적으로 private된 부모클래스의 변수나 메소드를 접근할 수는 없지만, super.를 활용화여 부모 클래스에 먼저 접근하고, 
 * super.변수or메소드 와같은 방식으로 실행하게되면, 이미 부모클래스안에서 변수와 메소드에 접근하고 있는 것이므로(자식클래스에서 직접접근하는것이아니고)
 * private 으로 선언된 변수나 메소드도 부모클래스 자기 자신안에서 활용하고 있는 상황이므로 오류가 발생하지 않는다. 왜냐면 본질적으로 자신의 클래스
 * 안에 있는 변수와 메소드를 사용하고 있는 것이기 때문이다.
 * 
 * 그러므로 위와 같은 성질을 이용해서 super.메소드() or super(매개변수) 를 활용해서 부모자식간의 변수와 메소드를 제어하게된다.
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


//관리자(Manager02)는 사원(Employee)의 한 형태다 조건 부합 => 상속관계 표현
public class Manager02 extends Employee {

Employee[] empList;	// 관리사원목록

Manager02() {}

Manager02(String name, int salary, String grade, Employee[] empList) {
	this.name = name;
	this.salary = salary;
	this.grade = grade;
	this.empList = empList;
}

@Override
void info() {
	super.info();
	
	System.out.println("------------------------------------------");
	System.out.println("\t관리사원 목록");
	System.out.println("------------------------------------------");
	for(Employee e : empList) {
		e.info();
	}
	System.out.println("------------------------------------------");
}
}
