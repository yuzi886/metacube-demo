package com.metacube.demo.entities;

import java.util.Set;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "The name cannot be empty.")
	@Size(max = 255, message = "The name must have less than 256 characters.")
	private String name;
	
	@NotNull(message = "The password cannot be empty.")
	@Size(max = 255, message = "The name must have less than 256 characters.")
	private String password;
	
	@NotNull(message = "chain account cannot be empty")
	private String account;
	
	//@OneToMany(mappedBy = "users")
	//private Set<Operation> operation;
	
	public User() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	/*public Set<Operation> getOperation(){
		return operation;
	}
	
	public void setOperation(Set<Operation> operation) {
		this.operation = operation;
	}*/
	
}
