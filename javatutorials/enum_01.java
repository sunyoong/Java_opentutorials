package javatutorials;

enum Fruit {
	APPLE, PEACH, BANANA;
}

enum Company {
	GOOGLE, APPLE, ORACLE;
}

public class enum_01 {
	
	public static void main(String[] args) {
		Fruit type = Fruit.APPLE;
		switch(type) { // type���� ������ ���� ������ switch���� �� Ÿ���� ���ѵǾ� �ֱ� ������.
		case APPLE: 
			System.out.println(57 + "kcal");
			break;
		case PEACH:
			System.out.println(35 + "kcal");
			break;
		case BANANA: 
			System.out.println(93 + "kcal");
			break;
		}

	}

}
