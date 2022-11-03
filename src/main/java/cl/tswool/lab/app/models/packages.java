package cl.tswool.lab.app.models;


import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class packages implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6855836417612592443L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private int name;
	private int description;
	private int enable;
	
	@ManyToMany
	@JoinTable
	private Set<customers> customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getDescription() {
		return description;
	}

	public void setDescription(int description) {
		this.description = description;
	}

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public Set<customers> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<customers> customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, description, enable, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		packages other = (packages) obj;
		return Objects.equals(customer, other.customer) && description == other.description && enable == other.enable
				&& id == other.id && name == other.name;
	}
	
	
}
