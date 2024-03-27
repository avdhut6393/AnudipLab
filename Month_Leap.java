package anu.com;
import java.time.Month;

public class Month_Leap
{
	public static void main(String[] args)
	{
        for (Month month_name: Month.values())
        {
            System.out.println(month_name + " - " + month_name.length(false) + " days");
        }
    }
}