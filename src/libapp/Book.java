package libapp;

public class Book {
	private String isbn;
	private String title;
	private String genre;
	private String desciption;
	private String author;
	private int quantity;
	private int numCheckedOut;

	public Book(String isbn, String title, String genre, String desciption, String author, int quantity, int numCheckedOut) {
		this.isbn = isbn;
		this.title = title;
		this.genre = genre;
		this.desciption = desciption;
		this.author = author;
		this.quantity = quantity;
		this.numCheckedOut = numCheckedOut;
	}


	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getDesciption() {
		return desciption;
	}

	public String getAuthor() {
		return author;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getNumCheckedOut() {
		return numCheckedOut;
	}

	public boolean checkOut() {
		if (numCheckedOut >= quantity) {
			return false;
		}
		numCheckedOut++;
		return true;
	}

	public boolean checkIn() {
		if (numCheckedOut <= 0) {
			return false;
		}
		numCheckedOut--;
		return true;
	}

}
