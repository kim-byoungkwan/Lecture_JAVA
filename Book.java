package kr.ac.kopo.javabasicproject01;

import java.awt.print.Book;
import java.util.ArrayList;

public class Book{
	
	private int bookno;
	// 책 고유 번호
	private String title;
	// 책 제목
	private String author;
	// 책 저자
	private String genre;
	// 책 장르
	private String bookposition;
	// 책 보관위치
	private boolean availability;
	// 책 대여 가능여부
	public Book() {
		
	}
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	
//	public Book(int bookno, String title, String author, String genre, String bookposition, boolean availability) {
//		
//		super();
//		this.bookno = bookno;
//		this.title = title;
//		this.author = author;
//		this.genre = genre;
//		this.bookposition = bookposition;
//		this.availability = availability;
//		
//	}
	
	public int getBookNum() {
		return bookno;
	}
	
	public void setBookNum(int bookno) {
		this.bookno = bookno;
	}
	
	public String getTitle() {		
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {		
		this.genre = genre;
	}
	
	public String getbookposition() {
		return bookposition;
	}
	
	public void setBookPosition(String bookposition) {
		this.bookposition = bookposition;
	}
	
	public boolean getAvailability() {
		return availability;
	}
	
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
}