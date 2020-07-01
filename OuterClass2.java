package Operator;

public class OuterClass2 {
	int x = 50;
	private class InnerClass2 {
		int x = 20;
		
	}

}
class mainClass3 {
	public static void main(String args[])
	{
		OuterClass2 out = new OuterClass2();
		OuterClass2.InnerClass2 iner = out.new InnerClass2(); //inner class has private access specifier
		System.out.println(out.x + iner.y);
		
	}
}