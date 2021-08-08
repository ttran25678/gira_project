package cybersoft.javabackend.java12.gira.role.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cybersoft.javabackend.java12.gira.common.entity.BaseEntity;

@Entity
@Table(name="gira_group")
public class Group extends BaseEntity{

	private String name;
	private String description;
	
//	@OneToMany(mappedBy = "group")
//	private List<Role> roles = new ArrayList<Role>();
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="gira_group_role",
			joinColumns = @JoinColumn(name = "group_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")		
	)
	private List<Role> roles = new ArrayList<Role>();
}
