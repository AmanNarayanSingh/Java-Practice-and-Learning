interface Bicycle{
	int a=45;   //this value can't be changed.
	void breaks(int decrement);
	void acc(int increment);
}
abstract class Hike{
	void alpha(){
		System.out.println("Hiking class to be extended in Hercules class.");
	}
	abstract void check();
}
interface Jio{
	void Jio();
}
class Hercules extends Hike implements Bicycle,Jio{
	public void breaks(int decrement){
		System.out.println("Speed reduced.");
	}
	public void acc(int increment){
		System.out.println("Speed increased");
	}
	void check(){
		System.out.println("Abstract class can be extended while implementing interface.");
	}
	public void Jio(){
		System.out.println("Multiple interfaes can be implemented together.");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bicycle obj=new Bicycle();  	//produces error 
		Hercules obj=new Hercules();
		System.out.println("The value of 'a' is: "+ obj.a);
		obj.breaks(5);
		obj.acc(5);
		obj.check();

	}

}
