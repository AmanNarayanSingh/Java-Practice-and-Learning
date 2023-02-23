
class MyEmployee{
	
	private int id;
	private String name;
	
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
}

public class gettersAndSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmployee emp=new MyEmployee();
//		emp.id=1;
		emp.setId(1);
		emp.setName("Aman Narayan Singh");
		System.out.println(emp.getId());
		System.out.println(emp.getName());

	}

}
