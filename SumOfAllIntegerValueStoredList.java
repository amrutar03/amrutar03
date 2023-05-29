package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAllIntegerValueStoredList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(10);
		list.add(40);
		list.add(50);
		list.add(90);
		list.add(70);
		int sum=0;
		for(int i=0;i<list.size();i++)
		{
		   sum += list.get(i);
		
		}
		 System.out.println("Sum is"+sum);
		}

	}


