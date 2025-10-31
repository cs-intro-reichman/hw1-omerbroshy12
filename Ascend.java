// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Scanner;

public class Ascend {
	public static void main(String[] args) 
	{
		int a, b, c, temp, lim;
		lim = Integer.parseInt(args[0]);
		int min = 0;
		int max = lim;
		a = (int)(Math.random() * ((max - min) + 1)) + min;
		b = (int)(Math.random() * ((max - min) + 1)) + min;
		c = (int)(Math.random() * ((max - min) + 1)) + min;
		System.out.println(c + " " + b + " " + a);
		if (a < b)
		{
			temp = b;
			b = a;
			a = temp;
		}
		if (a < c)
		{
			temp = c;
			c = a;
			a = temp;
		}
		if (b < c)
		{
			temp = c;
			c = b;
			b = temp;
		}
		System.out.println(c + " " + b + " " + a);
	}
}
