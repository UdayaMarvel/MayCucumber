package org.pradeepspv;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class WorkingCollection {

	public static void main(String[] args){
		
		List<Integer> l = new ArrayList<>();
		l.add(100);
		l.add(202);
		l.add(421);
		l.add(521);
		l.add(765);
		l.add(788);
	
		
		System.out.println(l);
        int size = l.size();
		System.out.println(size);
        
		for(int i=0;i<l.size();i++){
		System.out.println(i);
		}
	
	       for (int a:l){
		   System.out.println(a);
	       }
			Integer integer=l.get(4);
			System.out.println(integer);
			
               boolean add= l.add(700);
				System.out.println(l);
				
				     l.add(2 , 704);
					System.out.println(l);
					
					int set=l.set(3, 200);
					System.out.println(l);
					
					
				ListIterator<Integer> it=l.listIterator();
                while(it.hasNext()){
				System.out.println(it.next());
				
		}     
				while(it.hasPrevious()){
			    System.out.println(it.previous());
				}
				int indexOf = l.indexOf(202);
			    System.out.println(indexOf);
			    int lastIndexOf = l.lastIndexOf(788);
			    System.out.println(lastIndexOf);
			  
			   boolean empty = l.isEmpty();
			   System.out.println(empty);
			   
			  l.remove(4);
			   System.out.println(l);
			   
				List<Integer> l1 = new ArrayList<>();
				l1.addAll(l);
				l1.add(1000);
				System.out.println(l1);
		 
	     l.retainAll(l);
			   System.out.println(l);
                  
			
	}
	

}
