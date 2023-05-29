package Assignment3;

import java.util.Arrays;
import java.util.List;

public class ListofArrayUsingForLoop {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(10,20,30,40,50,60);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}

	}

}
