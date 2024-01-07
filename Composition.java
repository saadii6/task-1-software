// import java.io.*;
import java.util.*;

class Book {

	public String title;
	public String author;

	Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
}

class Library {

	private final List<Book> books;

	Library(List<Book> books)
	{
		this.books = books;
	}

	public List<Book> getListOfBooksInLibrary()
	{
		return books;
	}
}

class Composition {

	public static void main(String[] args)
	{
		Book b1
			= new Book("EffectiveJ Java", "Joshua Bloch");
		Book b2
			= new Book("Thinking in Java", "Bruce Eckel");
		Book b3 = new Book("Java: The Complete Reference",
						"Herbert Schildt");

		List<Book> book = new ArrayList<Book>();

		book.add(b1);
		book.add(b2);
		book.add(b3);

		Library library = new Library(book);

		List<Book> books
			= library.getListOfBooksInLibrary();

		for (Book bk : books) {

			System.out.println("Title : " + bk.title
							+ " and "
							+ " Author : " + bk.author);
		}
	}
}