package javatut;
import java.util.*;

public class myhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		firstduplicate();
		//example();

	}
	
	static void example(){
	HashSet <String> hs = new HashSet<String>();
	hs.add("a");
	hs.add("b");
	hs.add("c");
	hs.add("a");
	
	if (hs.contains("a")) System.out.println("Found");
	
	Iterator <String> itr = hs.iterator();
	while(itr.hasNext()) System.out.println(itr.next());
	}
	static void firstduplicate(){
		
		String s = "Suresh";
		s=s.toLowerCase();
		Character c;
		HashSet <Character> hs = new HashSet<Character>();
		
		for (int i=0;i<s.length();i++){
			
			c= s.charAt(i);
			if (hs.contains(c)) {
				System.out.println(c);
				break;
			}
			else hs.add(c);
			
		}
	}

}
