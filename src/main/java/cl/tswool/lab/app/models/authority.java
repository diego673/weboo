package cl.tswool.lab.app.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class authority implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4545736366335970088L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int id_user;
	private String authority;
	@Override
	public int hashCode() {
		return Objects.hash(authority, id, id_user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		authority other = (authority) obj;
		return Objects.equals(authority, other.authority) && id == other.id && id_user == other.id_user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "authority [id=" + id + ", id_user=" + id_user + ", authority=" + authority + "]";
	}
	
	

}
