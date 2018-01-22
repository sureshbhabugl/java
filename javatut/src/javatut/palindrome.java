package javatut;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Malayalam";
		s=s.toLowerCase();
		String rev_string="";
		
		for(int i=0;i<=s.length()-1;i++){
			rev_string+=s.charAt(s.length()-1-i);
		}
		//System.out.println(rev_string);
		
		
		if (s.compareTo(rev_string)==0)
			System.out.println("Its a palindrome");
		else
			System.out.println("Not a palindrome");

	}

}
