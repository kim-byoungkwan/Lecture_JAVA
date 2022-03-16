package kr.ac.kopo.day06;

//객체지향에서 메소드의 의미는 객체가 갖고 있는 동작들을 표현하는 것이다. 객체가 갖고 있는 속성은
//멤버변수로 클래스에 설계한다.

//메소드도 본질적을 집합의 형태이다. 배열은 같은 타입의 변수를 모아놓은 집합이고,
//메소드는 세미콜론; 으로 구분된 문장들을 모아놓은 집합이라고 볼수있다.
//세미콜론으로 구분된 문장들을 모아놓은 집합인 메소드를 만든이유는 실질적으로 유지보수를 위해서 만든것이다.

// 메소드가 없으면 반복되는 문장들을 수정하거나 보수할때 매우 번거로운 방식을 사용해야한다.
// 메소드가 없으면 반복되는 문장들을 만드는 것 까지는 할 수 있지만, 수정하고 보수하는 과정은
// 매우 번거롭게된다.
// 즉, 메소드는 문장들을 모아놓은 집합의 개념이므로, 반복적인 문장을 반복해야하는 상황에서 매우 효과적
// 으로 사용할 수 있게된다. 또한, 메소드는 모두 클래서 안에서만 정의될 수 있는 개념이다.
// 또한, 메소드를 정의할 때엔 { } 기호를 사용하여 내가 메소드안에 정의할 문장들의 집합을 표현해주는 기호를
// 사용한다. { } 기호안에 정의된 문장들의 집합은 모두 하나의 메소드를 구성하는 집합인 것이다.

// 반환형 메소드이름([파라미터]){
//	문장;
//	문장;
//	}
// 이와 같은 형태가 메소드를 정의하는 자바의 문법인 것이다.

// 메소드를 정의할때엔
// 반환값 메소드이름 () 
// 이 형태가 가장 기본적인 메소드의 형태이다.
// 만약 반환값이 void으로 정의된 경우엔 메소드를 사용할때, 메소드이름() 와같은 형태로 바로 사용할 수 있다.
// 메소드이름() 의 의미는 메소드이름의 메소드가 갖고있는 {} 블록안에 들어있는 문장들의 집합을 실행해줘라는 의미이다.

// 자바에선 프로그램의 시작과 끝은 main 메소드가 알려준다. 메인메소드를 실행할때 메인메소드의 블록안에
// 메소드가 존재하면 메소드가 정의된 클래스로 가서 정의된 메소드의 블록안의 프로그램을 실행하고, 다시 
// 실행되고 있던 메인 메소드의 시점으로 돌아와서 코드를 순서대로 실행하게된다. 만약 그런데,
// 메인 메소드안에 존재하는 메소드가 실행되고, 메소드안에 새로운 int num=1; 변수가 정의될 경우,
// int num=1 변수는 메소드가 실행될때 정의되고 메소드의 블록이 끝나고 다시 메인메소드의 시점으로 돌아오면,
// int num=1 의 정의된 메소드의 변수 int num=1;은 사라진다. 즉, int num=1과 같은 메소드에 정의된
// 변수는 메소드가 메인메소드로부터 실행될때에만 존재하는 변수이다.
// 이때, 메소드를 호출하는 main메소드를 호출자, main메소드에 블록안에서 호출되는 메소드를 피호출자라고한다.

// 또한, 메인메소드가 printstar메소드를 호출하면, printstar메소드 안에 존재하는 println메소드가 블록안에
// 존재하므로 다시 println메소드가 호출되게된다. 이때에는 printstar메소드는 메인메소드의 피호출자였지만,
// 이경우엔 호출자가 되고, println메소드는 피호출자인 것이다. 따라서, 어떠한 메소드는 호출자일수도 피호출자일수도
// 있는 것이다.

// 즉, main메소드에 있는 변수와, main메소드안에 표현되어있지만 정의자체는 메인메소드 외부에있는 printstar
// 메소드안에 있는 변수는 서로 완벽하게 독립적이다. 즉, main메소드는 printstar메소드의 존재를 알긴알지만
// (main 메소드안의 블록안에 printstar() 메소드가 표현되어있으므로) printstar메소드안에 어떠한변수가
// 있는지는 알지못한다. 또한, printstar메소드는 메인 메소드안에 어떠한 변수가 있는지도 모른다.

