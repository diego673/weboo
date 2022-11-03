package cl.tswool.lab.app.models;


import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class travels implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1949204255064865483L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_package;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_customer;
	
	@ManyToMany(mappedBy = "travel")
	private Set<customers> customer;

	public int getId_package() {
		return id_package;
	}

	public void setId_package(int id_package) {
		this.id_package = id_package;
	}

	public int getId_customer() {
		return id_customer;
	}

	public void setId_customer(int id_customer) {
		this.id_customer = id_customer;
	}

	public Set<customers> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<customers> customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, id_customer, id_package);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		travels other = (travels) obj;
		return Objects.equals(customer, other.customer) && id_customer == other.id_customer
				&& id_package == other.id_package;
	}
	
	

}
