package practiceSheet3_library;

public class Library_prac3 {
	public static String convertLower(String str){
		str=str.toLowerCase();
		return str;
	}
	
	public static String replaceSpaces(String str){
		str=str.replace(" ", "_");
		return str;
	}
	public static void pattern(int inp){
		System.out.println("Printing the pattern: ");
		for(int i=inp;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static int sumOfEven(int n){
		int res=0;
		for(int i=0;i<n;i++){
			res+=2*i;
		}
		return res;
	}
	public static void multTable(int n){
		System.out.println("Printing the table of"+n+" upto 10 terms: ");
		for(int i=1;i<=10;i++){
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}