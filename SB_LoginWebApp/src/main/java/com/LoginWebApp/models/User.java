package com.LoginWebApp.models;

public class User {
	  private String id;
	    private String password;

	    public User() {}

	    public User(String id, String password) {
	        this.id = id;
	        this.password = password;
	    }

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
}