// 그러나, 두 메인메소드와 printstar() 메소드가 서로의 메소드안에 어떠한 변수가 정의되어있는지를 
// 알아야할 경우가 존재한다. 이경우 void printstar() 메소드는 메인메소드의 피호출자메소드인데, 
// printstar메소드가 호출자메소드인 메인메소드에 전달할 값이 없다는 의미로서 void를 사용한 것이다. 또한,
// printstar() 메소드가 이와같이 표현되어있을댄, 괄호안에 아무것도 존재하지않으므로, 호출자메소드인 메인
// 메소드가 printstar() 메소드에게 전달할 값이 없다는 것이다. 즉, 피호출자메소드의 () 안에는 호출자메소드가
// 전달하고자하는 값이 표현되고, 피호출자메소드의 return값에는 피호출자메소드가 호출자메소드에게 전달하고자하는
// 값이 표현되게된다.
// 이렇게 값을 전달하는 이유는 메소드의 수명은 메소드의 블록이 실행될때만 존재하도록 만들어져 있기 때문에, 값을
// 호출자 메소드와 피호출자 메소드가 값을 전달해야하는 상황이 필요한 것이다.

// 그리고, 호출자메소드와 피호출자메소드가 있고, 다시 피호출자메소드가 호출자메소드가 되어 피호출자메소드를 호출할때,
// 무조건 연쇄적으로 메소드가 호출되는 관계속에서도, 항상 호출자메소드와 피호출자메소드가 1:1 관계로만 생각하면된다.
// 왜냐하면 본질적으로 호출자메소드와 피호출자메소드는 1:1 관계로 동작되도록 만들어져있기때문이다.
// 그러므로, 피호출자 메소드가 return 에의해 반환한 값은 호출자 메소드에만! 전달되는 것이다.
// 호출자메소드와 피호출자메소드를 고려할땐 무조건 1:1 관계로만 생각하면된다.

// 메인메소드의 ()안의 파라미터가 String[] args로 표현된 것은 메인메소드도 어떠한 호출자메소드가 전달한
// String[] args라는 값을 전달받았다는 의미로 본질적으로는 String[] args 값을 전달한 메소드의 피호출자메소드인
// 것이다.


// 만약 메소드 printStar(int cnt)와 같이 정의되어있으면, ()의 인수는 호출자가 전달해주는 값이다.
// 또한, int cnt 변수도 printstar메소드에 정의된 것이므로 printstar 메소드가 실행될 동안에만 생존해있는 변수이다.
// 그래서 아래와같이 main메소드 안에 있는 printstar(20)와 같이 메소드가 호출됐을대, 20은 printstar메소드의
// 호출자메소드가 전달한 값이 표현되고, 이때 호출자메소드는 main메소드이므로 20이란 값은 이경우 main메소드가
// 전달해준 값이다. 

// 그리고, printstar(char ch, int cnt)와같이 2개이상의 파라미터가 올 수 있는데, 이때의 파라미터 2개값또한
// printstar메소드의 호출자메소드가 전달해주는 값이 2개이상인 것이고, 이경우 printstar메소드는 정의에의해
// 반드시 호출자메소드로부터 char ch 값과 int cnt 값을 파라미터로 전달받아야만 동작하게되는 메소드인것이다.반드시!
// 또한, 반드시 printstart(char ch, int cnt)메소드의 정의상 파라미터의 순서도 char ch, int cnt 순서로
// 값이 대입되어야 printstart메소드가 동작할수있는 것이다.

// "" 안에 들어있는것은 그 안에 몇개의 문자가 있건 문자열 string 타입인 것이다.

// System.out.println("**********"); 이와 같은 경우도 println메소드의 파라미터에 "*******"가
// println의 호출자메소드가 전달해준 값이다. 그리고, println메소드가 정의된 클래스를 확인해보면 
// println(string s)와 같이 string 값이 정의되어있을 것이다. 메소드 () 의 모든 본질적인 정의상
// 그어떤 메소드도 이와같은 파라미터와 호출자메소드, 그리고 메소드의 정의의 원리가 성립되게된다.

// 매개변수와 파라미터, argument, 인자, 인수는 모두 같은 의미이다.

