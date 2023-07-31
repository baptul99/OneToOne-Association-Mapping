package OneToOne;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AadharCard {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
private int id;
private long number;
private LocalDate dob;
private String city;
private int pincode;
@OneToOne(mappedBy = "card")
private Person person;

public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}



}
