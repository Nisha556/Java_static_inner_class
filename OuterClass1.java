package Operator;

public class OuterClass1 {
int x = 10;


class InnerClass {
	int y = 5;
}	
}
 class MyMainClass1 {
	public static void main(String args[])
	{
		OuterClass1 myOuter = new OuterClass1();
		OuterClass1.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	
	}
}
