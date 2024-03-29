package com.unla.grupo4.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unla.grupo4.entities.User;

@Repository("userRepository")
public interface IUserRepository extends JpaRepository<User, Serializable>{
	
	public abstract User findByDni(String dni);
	
	public abstract User findByEmail(String email);
	
	public abstract User findByUserPassword(String password);
	
	public abstract User findByUserName(String username);
	
	public abstract User findByTypeDoc(int typeDoc);
	
	public abstract List<User> findByEnabled(boolean enabled);
	
	@Query("SELECT u FROM User u JOIN FETCH u.role WHERE u.userName = (:username)")
	public abstract User findByUsernameAndFetchRole(@Param("username") String username);

}
