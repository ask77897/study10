 package project10;

public class test04_Character extends test04_rpgGame{
	private int exp;//인스턴스 변수
	
	
	test04_Character(){//생성자
		this.exp = 0;
	}
	test04_Character(String name){
		super(name);
		getlevel();
		this.exp = 0;
	}
			
	test04_Character(String name, int level) {//생성자
		super(name, level);
		this.exp = 0;
	}
	test04_Character(String name, int level, int health, int maxHealth, int exp, int attack){//생성자
		super(name, level, health, maxHealth, attack);
		this.exp = exp;
	}
	
	void infor() {
		System.out.println("캐릭터명 : "+getname()+", level: "+getlevel()+", 체력: "+gethealth()+"/"+getmaxHealth()
							+", exp: "+this.exp+", 공격력: "+getattack());
	}
	
	void fight() {
		System.out.println(getname() + "이(가) 전투를 시작했습니다.");
	}
	
	
	void clear(int exp1) {
		System.out.println("전투를 성공적으로 클리어하였습니다.");
		System.out.println(exp1 + "의 경험치를 획득했습니다.");
		getExp(exp1);
	}
	

	void getExp(int exp) {
		this.exp += exp;
		if(this.exp >= 100*getlevel()) {
			System.out.println(getname() +"의 레벨이 상승합니다." );
			System.out.println("현재 " +getname()+ "의 레벨은 " + (setlevel(getlevel())) + "입니다.");
			sethealth3(getmaxHealth());
			sethealth(gethealth());
			setattack(getattack());
			this.exp -= (100*getlevel())-100;
		}
	}
	
	void avoid() {
		System.out.println("전투에서 도망쳤습니다. 나약한 녀석!!!");
	}
	
	int getexp() {
		return exp;
	}
}
