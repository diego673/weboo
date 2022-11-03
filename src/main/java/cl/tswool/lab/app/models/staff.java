package cl.tswool.lab.app.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class staff implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8882609734562500067L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String run;
	private Date birth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRun() {
		return run;
	}
	public void setRun(String run) {
		this.run = run;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public int hashCode() {
		return Objects.hash(birth, id, name, run);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		staff other = (staff) obj;
		return Objects.equals(birth, other.birth) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(run, other.run);
	}
	@Override
	public String toString() {
		return "staff [id=" + id + ", name=" + name + ", run=" + run + ", birth=" + birth + "]";
	}
	
	

}
