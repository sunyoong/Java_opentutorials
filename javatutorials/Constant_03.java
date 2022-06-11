package javatutorials;

public class Constant_03 {

	// 상수선언 : Constant_02 클래스 소속 상수
	// 선언한 상수 APPLE의 값이 위와 아래가 다름. (1!=2) 
	// 컴파일 오류가 생김(Duplicate~) => 앞에 접두사 붙여주기(FRUIT_, COMPANY_)
	private final static int FRUIT_APPLE = 1; 
	private final static int FRUIT_PEACH = 2;
	private final static int FRUIT_BANANA = 3;
	
	private final static int COMPANY_GOOGLE = 1;
	private final static int COMPANY_APPLE = 2;
	private final static int COMPANY_ORACLE = 3;
	
		public static void main(String[] args) {
			int type = FRUIT_APPLE;
			switch(type) {
			case FRUIT_APPLE: 
				System.out.println(57 + "kcal");
				break;
			case FRUIT_PEACH:
				System.out.println(35 + "kcal");
				break;
			case FRUIT_BANANA: 
				System.out.println(93 + "kcal");
				break;
			}
	}

}
