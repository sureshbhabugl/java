package javatut;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isPrime;
		int sum=0;
		for(int i=1;i<=100;i++){
			isPrime=true;
			for (int j=2;j<i;j++){
				if(i%j==0) {
					isPrime=false;
						break;
				}
			}
			if(isPrime){
				System.out.println(i);
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);
		
	}

}
