package javatutorials;

/*class Fruit {
	//Fruit ��� ���� ������ Ÿ���� ���� APPLE, PEACH, BANANA
	//������ ������ �ν��Ͻ��� ����������(new Fruit()) �ٸ� ���̶�� �� �� ����
	// 220611 �̷��� Fruit�� Ŭ���� Ÿ������ �����س����� APPLE, PEACH, BANANA �� ���ο� �ν��Ͻ��� �����ؼ� ������ �Ѵ�. 
	// ������ APPLE, PEACH, BANANA�� �����س��� ���̱� ������ enum Ÿ���� ����ϸ� �ξ� �����ϰ� ���� �� �ִ�. 
	public static final Fruit APPLE = new Fruit(); // APPLE�̶�� ����� Ÿ���� Fruit. �ڱ� �ڽ��� �ν��Ͻ�ȭ �� new Fruit() ����
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
//				System.out.println("���� ���ð� ��� ������ �����ϴ�.");
//			} //Incompatible operand types Fruit and Company
//			
					Fruit type = Fruit.APPLE;
					switch(type) { // type���� ������ ���� ������ switch���� �� Ÿ���� ���ѵǾ� �ֱ� ������.
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

