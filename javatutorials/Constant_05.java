package javatutorials;

/*class Fruit {
	//Fruit 라는 같은 데이터 타입을 지닌 APPLE, PEACH, BANANA
	//하지만 각각의 인스턴스가 생성됨으로(new Fruit()) 다른 값이라고 볼 수 있음
	// 220611 이렇게 Fruit를 클래스 타입으로 지정해놓으면 APPLE, PEACH, BANANA 는 새로운 인스턴스를 생성해서 만들어야 한다. 
	// 어차피 APPLE, PEACH, BANANA는 열거해놓은 것이기 때문에 enum 타입을 사용하면 훨씬 간단하게 만들 수 있다. 
	public static final Fruit APPLE = new Fruit(); // APPLE이라는 상수의 타입은 Fruit. 자기 자신을 인스턴스화 한 new Fruit() 생성
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}*/


class Company {
	public static final Company GOOGLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
}

public class Constant_05 {

	public static void main(String[] args) {
			
//			if(Fruit.APPLE == Company.APPLE) {
//				System.out.println("과일 애플과 기업 애플은 같습니다.");
//			} //Incompatible operand types Fruit and Company
//			
					Fruit type = Fruit.APPLE;
					switch(type) { // type에서 에러가 나는 이유는 switch문에 들어갈 타입은 제한되어 있기 때문임.
					case Fruit.APPLE: 
						System.out.println(57 + "kcal");
						break;
					case Fruit.PEACH:
						System.out.println(35 + "kcal");
						break;
					case Fruit.BANANA: 
						System.out.println(93 + "kcal");
						break;
					}
			}

	}

