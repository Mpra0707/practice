package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Books {
@Id

@Column
private int BookID;
@Column
private String BookName;
@Column
private String BookAuthor;

public int getBookID() {
	return BookID;
}
public void setBookID(int bookID) {
	BookID = bookID;
}
public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	BookName = bookName;
}
public String getBookAuthor() {
	return BookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	BookAuthor = bookAuthor;
}
public Books(int bookID, String bookName, String bookAuthor) {
	super();
	BookID = bookID;
	BookName = bookName;
	BookAuthor = bookAuthor;
}
public Books() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Books [BookID=" + BookID + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + "]";
}

}
