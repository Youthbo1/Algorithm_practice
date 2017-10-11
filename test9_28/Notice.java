package test9_28;

import java.util.Date;

import javax.xml.crypto.Data;

public class Notice {
	private int id;
	private String title;
	private String creator;
	private Date time;
	public Notice(int id, String title, String creator, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.creator = creator;
		this.time =  date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
