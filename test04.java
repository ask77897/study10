 package project10;

import java.util.ArrayList;
import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		//1.
		//식당 + 좌석 수, 소비자 -> 예약자명, 인원수
		//남은 좌석 수보다 인원수가 더 많으면 예약 불가
		//오버라이딩, 캡슐화
//		test04_Restaurant res = new test04_Restaurant("식당1", 30);
//		test04_Food res1 = new test04_Food("식당2", 50);
//		test04_Customer cus1 = new test04_Customer("kim", 10);
//		test04_Customer cus2 = new test04_Customer("lee", 20);
//		test04_Customer cus3 = new test04_Customer("park", 40);
		
//		res.printinfo();
//		res1.printinfo();
//		if(res1.getChair()==0) {
//			System.err.println("1.좌석이 부족합니다.");
//		}else if(res1.getChair()<cus1.getResnum()) {
//			System.err.println("1.좌석이 부족합니다.");
//		}else if(res1.getChair() != 0) {
//			res1.setChair(cus1.getResnum());
//			cus1.reservation();
////			System.out.println("현재 예약된 좌석은 "+cus1.setResnum(0)+"입니다.");
//		}
//		if(res1.getChair()==0) {
//			System.err.println("2.좌석이 부족합니다.");
//		}else if(res1.getChair()<cus2.getResnum()) {
//			System.err.println("2.좌석이 부족합니다.");
//		}else if(res1.getChair() != 0) {
//			res1.setChair(cus2.getResnum());
//			cus2.reservation();
////			System.out.println("현재 예약된 좌석은 "+cus1.setResnum(0)+"입니다.");
//		}	
//		if(res1.getChair()==0) {
//			System.err.println("3.좌석이 부족합니다.");
//		}else if(res1.getChair()<cus3.getResnum()) {
//			System.err.println("3.좌석이 부족합니다.");
//		}else if(res1.getChair() != 0) {
//			res1.setChair(cus3.getResnum());
//			cus3.reservation();
////			System.out.println("현재 예약된 좌석은 "+cus1.setResnum(0)+"입니다.");
//		}	
//		res1.printinfo();
//		
		
