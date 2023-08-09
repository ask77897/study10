 package project10;

public class test04_Monster extends test04_rpgGame{
	private String type;
	
	test04_Monster(String name, int health, String type){
		super(name, health);
		this.type = type;
	}
	test04_Monster(int health, int maxHealth, int attack, String name, String type){
		super(health, maxHealth, attack, name);
		this.type = type;
	}
	
	test04_Monster(String name){
		super(name);
	}
	
	void printInfo() {
		System.out.println("이름: "+getname()+", 체력: "+gethealth()+"/"+getmaxHealth()
			+", 공격력: "+getattack()+", 타입: "+type);
	}
	void attack() {
		System.out.println(getname()+ "이(가) 공격합니다.");
		
	}
}
