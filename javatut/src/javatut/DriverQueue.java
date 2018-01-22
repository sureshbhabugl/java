package javatut;
import java.util.*;
public class DriverQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intq q  = new Intq();
		for( int i=0;i<10;i++){
			q.enque(i+2);
		}
		
		//System.out.println(q);
		for( int i=0;i<10;i++){
			System.out.print(" "+q.deque()+" ");
		}
		
	}

}
