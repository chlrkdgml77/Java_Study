package ME_01;

public class Param_Nom_Ref {
	public static void main(String[] args) {
		Ex01Data d = new Ex01Data();
		d.x = 10;
		System.out.println("���� x = " + d.x);
		
		NomChange(d.x);
		System.out.println("�⺻�� �Ű������� �Ѱ��� �� x = " + d.x);
		
		RefChange(d);
		System.out.println("������ �Ű������� �Ѱ��� �� x = " + d.x);
	}
	public static void NomChange(int x) {
		x = 1000;
		System.out.println("�⺻�� �Ű������϶� x = " + x);
	}
	
	public static void RefChange(Ex01Data d) {
		d.x = 1000;
		System.out.println("������ �Ű������϶� x = " + d.x);
	}
}
class Ex01Data {int x;}
