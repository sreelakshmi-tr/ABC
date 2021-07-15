package collection.pkg2;

import java.util.*;
//collection egxample
public class CollectionMain {

	public static void main(String[] args) {
		
		ArrayList ar= new ArrayList();

		
		ar.add(1);//Integer object
		ar.add("Hello");//String
      
        ArrayList<Integer> al=new ArrayList();      
        al.add(10);
        al.add(20);
        
		System.out.println(ar);
		
//		Iterator it= ar.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
		
	
	
	for(Integer i:al) {
       System.out.println(i);

	}
		

	}

}

