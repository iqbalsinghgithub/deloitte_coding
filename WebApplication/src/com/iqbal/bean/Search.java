package com.iqbal.bean;

public class Search {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Search(int id)
	{
		super();
		this.id=id;
	}
	public String toString() {
		return "Search [id=" + id + "]";
	}
	
}
