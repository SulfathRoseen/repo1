package mypackagemaven;

public class Accessmodifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmodifier2 a=new Accessmodifier2 ();
		a.display1();
		a.display2();
		a.display3();
		a.display4();
	}
	public void display1()
	{
		System.out.println("Display Public");
	}
	private void display2()
	{
		System.out.println("Display Private");
	}
	protected void display3()
	{
		System.out.println("Display Protected");
	}
	void display4()
	{
		System.out.println("This is a default method");
	}
}
