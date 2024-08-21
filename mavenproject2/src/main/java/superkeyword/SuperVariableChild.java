package superkeyword;

public class SuperVariableChild extends SuperVariableParent {
	String colour="Yellow";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperVariableChild a=new SuperVariableChild();
a.show();
	}
public void show()
{
	System.out.println(colour);
	System.out.println(super.colour);
}
}
