package project10;

import java.util.Scanner;

public class class45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = Math.PI;

		double y = sc.nextInt();
		double z = sc.nextInt();
		System.out.println(math.polymer(x,y,z));
		

	}

}

class math{
	public static double polymer(double x, double y, double a){
		return (a*Math.pow(y, 2))/(4*Math.tan(x/a));
	}
}


//모든 클래스가 상속받는 절대적인 클래스 -> java.lang.Object

//toString() : 객체의 문자열을 생성하는 메소드
//equals(Object obj) : 두 객체의 동등성 여부를 나타내는 메소드
//clone() : 객체의 복사본을 리턴하는 메소드
//finalize() : 객체가 메모리에서 해체될 때 실행되는 메소드
//getClass() : 클래스의 정보를 얻는 메소드
//notify() : 
//wait() : 객체가 바뀔 때까지 기다리는 메소드
//wait(long timeout) : 객체가 변경될 때까지 timeout 만큼 대기하는 메소드

