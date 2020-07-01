package Operator;



public class OuterClass3 {
	int x = 500;
	static class InnerClass3{
		int x =300;
	}

}
  class myMainClass4 {
	public static void main(String args[])
	{
		OuterClass3 outer = new OuterClass3();
		 OuterClass3.InnerClass3 myInner = new OuterClass3.InnerClass3(); // it can not access through Outer class object
		    System.out.println(outer.x+ myInner.x );
	
	}
}