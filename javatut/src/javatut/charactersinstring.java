package javatut;

public class charactersinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "S1t2r3i4n5g6";
		Character c;
		int sum=0;
		for(int i=0;i<=s.length()-1;i++){
			c=s.charAt(i);
			if(Character.isDigit(c))
			{
				sum=sum+Character.getNumericValue(c);
				System.out.println(c);
			}
			
			
		}
		System.out.printf("Sum is %d",sum);;

	}

}
