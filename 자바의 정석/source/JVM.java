package ME_01; 

public class JVM {
	public static void main(String[] args) {
		System.out.println("main메서드 시작");
		firstMethod();
		System.out.println("main메서드 끝");
	}
	public static void firstMethod() {
		System.out.println("firstMethod 시작");
		secondMethod();
		System.out.println("firstMethod 끝");
	}
	
	public static void secondMethod() {
		System.out.println("secondMethod 시작");
		System.out.println("secondMethod 끝");
	}
}
