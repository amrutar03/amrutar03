package Assignment3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListOfString {

	public static void main(String[] args) {
		
		List<String> li=Arrays.asList("Web Automation", "API Automation", "Mobile Automation");

		Iterator<String>li1=li.iterator();
		while(li1.hasNext())
		{
			String x=li1.next();
			if(x.contains("Mobile"))
			{
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
	}

}
