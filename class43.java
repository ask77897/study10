package project10;

import java.util.Scanner;

public class class43 {

	public static void main(String[] args) {
//		int a;
		int x = 100;
		int y = 50;
//		System.out.println(x-=y);
//		System.out.println(x-=y);
//		System.out.println(x-=y);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			int a = (int)(Math.random()*5)+1;
			System.out.println(a);

			for(int j = 0; j<(x-=y); j++) {
				System.out.println(a+"되나"+j);
				System.out.println("다음숫자");
				String b = sc.next();
				if(b.equals("a")) {
					System.out.println("출력");
				}else {
					System.out.println("나감");
				}
			}
		}

	}

}
