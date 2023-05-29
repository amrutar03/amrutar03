package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatArrayValueStoreList {

	public static <T> List<T> convertArrayToList(T arr[]) 
	{
		//create an empty list
		List<T> list=new ArrayList<>();
		//iterate through the array
		for(T t1:arr)
		{
			//add each element into the list
			list.add(t1);
	     }
		//here return converted list
		return list;
	}
	
	public static void main(String[] args) {
		//here create array
		String arr[]= {"Ram","Sham","Krishna","Ganesh","Shree"};
		System.out.println("Array is:"+Arrays.toString(arr));
		//here converted to array to list
		List<String> li= convertArrayToList(arr);
		System.out.println("List is:"+li);
	}

}
