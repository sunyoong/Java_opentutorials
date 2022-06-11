package javatutorials;


class Fruits {
	//Fruit ��� ���� ������ Ÿ���� ���� APPLE, PEACH, BANANA
	//������ ������ �ν��Ͻ��� ����������(new Fruit()) �ٸ� ���̶�� �� �� ����
	// 220611 �̷��� Fruit�� Ŭ���� Ÿ������ �����س����� APPLE, PEACH, BANANA �� ���ο� �ν��Ͻ��� �����ؼ� ������ �Ѵ�. 
	// ������ APPLE, PEACH, BANANA�� �����س��� ���̱� ������ enum Ÿ���� ����ϸ� �ξ� �����ϰ� ���� �� �ִ�. 
	public static final Fruits APPLE = new Fruits(); // APPLE�̶�� ����� Ÿ���� Fruit. �ڱ� �ڽ��� �ν��Ͻ�ȭ �� new Fruit() ����
	public static final Fruits PEACH = new Fruits();
	public static final Fruits BANANA = new Fruits();
}


class Companies {
	public static final Companies GOOGLE = new Companies();
	public static final Companies APPLE = new Companies();
	public static final Companies ORACLE = new Companies();
}

public class Constant_05 {
	




	public static void main(String[] args) {
			
//			if(Fruit.APPLE == Company.APPLE) {
//				System.out.println("���� ���ð� ��� ������ �����ϴ�.");
//			} //Incompatible operand types Fruit and Company
//			
					Fruits type = Fruits.APPLE;
					switch(type) { // type���� ������ ���� ������ switch���� �� Ÿ���� ���ѵǾ� �ֱ� ������.
					case Fruits.APPLE: 
						System.out.println(57 + "kcal");
						break;
					case Fruits.PEACH:
						System.out.println(35 + "kcal");
						break;
					case Fruits.BANANA: 
						System.out.println(93 + "kcal");
						break;
					}
			}
	}

	

