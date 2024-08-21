package mavenpackageaccessmodifier;

public class Accessmodifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmodifier1 a=new Accessmodifier1();
		a.display();
		a.display1();
		a.display2();
		a.display3();
	}
public void display()
{
	System.out.println("This is a public method");
}
private void display1()
{
	System.out.println("This is a private method");
}
protected void display2()
{
	System.out.println("This is a protected method");
}
void display3()
{
	System.out.println("This is a default method");
}
}