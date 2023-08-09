 package project10;

import java.util.Scanner;

public class test04_rpgGame {
			//2.
			//RPG게임
			//유닛 -> 캐릭터, 몬스터 -> 직업
			//유닛 -> 공격, 레벨업, 체력
			//몬스터 -> 타입
			//캐릭터 -> 경험치
			//직업 -> 직업 이름
	private String name;
	private int health;
	private int maxHealth;
	private int attack;
	private int level;
	
	
	test04_rpgGame(){
		
	}
	test04_rpgGame(int level){
		this.level = level;
	}
	test04_rpgGame(String name){
		this.name = name;
	}
	test04_rpgGame(String name, int health){
		this.name = name;
		this.health = health;
	}
	test04_rpgGame(String name, int health, int attack){
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	test04_rpgGame(int health, int maxHealth, int attack, String name){
		this.name = name;
		this.health = health;
		this.maxHealth = maxHealth;
		this.attack = attack;
	}
	test04_rpgGame(String name, int health, int maxHealth, int level, int attack){
		this.name = name;
		this.health = health;
		this.maxHealth = maxHealth;
		this.level = level;
		this.attack = attack;
	}
	int getlevel() {
		return level;
	}
	int gethealth() {
		return health;
	}
	int getattack() {
		return attack;
	}
	String getname() {
		return name;
	}
	int getmaxHealth() {
		return maxHealth;
	}
	int setlevel(int level) {
		return ++this.level;
	}
	void sethealth(int health){
		this.health=this.health+(this.health*10/100);
		this.maxHealth = this.health;
	}
	int setattack(int attack){
		return this.attack=this.attack+(this.attack*12/100);
	}
	void attack(test04_Monster mon) {
		System.out.println(mon.getname()+ "이(가) 공격합니다.");
		health = this.gethealth()-mon.getattack();
		System.out.println(this.getname()+"의 체력이 "+mon.getattack()+" 감소했습니다.");
	}
	void attack(test04_Character cha) {
		System.out.println(cha.getname()+ "이(가) 공격합니다.");
		health = this.gethealth()-cha.getattack();
		System.out.println(this.getname()+"의 체력이 "+cha.getattack()+" 감소했습니다.");
	}
	void sethealth2(test04_Monster mon) {
		if(this.health<=0) {
			this.health = mon.getmaxHealth();
		}
	}
	void sethealth3(int maxHealth) {
		this.health = this.getmaxHealth();
		
	}
	
}
