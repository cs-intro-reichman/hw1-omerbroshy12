// Splits a restaurant bill evenly among three diners.


public class Bill3 {
	public static void main(String[] args) 
	{
	    String name1 = args[0], name2 = args[1], name3 = args[2];
		int num = Integer.parseInt(args[3]);
	    double sum = num/3;
		System.out.print("Dear " + name3 + ", " + name2 + ", and " + name1 + ": ");   
		System.out.print("pay " + Math.ceil(sum) + " Shekels each");
	}
}
