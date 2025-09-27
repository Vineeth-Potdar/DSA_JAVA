package day_5;

public class Test {
	Test(int a,int b){
		System.out.println("a = "+a+" b = "+b);
	}
	Test(int a,float b){
		System.out.println("a = "+a+" ,b = "+b);
	}
	public static void main(String[] args) {
		byte a = 1;
		byte b = 5;
		Test t = new Test(a,b);
	}

}
