package Operator;


class OuterClass4 {
	  int x = 10;

	  class InnerClass4 {
		  int y = 20;
	    public int myInnerMethod() {
	      return x+y;
	    }
	  }
	}

	class MyMainClass5 {
	  public static void main(String[] args) {
	    OuterClass4 myOuter = new OuterClass4();
	    OuterClass4.InnerClass4 myInner = myOuter.new InnerClass4();
	    System.out.println(myInner.myInnerMethod());
	  }
	}