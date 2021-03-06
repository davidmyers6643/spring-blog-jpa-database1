package com.blog.blog.models;

import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ad {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String description;

//    @Column(columnDefinition = "VARCHAR(200) NOT NULL DEFAULT 'Buy NOW!!'")
//    private String callToAction;
//
	
	public Ad() {
	}
	
	public Ad(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public Ad(long id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d, TITLE: %s, DESCRIPTION: %s", id, title, description);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
}
