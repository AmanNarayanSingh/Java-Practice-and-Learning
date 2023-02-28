import java.util.Random;
interface Mobile{
	void takepic();
	void pickcall();
	
//	private void greet(){			// this method can be done in Java 9 , not in Java 8
//		System.out.println("Hello! Mobile is ready to be used.");
//	}
	default void record4KVideo(){   //helps in backward compatibility in interfaces in Java.
//		greet();
	    System.out.println("Recording in 4k...");
	}
}
//interface 


interface Wifi{
	String [] networks();
	void connectToNetwork();
}

class Cell{
	void callNumber(String number){
		System.out.println("Calling "+number);
	}
}

class SmartMobile extends Cell implements Mobile,Wifi{
	
	@Override
	public void takepic(){
		System.out.println("Picture captured!");
	}
	@Override
	public void pickcall(){
		System.out.println("Call has been received.");
	}
	 
	public void record4kVideo(){
		System.out.println("Subclass record4kVideo overrides the record4kVideo method of parent class.");
	}
	
	public String[] networks(){
		System.out.println("Getting the list of networks...");
		String[] listNetworks={"Aman","Ashish","Prashant","Venkata","Ankita"};
		return listNetworks;
	}
	public void connectToNetwork(){
		String[] arr= networks();
		for(String element: arr){
			System.out.println("* "+ element);
		}
		Random rand=new Random();
		int index=rand.nextInt(arr.length);
		System.out.println("Connected to "+arr[index]);
	}
}

public class DefaultMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj=new SmartMobile();   //dynamic method dispatch
		obj.record4KVideo();
		obj.pickcall();
		obj.takepic();
		
		SmartMobile sm=new SmartMobile();
		sm.record4kVideo();
//		sm.record4KVideo();				// ctrl+ space then we can choose which overriden method has to be chosen
		sm.takepic();
		sm.pickcall();
		
		sm.connectToNetwork();
		

	}

}
