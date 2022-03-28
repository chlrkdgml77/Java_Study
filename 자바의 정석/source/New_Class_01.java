package ME_01; 

public class New_Class_01 {
	public static void main(String[] args) {
		Ex01Time t = new Ex01Time();
		t.setHour(23);
		t.setMinute(25);
		t.setSecond(46);
		System.out.println(t);
		
		t.setHour(12);
		t.setMinute(67); //if문에 걸려 지정한 값 나오지 않음
		t.setSecond(24);
		System.out.println(t);
	}
}

class Ex01Time {
	private int hour;
	private int minute;
	private float second;
	
	public int getHour() {return hour;}
	public int getMinute() {return minute;}
	public float getSecond() {return second;}
	
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {return;}
		this.hour = hour;
	}
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {return;}
		this.minute = minute;
	}
	public void setSecond(float second) {
		if (second < 0.0f || second > 59.99f) {return;}
		this.second = second;
	}
	
	public String toString() {
		return "[" + getHour() + ":" + getMinute() + ":" + getSecond() + "]";
	}
}