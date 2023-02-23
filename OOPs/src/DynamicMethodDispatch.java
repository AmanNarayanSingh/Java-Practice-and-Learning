
class p{
	public void show(){
		System.out.println("Parent method is invoked.");
	}
	public void name(){
		System.out.println("Name method is invoked in parent class");
	}
}

class c extends p{
	public void name(){
		System.out.println("Name function is overloaded in child class.");
	}
	public void beta(){
		System.out.println("beta method is invoked in Child class.");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p obj=new c();
		obj.show();
		obj.name();
		//obj.beta; 			// this will produce an error 

	}

}
