
class Parent{
	int alpha;
	public Parent(){
		System.out.println("The default constructor is invoked of parent class.");
	}
	public Parent(int x){
		System.out.println("The value of x in the parent class is: "+ x);
	}
	public int getAlpha() {
		return alpha;
	}
	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}
}

class Child extends Parent{
	public Child(){
		System.out.println("The default constructor of child class is invoked.");
	}
	public Child(int x, int y){
		super(x);
		System.out.println("I am in child class and the value of y:  "+y);
	}
}

class GrandChild extends Child{
	public GrandChild(){
		System.out.println("The constructor of grandchild is invoked.");
	}
	public GrandChild(int x,int y,int z){
		super(x,y);
		System.out.println("The value of z is: "+z);
	}
}
public class Constructors_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey! Aman");
//		Parent obj=new Parent();
//		Child chd=new Child(2,3);
		GrandChild gc=new GrandChild(2,8,10);

	}

}
