package ME_01; 

public class JVM {
	public static void main(String[] args) {
		System.out.println("main�޼��� ����");
		firstMethod();
		System.out.println("main�޼��� ��");
	}
	public static void firstMethod() {
		System.out.println("firstMethod ����");
		secondMethod();
		System.out.println("firstMethod ��");
	}
	
	public static void secondMethod() {
		System.out.println("secondMethod ����");
		System.out.println("secondMethod ��");
	}
}
