package ME_01;

public class Param_Nom_Ref {
	public static void main(String[] args) {
		Ex01Data d = new Ex01Data();
		d.x = 10;
		System.out.println("원래 x = " + d.x);
		
		NomChange(d.x);
		System.out.println("기본형 매개변수에 넘겼을 때 x = " + d.x);
		
		RefChange(d);
		System.out.println("참조형 매개변수에 넘겼을 떄 x = " + d.x);
	}
	public static void NomChange(int x) {
		x = 1000;
		System.out.println("기본형 매개변수일때 x = " + x);
	}
	
	public static void RefChange(Ex01Data d) {
		d.x = 1000;
		System.out.println("참조형 매개변수일때 x = " + d.x);
	}
}
class Ex01Data {int x;}
