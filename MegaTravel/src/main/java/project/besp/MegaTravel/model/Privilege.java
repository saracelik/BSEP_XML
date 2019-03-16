package project.besp.MegaTravel.model;

import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Privilege {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
 
    public String name;
 
    @ManyToMany(mappedBy = "privileges")
    private Collection<Role> roles;

	public Privilege(String name) {
		super();
		this.name = name;
	}

	public Privilege() {
		super();
		// TODO Auto-generated constructor stub
	}
}
