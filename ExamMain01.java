package kc.ac.kopo.day03.exam;




public class ExamMain01 {
	
	public static void main(String[] args) {
		
//		for(; ;) {
//			
//			System.out.println("Hello");
//			
//		};
		// 위와 같은 for문이 무한루프의 for문이다.
		
		// dos 모두에서 한번 아랫줄로 내려온 코드는 절대 위로 올라갈 수 없다. 따라서, 어떠한 것을 반복하고자할 때,
		// 열의 개념으로 반복대상을 출력하는 방식이 아니라, 행의 개념으로 반복대상을 출력해야한다.
		// 반복문은 규칙성이다. 규칙성을 파악하는 것이 가장 중요하다.
	
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 1; j <= 5; j++) {
				
				System.out.println("*");
				
			}
			
			for(int j = 1; j <= 5; j++) {
				
				System.out.println("*");
				
			}
			// for문의 사이클은 블록단위 이기 때문에, 변수 j를 세번째 for문에서 두번째 for문에서 변수 j가 사용됐었을지라도
			// 다시 사용할 수 있다. 왜냐면 세번째 for문에서 변수 j를 정의할 때에는 정의된 변수 j는 없기 때문에 
			// 다시 정의할 수 있는 것이다.
		}
		
	}
	
}
