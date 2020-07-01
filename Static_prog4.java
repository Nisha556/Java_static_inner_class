package Operator;

public class Static_prog4 {
	static int a1 = 20;
	static public void display()
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
class test4 extends Static_prog4
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
