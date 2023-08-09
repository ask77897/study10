package project10;

import java.util.Scanner;

public class test04_Food extends test04_Restaurant{
	Scanner sc = new Scanner(System.in);
	private String resname;
	private int resnum;
	
	
	test04_Food(){
		
	}
	test04_Food(String name, int chair){
		super(name, chair);
	}
	test04_Food(String name, int chair, String resname, int resnum){
		super(name, chair);
		this.resname = resname;
		this.resnum = resnum;
	}
	@Override
	void printinfo() {
		System.out.println(name+"의 남은 좌석 수는 "+ (getChair()-resnum)+ "입니다.");
	}
	
	

}
