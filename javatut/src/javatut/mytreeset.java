package javatut;

import java.util.*;

public class mytreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//example();
		bookclass();
		
		
	} //main
	
	static void example(){
		
		TreeSet <String> ts = new TreeSet<String>();
		ts.add("A");
		ts.add("C");
		ts.add("B");
		
		Iterator <String> itr = ts.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	static void bookclass(){
		book b1 = new book(1,"Data Strict","Suraj","123",10.3);
		book b2 = new book(2,"Algorithm","Suresh","345",11.3);
		book b3 = new book(5,"Java","Rashmi","678",14.3);
		book b4 = new book(3,".Net","Saraswathi","910",2.3);
		
		TreeSet <book> ts = new TreeSet<book>();
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);

		Iterator <book> itr = ts.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


		
	}
	

}
