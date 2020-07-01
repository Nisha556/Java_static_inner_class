package Operator;

public class Static_prog5 {
	static class Rest
	{
		int a = 90;
		static public void display()
		{
		 int a1 = 200;
		 System.out.println(a1);
		}
	}
	public static void main(String args[])
	{
		 Static_prog st = new Static_prog();
		 st.display();
	}
}
class test4 extends Rest //static class can't be Inherited
{
	public void display() // static method can not be overridden
	{
	 int a1 = 200;
	 System.out.println(a1);
	}
	public static void main(String args[])
	{
		 Static_prog st = new Static_prog();
		 st.display();
	}	
	
}
