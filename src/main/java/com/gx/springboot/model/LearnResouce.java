package com.gx.springboot.model;

public class LearnResouce {

	private String author;
	private String title;
	private String url;
	
	public LearnResouce(String author, String title, String url) {
		super();
		this.author = author;
		this.title = title;
		this.url = url;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "LearnResouce [author=" + author + ", title=" + title + ", url=" + url + "]";
	}
	
	
}
