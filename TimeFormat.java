// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args)
   {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));

		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		String underTenMinutes;
		String ifmorning = " AM";
        
		if (hours > 12)
		{
			hours -= 12;
			ifmorning = " PM";
		}
		if (hours == 12)
			ifmorning = " PM";
		if (minutes < 10)
		{
			underTenMinutes = "0" + minutes;
			System.out.println(hours + ":" + underTenMinutes + ifmorning);
		}
		else
		    System.out.println(hours + ":" + minutes + ifmorning);
	}
}