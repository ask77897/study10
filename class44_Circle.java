package project10;

public class class44_Circle extends class44_Math{
	
	
	public static double circle(double a, double b) {//a=둘레, b=반지름
		return a*(1/2)*b;
	}
	@Override
	public static double circle(double a) {//a=지름
		return a*3.14*(1/2)*(a/2);
	}
	
}
