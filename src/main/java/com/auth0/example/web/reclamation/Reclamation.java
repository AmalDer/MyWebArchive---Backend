package com.example.demo.reclamation;

import java.io.Serializable;
import java.time.LocalDate;

import com.example.demo.Admin;
import com.example.demo.StatusReclamation;
import com.example.demo.User;

public class Reclamation implements Serializable {
	
	private long id;
	private LocalDate date;
	private String description;
	private User user;
	private Admin admin;
	private boolean statusReclamation;
	
	public Reclamation(LocalDate date, String description, User user, Admin admin,
			boolean statusReclamation) {
		super();
		this.date = date;
		this.description = description;
		this.user = user;
		this.admin = admin;
		this.statusReclamation = statusReclamation;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Admin getAdmin() {
		return admin;
	}
	
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	public boolean getStatusReclamation() {
		return statusReclamation;
	}
	
	public void setStatusReclamation(boolean statusReclamation) {
		this.statusReclamation = statusReclamation;
	}

	@Override
	public String toString() {
		return "Reclamation [date=" + date + ", description=" + description + ", user=" + user + ", admin=" + admin
				+ ", statusReclamation=" + statusReclamation + "]";
	}

	
	
}
