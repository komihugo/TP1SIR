package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 	 @Entity
 	 public class Heater {
 		int Id;
 		public Long conso;
 		
 	 public Heater() {
			// TODO Auto-generated constructor stub
		}
 	 
	public Heater(Long conso) {
		this.conso = conso;
	}

	@Id
 	 @GeneratedValue
	public int getId() {
		return Id;
	}
		public void setId(int id) {
		Id = id;
	}
		public Long getConso() {
		return conso;
	}
		public void setConso(Long conso) {
		this.conso = conso;
	}
	}
