package Assignment3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListOfArrayUsingIterator {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(100,20,30,60,40,70);
		Iterator<Integer>li=list.iterator();
        while(li.hasNext())
        {
        	Integer x1=li.next();
        	System.out.println(x1);
        }
	}

}
