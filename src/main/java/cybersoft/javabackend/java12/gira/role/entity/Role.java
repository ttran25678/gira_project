package cybersoft.javabackend.java12.gira.role.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import cybersoft.javabackend.java12.gira.common.entity.BaseEntity;



@Entity
@Table(name="gira_role")
public class Role extends BaseEntity{

	private String name;
	private String description;
	
	@ManyToMany(mappedBy = "roles")
	private Set<Group> groups = new HashSet<Group>();
	
	
	// quan trọng ở đây. best practice
	// ALL là all những thằng dưới, trong quan hệ nhiều nhiều thì thằng này SAI
	// DETACH: 
	// MERGE so sánh chỗ nào thay đổi thì merge vào
	// PERSIST 
	// REMOVE đã delete trong jpa, thì nó viết câu lệnh delete
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="gira_role_program",
			joinColumns = @JoinColumn(name = "role_id"),
			inverseJoinColumns = @JoinColumn(name = "program_id")		
	)
	private Set<Program> programs = new HashSet<Program>();
	
}
