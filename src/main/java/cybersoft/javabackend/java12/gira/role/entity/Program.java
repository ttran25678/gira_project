package cybersoft.javabackend.java12.gira.role.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import cybersoft.javabackend.java12.gira.common.entity.BaseEntity;
import cybersoft.javabackend.java12.gira.role.util.HttpMethods;

@Entity
public class Program extends BaseEntity{
	private String name;
	private HttpMethods method;//safe type
	private String path;
	
	
	@ManyToMany(mappedBy = "programs")
	private Set<Role> roles = new HashSet<>();
}
