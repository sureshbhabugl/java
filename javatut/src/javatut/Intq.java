package javatut;

import java.util.*;


public class Intq {

	int[] q;
	int total;
	int front;
	int rear;
	int size;
	
	
	public Intq(){
		total=0;
		front = 0;
		rear = 0;
		this.size=10;
		q = new int[size];
		
		}
	
	
	public boolean enque(int item){
		
		if(!isfull()){
			total++;
			q[rear] = item;
			rear++;
			return true;
		} else return false;
		
		
	}
	
	public boolean isfull(){
		return(size==total);
	}
	
	public int deque(){
		int item = q[front];
		front++;
		total--;
		return(item);
		
	}
	
	public boolean isempty(){
		return(total==0);
	}
	
}