//		test04_Restaurant rest = new test04_Restaurant("식당1", 30);
//		test04_Food rest1 = new test04_Food("식당2", 50);
//		test04_Customer cun1 = new test04_Customer("kim", 10);
//		test04_Customer cun2 = new test04_Customer("lee", 20);
//		test04_Customer cun3 = new test04_Customer("park", 30);
//		test04_Customer cun4 = new test04_Customer("choi", 20);
//		
//		rest1.reservation(cun1);
//		rest1.reservation(cun2);
//		rest1.reservation(cun3);
//		rest1.printinfo();
//		cun4.reservation(rest1.getChair());

		//만약 손님들이 먹고 나갔다면?, 오프라인 손님이 있다면?, 시간을 적용하면?
		
		
		

		//2.
		//RPG게임
		//유닛 -> 캐릭터, 몬스터 -> 직업
		//유닛 -> 공격, 레벨업, 체력
		//몬스터 -> 타입
		//캐릭터 -> 경험치
		//직업 -> 직업 이름, 스킬(타입) 대미지 증감 요소

		
		test04_Character p1 = new test04_Character("A", 200, 200, 1, 0, 20);
		test04_Character p2 = new test04_Character("B", 100, 100, 1, 0, 10);
		test04_Monster m1 = new test04_Monster(100, 100, 10,"슬라임", "물");
		test04_Monster m2 = new test04_Monster(50, 50, 20,"스켈레톤", "언데드");
		test04_Monster m3 = new test04_Monster(70, 70, 30,"샐러맨더", "불");
		test04_Monster m4 = new test04_Monster(200, 200, 50,"골렘", "바위");
		test04_Monster m5 = new test04_Monster(50, 50, 5,"네펜데스", "풀");
		
		
		Scanner sc = new Scanner(System.in);
		for(int x = 0; x>=0; x++) {
			int a = (int)((Math.random()*5)+1);//1;
			for(int i=0; i>=0; i++) { 
				p1.infor();
				p2.infor();
				if(a==1){
					m1.printInfo();
				}else if(a==2){
					m2.printInfo();
				}else if(a==3){
					m3.printInfo();
				}else if(a==4){
					m4.printInfo();
				}else if(a==5){
					m5.printInfo();
				}
				System.out.print("몬스터가 나타났습니다. 전투를 시작하겠습니까? (y, n) :");
				String fightYN = sc.next();
				if(fightYN.equals("y")) {
					p1.fight();
					p2.fight();
					if(a==1){
						if(p1.gethealth()>0) {
							m1.attack(p1);							
						}
						if(p2.gethealth()>0&&p1.gethealth()>0) {
							m1.attack(p2);							
						}
						if(m1.gethealth()>0&&p1.gethealth()>0) {
							p1.attack(m1);
							if(p1.gethealth()<=0) {
								System.out.println(p1.getname()+" 죽음!");
							}
						}
						else if(m1.gethealth()>0&&p1.gethealth()<=0) {
							m1.attack(p2);
							if(m1.gethealth()>0) {
								p2.attack(m1);
								if(p2.gethealth()<=0) {
									System.out.println(p2.getname()+" 죽음!");
									System.out.println("전멸!");
									return;
								}
								
							}
						}else if(m1.gethealth()<=0) {
							m1.sethealth2(m1);
							p1.clear((int)(Math.random()*90)+10);
							p2.clear((int)(Math.random()*90)+10);
						}
//						else if(m1.gethealth()<=0) {
//							m1.sethealth2(m1);
//							p1.clear((int)(Math.random()*90)+10);
//							p2.clear((int)(Math.random()*90)+10);
//						}
//						if(p1.gethealth()<=0) {
//							System.out.println(p1.getname()+" 죽음!");
//							m1.attack(p2);
//							p2.attack(m1);
//							if(m1.gethealth()<=0) {
//								m1.sethealth2(m1);
//								p1.clear((int)(Math.random()*90)+10);
//								p2.clear((int)(Math.random()*90)+10);
//							}else if(p2.gethealth()<=0){
//								System.out.println(p2.getname()+" 죽음!");
//								System.out.println("전멸!");
//								return;
//							}else if(m1.gethealth()>p1.getattack()+p2.getattack()) {
//								m1.attack(p1);
//								m1.attack(p2);
//								p1.attack(m1);
//							}
//						}
//						else if(m1.gethealth()<=p1.getattack()+p2.getattack()){
//							m1.attack(p1);
//							m1.attack(p2);
//							p1.attack(m1);
//							m1.sethealth2(m1);
//							p1.clear((int)(Math.random()*90)+10);
//							p2.clear((int)(Math.random()*90)+10);
//							if(p1.gethealth()<=0) {
//								p2.attack(m1);
//								m1.attack(p2);
//								if(m1.gethealth()<=0) {
//									m1.sethealth2(m1);
//									p1.clear((int)(Math.random()*90)+10);
//									p2.clear((int)(Math.random()*90)+10);
//								}else if(p2.gethealth()<=0){
//									System.out.println("전멸!");
//									break;
//								}
//							}
//						}
					}else if(a==2){
						if(p1.gethealth()>0) {
							m2.attack(p1);							
						}
						if(p2.gethealth()>0&&p1.gethealth()>0) {
							m2.attack(p2);							
						}
						if(m2.gethealth()>0&&p1.gethealth()>0) {
							p1.attack(m2);
							if(p1.gethealth()<=0) {
								System.out.println(p1.getname()+" 죽음!");
							}
						}
						else if(m2.gethealth()>0&&p1.gethealth()<=0) {
							m2.attack(p2);
							if(m2.gethealth()>0) {
								p2.attack(m2);
								if(p2.gethealth()<=0) {
									System.out.println(p2.getname()+" 죽음!");
									System.out.println("전멸!");
									return;
								}
								
							}
						}else if(m2.gethealth()<=0) {
							m2.sethealth2(m2);
							p1.clear((int)(Math.random()*90)+10);
							p2.clear((int)(Math.random()*90)+10);
						}
					}else if(a==3){
						if(p1.gethealth()>0) {
							m3.attack(p1);							
						}
						if(p2.gethealth()>0&&p1.gethealth()>0) {
							m3.attack(p2);							
						}
						if(m3.gethealth()>0&&p1.gethealth()>0) {
							p1.attack(m3);
							if(p1.gethealth()<=0) {
								System.out.println(p1.getname()+" 죽음!");
							}
						}
						else if(m3.gethealth()>0&&p1.gethealth()<=0) {
							m3.attack(p2);
							if(m3.gethealth()>0) {
								p2.attack(m3);
								if(p2.gethealth()<=0) {
									System.out.println(p2.getname()+" 죽음!");
									System.out.println("전멸!");
									return;
								}
								
							}
						}else if(m3.gethealth()<=0) {
							m3.sethealth2(m3);
							p1.clear((int)(Math.random()*90)+10);
							p2.clear((int)(Math.random()*90)+10);
						}
					}else if(a==4){
						if(p1.gethealth()>0) {
							m4.attack(p1);							
						}
						if(p2.gethealth()>0&&p1.gethealth()>0) {
							m4.attack(p2);							
						}
						if(m4.gethealth()>0&&p1.gethealth()>0) {
							p1.attack(m4);
							if(p1.gethealth()<=0) {
								System.out.println(p1.getname()+" 죽음!");
							}
						}
						else if(m4.gethealth()>0&&p1.gethealth()<=0) {
							m4.attack(p2);
							if(m4.gethealth()>0) {
								p2.attack(m4);
								if(p2.gethealth()<=0) {
									System.out.println(p2.getname()+" 죽음!");
									System.out.println("전멸!");
									return;
								}
								
							}
						}else if(m4.gethealth()<=0) {
							m4.sethealth2(m4);
							p1.clear((int)(Math.random()*90)+10);
							p2.clear((int)(Math.random()*90)+10);
						}
					}else if(a==5){
						if(p1.gethealth()>0) {
							m5.attack(p1);							
						}
						if(p2.gethealth()>0&&p1.gethealth()>0) {
							m5.attack(p2);							
						}
						if(m5.gethealth()>0&&p1.gethealth()>0) {
							p1.attack(m5);
							if(p1.gethealth()<=0) {
								System.out.println(p1.getname()+" 죽음!");
							}
						}
						else if(m5.gethealth()>0&&p1.gethealth()<=0) {
							m5.attack(p2);
							if(m5.gethealth()>0) {
								p2.attack(m5);
								if(p2.gethealth()<=0) {
									System.out.println(p2.getname()+" 죽음!");
									System.out.println("전멸!");
									return;
								}
								
							}
						}else if(m5.gethealth()<=0) {
							m5.sethealth2(m5);
							p1.clear((int)(Math.random()*90)+10);
							p2.clear((int)(Math.random()*90)+10);
						}
					}
	//				for(int j=0; j>=0; j++) {
	//					System.out.println("행동을 선택하세요: 1.공격, 2.스킬");
	//					int fight = sc.nextInt();
	//					if(fight==1) {
	//					}
	//					if(fight==2) {
	//					}
	//				}
	//				p1.clear((int)(Math.random()*90)+10);
	//				p2.clear((int)(Math.random()*90)+10);
				} else {
					m1.attack();
					p1.avoid();
				}
			}
		}

	}//main

}
