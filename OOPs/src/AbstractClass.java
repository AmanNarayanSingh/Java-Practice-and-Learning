abstract class AbstractParent{
	public AbstractParent(){
		System.out.println("Default constructor of parent abstract class is invoked.");
	}
	abstract void hello();
	abstract void company();
	
}

class GoodChild extends AbstractParent{
	//all abstract methods of parent should be defined here.
	public GoodChild(){
		System.out.println("This GoodChild class implements all the abstract methods of the parent class.");
	}
	public void hello(){
		System.out.println("Implementing method hello of parent abstract class.");
	}
	public void company(){
		System.out.println("Implementing method company of parent class.");
	}
}

abstract class BadChild extends AbstractParent{   //declared as abstract bcoz hello function of abstract class is not defined.
	public BadChild(){
		System.out.println("This is a bad child so here not all of the declared functions are defined.");
	}
	public void company(){
		System.out.println("Implementing method company of parent class in BadChild.");
	} 
	//hello method is not implemented.
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AbstractParent obj =new AbstractParent();  		//abstract class can't be used to create objects.
		GoodChild obj=new GoodChild();					// inherited class object can be created as it contains implemented functions declared in abstract class.
		obj.company();
		obj.hello();
		
	}

}
