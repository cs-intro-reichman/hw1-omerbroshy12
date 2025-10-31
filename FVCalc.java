// Computes the future value of a saving investment.

import java.util.Scanner;

public class FVCalc {
	public static void main(String[] args)
	{
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
	    int n = Integer.parseInt(args[2]);;
		double futureValue = Math.pow(rate/100 + 1,n);
		futureValue = futureValue * currentValue;
		System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate + "% will yeild $" +  (int) futureValue);
	}
}