package domain;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Home {
	
	private int id;
	private int taille;
	private int nbpiece;
	private List<Heater> chauffages;
	
	public Home() {
	}
	Home(int taille, int nbpiece) {
		this.taille = taille;
		this.nbpiece = nbpiece;
	}

	@OneToMany(targetEntity=Heater.class )
	@JoinColumn(name="id_chauffage")
	public List<Heater> getChauffages() {
		return chauffages;
	}
	
	public void setChauffages(List<Heater> chauffages) {
		this.chauffages = chauffages;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getNbpiece() {
		return nbpiece;
	}
	public void setNbpiece(int nbpiece) {
		this.nbpiece = nbpiece;
	}
	
	
}
