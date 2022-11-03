package cl.tswool.lab.app.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import cl.tswool.lab.app.models.packages;

@Entity
public class customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7189184200753221986L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private int name; 
	private int run;
	private Date birth;
	
	@ManyToMany
	@JoinTable
	private Set<packages> packages;

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

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public Set<packages> getPackages() {
		return packages;
	}

	public void setPackages(Set<packages> packages) {
		this.packages = packages;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birth, id, name, packages, run);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		customers other = (customers) obj;
		return Objects.equals(birth, other.birth) && id == other.id && name == other.name
				&& Objects.equals(packages, other.packages) && run == other.run;
	}
	
	

	
}
