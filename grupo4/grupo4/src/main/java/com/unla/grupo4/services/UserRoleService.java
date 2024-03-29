package com.unla.grupo4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo4.converters.UserRoleConverter;
import com.unla.grupo4.entities.UserRole;
import com.unla.grupo4.models.UserRoleModel;
import com.unla.grupo4.repositories.IUserRoleRepository;
import com.unla.grupo4.services.IUserRoleService;

@Service("userRoleService")
public class UserRoleService implements IUserRoleService{
	
	@Autowired
	@Qualifier("userRoleRepository")
	private IUserRoleRepository userRoleRepository;
	
	@Autowired
	@Qualifier("userRoleConverter")
	private UserRoleConverter userRoleConverter;
	
	@Override
	public List<UserRole> getAll() {
		return userRoleRepository.findAll();
	}
	
	@Override
	public boolean remove(int id) {
		try {
			UserRole userRole = userRoleRepository.findById(id);
			userRole.setEnabled(false);
			userRoleRepository.save(userRole);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public UserRoleModel insertOrUpdate(UserRoleModel userRoleModel) {
		UserRole userRole = userRoleRepository.save(userRoleConverter.modelToEntity(userRoleModel));
		return userRoleConverter.entityToModel(userRole);
	}

	@Override
	public UserRoleModel findById(int id) {
		return userRoleConverter.entityToModel(userRoleRepository.findById(id));
	}

	@Override
	public UserRole findByRole(String role) {
		return userRoleRepository.findByRole(role);
	}

	@Override
	public List<UserRole> findByEnabled(boolean enabled) {
		return userRoleRepository.findByEnabled(enabled);
	}

	@Override
	public boolean toEnable(int id) {
		try {
			UserRole userRole = userRoleRepository.findById(id);
			userRole.setEnabled(true);
			userRoleRepository.save(userRole);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
