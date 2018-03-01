package domain;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.*;

@Entity
public class Person {
	private String firstname;
	private String lastname;
	private String mail;
	private Long id;
	private List<Home>houses;
	private List<Person>friends = new ArrayList<Person>();
	
	/**
	 * @return the friends
	 */
	@ManyToMany 
	public List<Person> getFriends() {
		return friends;
	}
	/**
	 * @param friends the friends to set
	 */
	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}
	public Person(String firstname, String lastname, String mail) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
	}
	/**
	 * @return the houses
	 */
	@OneToMany()
	public List<Home> getHouses() {
		return houses;
	}
	/**
	 * @param houses the houses to set
	 */
	public void setHouses(List<Home> houses) {
		this.houses = houses;
	}
	/**
	 * @return the devices
	 */
	@OneToMany
	public List<ElectronicDevice> getDevices() {
		return Devices;
	}
	/**
	 * @param devices the devices to set
	 */
	public void setDevices(List<ElectronicDevice> devices) {
		Devices = devices;
	}
	
	private List<ElectronicDevice> Devices;
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	 /*public Person() {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
	}*/
	
	//public List<Home> getFrien() {
	//	return houses;
	//}
	
	 
	//public void setFriend(List<Home> homes) {
	//	this.houses= homes;
	//}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
