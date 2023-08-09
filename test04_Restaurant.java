package project10;

public class test04_Restaurant {
			//1.
			//식당 + 좌석 수, (소비자 -> 예약자명, 인원수)
			//남은 좌석 수보다 인원수가 더 많으면 예약 불가
			//오버라이딩, 캡슐화
	String name;
	private int chair;
	
	test04_Restaurant(){
		
	}
	test04_Restaurant(String name, int chair){
		this.name = name;
		this.chair = chair;
	}
	
	void printinfo() {
		System.out.println(name+"의 좌석 수는 "+ chair+ "입니다.");
	}
	int getChair() {
		return chair;
	}
	void setChair(int res) {
		this.chair = chair;
	}
	void reservation(test04_Customer Customer) {
		if(this.chair>=Customer.getResnum()) {
			System.out.println("예약이 가능합니다.");
			System.out.println("예약자명: "+Customer.getResname()+", 인원 수: "+Customer.getResnum());
			chair -=Customer.getResnum();
		}else {
			System.out.println("예약이 불가능합니다.");
		}
	}
	
	
	
	
	
}
