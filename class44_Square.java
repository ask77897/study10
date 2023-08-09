package project10;

public class class44_Square extends class44_Math{
    @Override
    public static int square(int a, int b){//a=한 대각선의 길이, b=다른 대각선의 길이
        return a*b*(1/2);
    }
    public static int sqaure(int a) {//a=한 변의 길이
		return a*a;
	}
    public static int square(int a, int b, int h){//a=윗변, b=아랫변, h=높이
        return (a+b)*h/2;
    }

}