// return 이라는 키워드는 나를 호출했던 호출자메소드로 돌아갈거야 라는 의미에서의 return이고, return에의해
// 나를 호출했던 호출자 메소드에 피호출자 메소드가 값을 전달할 수 있게되는 것이다. 무조건 return이 있으면,
// return 아래에 그 무엇이 있던 간에 바로 나를 호출했던 호출자메소드로 동작의 흐름이 돌아가게하는 의미이다.
// 그러므로, 모든 메소드에 대해서 그 메소드를 호출한 호출자메소드가 존재하고, 메소드는 항상 호출자메소드에의해
// 호출되어 실행된뒤, 다시 호출자메소드의 실행시점으로 되돌아가므로 모두!! 모든 메소드엔 return;이란 키워드가 
// 생략되어 있는 것이다. 또한, return 값; 과 같이 정의하게 되면, 호출자메소드의 실행시점으로 돌아갈때,
// return에 정의한 값과 함께 돌아가게 할 수 있다.
// 그러나 return 뒤에 값을 정의하지 않으면 호출자메소드에 값을 전달하지 않으므로, void라는 반환값의형태를 써줘야한다 
// 그리고, return에 의해 호출자에게 값을 피호출자 메소드가 전달했을때, 그 값이 피호출자 메소드가 끝남과 동시에
// 소멸되지 않으려면 호출자 메소드에 피호출자 메소드가 return 에 의해 전달된 값을 받기 위한 변수가 호출자 메소드에
// 정의되어 있어야한다. 또한, 대입연산자 = 에 의해 전달받은 값이 변수에 저장되모르ㅗ, 대입연산자 = 가 오직
// 한개의 값만을 변수에 저장할 수 있게하는 본질적인 원리에 의해 전달받은 값을 오직 하나만 변수에 저장할 수 있다는
// 것이므로 return이 반환하는 값또한 1개만 전달할 수 있게 만들어진 것이다. 즉, return에 의해 전달할 수 있는
// 값의 개수는 오직 1개 또는0개인 것이다.

// 만약 호출자 메소드에 피호출자 메소드가 return에 의해 전달한 값을 저장할 변수가 없으면 return에 의해 전달된 값은
// 피호출자 메소드가 종료됨과 동시에 호출자 메소드에 전달되어도 저장할 변수 공간이 없으므로 소멸되게된다.

// () 안의 매개변수는 메소드의 라이프사이클과동일한 라이프사이클을 갖는다. 매개변수는 호출자로부터 피호출자에게
// 여러개가 전달될 수 있다.

// 피호출자메소드가 호출자 메소드에의해 값을 전달할 수 있는 방법이 return인 것이다.

// return뒤에 값은 오직 1개만 올수있으므로 일반적으로 호출자메소드에 피호출자메소드는 1개의 값만을 전달할수있는데,
// 만약 여러개의 값을 전달하고자한다면, return 뒤에 여러개의 값을 갖고있는 하나의 객체인 배열을 전달하면되는것이다.

// 매개변수와 return 타입은 묵시적 형변환 기능을 지원한다. 명시적형변환은 불가능하다.
// 만약 메소드의 정의부의 반환타입이 double일때 일반적으로 return 타입또한 double여야 하는데, double보다
// 작은 크기의 자료형인 int형으로 묵시적형변환을 통해 return 값을 정의해줄 수 있다.

// 메소드의 정의부에 반환타입이 void가 아닌 어떠한 실제적 형태로 정의된 경우 return 값이 실제적인 동일한 반환
// 타입의 값으로 반드시 정의되어야한다.

// 메소드는 객체에서의 동작을 위해서 존재하는 것이다.

// String[] getSingList() {
// 		string [] list = {"강남스타일", "명동스타일"}
//		return list;
// 와같은 피호출자 메소드가 정의됐을때, list에는 {강남스타일, 명동스타일} 배열 객체를 가리키고있는 주소값을
// 갖고 있는 배열 변수이므로, return에 의해 list가 정의되면 호출자 메소드에 list 변수에 저장된 주소값이
// 호출자 메소드에 전달되게 되는 것이다. {강남스타일, 명동스타일} 과같은 실제 값이 담긴 배열객체를 의미하는 것은
// 아니다. 단, list 주소값을 알면 자동으로 {강남스타일, 명동스타일} 실제 값이 저장된 배열객체가 어디있는지를
// 알게되는 것이다.











/*
	**********
	Hello
	**********
	Hi
	**********
	Bye
	**********
	
	반환형 메소드명([파라미터]) {
		문장;
		문장;
	}
*/

public class MethodMain01 {

static int printStar(char ch, int cnt) {
	
	for(int i = 0; i < cnt; i++) {
		System.out.print(ch);
	}
	System.out.println();
	
	return ch + cnt;
}

static void aaa() {
	boolean bool = true;
	System.out.println("A");
	System.out.println("B");
	if(bool) {
		return;
	}
	System.out.println("C");
	System.out.println("D");
	return;
}

public static void main(String[] args) {
	
//	aaa();
	
	printStar('A', 10);
	System.out.println("Hello");
	printStar('B', 20);
	System.out.println("Hi");
	printStar('a', 5);
	System.out.println("Bye");
	printStar('z', 8);
}
}