package javatut;

public class book implements Comparable{
	
	int id;
	String name, author, isbn;
	double price;
	
	book(int id, String name, String author, String isbn, double price){
		this.id = id;
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	

}
