package project10;

public class test04_Customer {
	private String resname;
	private int resnum;
	private int res;
	
	
	test04_Customer(int res, String resname, int resnum){
		this.res = res;
		this.resname = resname;
		this.resnum = resnum;
	}
	test04_Customer(String resname, int resnum){
		this.resname = resname;
		this.resnum = resnum;
	}
	
	String getResname() {
		return resname;
	}
	int getResnum() {
		return resnum;
	}
	
	void setResnum(int num) {
		this.resnum = num;
	}
	int reservation(int chair) {
		if(chair>=this.resnum) {
			System.out.println("예약이 가능합니다.");
			System.out.println("예약자명: "+resname+", 인원 수: "+resnum);
			chair-=resnum;
			
		}else {
			System.out.println("예약이 불가능합니다.");
		}
		return chair;
	}
	
//	void reservation(String name, int num) {
//		if(num < 0) {
//			System.err.println("잘못된 입력입니다.");
//			return;
//		}else if(num>(getChair()-resnum)) {
//			System.err.println("좌석이 부족합니다.");
//			return;
//		}
//		System.out.println(name+"님의 이름으로 "+num+"개의 좌석이 예약되었습니다.");
//		this.resnum += num;
//	}
	
	
}
