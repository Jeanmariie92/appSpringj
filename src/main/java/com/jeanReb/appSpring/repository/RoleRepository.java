package com.jeanReb.appSpring.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeanReb.appSpring.entity.Role;




@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

	public Role findByName(String name);

}
