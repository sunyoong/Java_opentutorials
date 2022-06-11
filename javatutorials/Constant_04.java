package javatutorials;

// 클래스 밖에 인터페이스를 만들어줌

interface FRUIT {
	int APPLE = 1;
	int PEACH = 2;
	int BANANA = 3;
}

interface COMPANY {
	int GOOGLE = 1;
	int APPLE = 2;
	int ORACLE = 3;
}

public class Constant_04 {
	
	public static void main(String[] args) {
		
		if(FRUIT.APPLE == COMPANY.APPLE) {
			System.out.println("과일 애플과 기업 애플은 같습니다.");
		} // Dead code : FRUIT.APPLE의 값과 COMPANY.APPLE의 값이 다름
		
				int type = FRUIT.APPLE;
				switch(type) {
				case FRUIT.APPLE: 
					System.out.println(57 + "kcal");
					break;
				case FRUIT.PEACH:
					System.out.println(35 + "kcal");
					break;
				case FRUIT.BANANA: 
					System.out.println(93 + "kcal");
					break;
				}
		}
	}


