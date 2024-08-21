package mypackagemavenoop;

public class MultilevelChild extends MultilevelParent{

	public void mul()
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultilevelChild a=new MultilevelChild();
a.mul();
a.sub();
a.add();
	}

}
