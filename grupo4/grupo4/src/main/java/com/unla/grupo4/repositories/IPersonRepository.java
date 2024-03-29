package com.unla.grupo4.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo4.entities.Person;

@Repository("personRepository")
public interface IPersonRepository extends JpaRepository<Person, Serializable> {

	abstract Person findById(int id);
	
	abstract Person findByDni(long dni);
}
