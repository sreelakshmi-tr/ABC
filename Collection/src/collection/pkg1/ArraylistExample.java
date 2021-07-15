package collection.pkg1;

import java.util.*;

public class ArraylistExample {

	public static void main(String[] args) {
	
       List list = new ArrayList();
       List linkedList= new LinkedList();
       
       list.add(1);
       list.add(2);
       list.add(1, "hi");
       System.out.println(list);
       list.remove((Integer)1);
       Iterator it= list.iterator();
       
       
       while(it.hasNext()) {
           System.out.println(it.next());
       }
       
       int a[]= {1,2,3,4};
       
       for(int b:a) {
          // System.out.println(b);

       }
       

 


       
       

		
		
		
	
       

       
       
       
       
       
       
       
	}

}
