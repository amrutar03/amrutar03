//package Assignment3;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ListOperations {
//
//	public static void main(String[] args) {
//		 
//       List<Integer>li=new ArrayList<>();
//       li.add(33);
//       li.add(44);
//       li.add(55);
//       li.add(66);
//       li.add(77);
//       li.add(88);
//       
//       System.out.println(li);
//       int x=li.size();
//       System.out.println(x);
//       System.out.println(li.remove(1));
//      
//      System.out.println(li);
//
//       //Here dispaly error IndexOutOfBoundException lenght of list size is minimum so not add here index 3
////       li.add(3, 90);
////       System.out.println(li);
//       
//       int j=li.size();
//       System.out.println(j);
//
//     li.remove(55);
//     System.out.println(li);
//	
//	
//	}
//	}

package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
       List<Integer> li = new ArrayList<>();
       li.add(33);
       li.add(44);
       li.add(55);
       li.add(66);
       li.add(77);
       li.add(88);
       
       System.out.println(li);
       
       System.out.println(li.remove(1));
      
       System.out.println(li.remove(Integer.valueOf(55)));
       
       System.out.println(li);
       
       li.add(3, 90); // Adding element 90 at index 3
       System.out.println(li);
       
       System.out.println(li.size());
       
       printListValue(li);
       
    // Convert List to array
       Integer[] array = li.toArray(new Integer[li.size()]);

       // Print the array elements
       for (Integer value : array) {
           System.out.println("Converted list into array value::"+value);
       }
    }
	
	   public static void printListValue(List<Integer> list)
       {
    	   for(Integer values:list)
    	   {
    		   System.out.println(values);
    	   }
       
       }}