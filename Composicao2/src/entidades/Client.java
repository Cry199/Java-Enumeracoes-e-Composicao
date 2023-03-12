package entidades;

import java.text.SimpleDateFormat;
import java.util.*;

public class Client 
{
	private String name;
	private String email;
	private Date birthDate;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client() {}
	
	public Client(String name, String email, Date birthDate) 
	{
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
 	}
}
