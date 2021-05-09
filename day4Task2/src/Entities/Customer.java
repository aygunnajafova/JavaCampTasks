package Entities;


import java.time.LocalDate;

import Abstract.Entity;

public class Customer implements Entity {
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate dateOfBirth;
	public String nationalityId;
	
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
		this.nationalityId=nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int Id) {
		this.id = Id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationality) {
		nationalityId = nationality;
	}

}
