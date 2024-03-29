package com.unla.grupo4.services;

import java.util.List;

import com.unla.grupo4.entities.UserRole;
import com.unla.grupo4.models.UserRoleModel;

public interface IUserRoleService {
	
	public List<UserRole> getAll();
	
	public List<UserRole> findByEnabled(boolean enabled);
	
	public UserRoleModel findById(int id);
	
	public UserRole findByRole(String role);
	
	public UserRoleModel insertOrUpdate(UserRoleModel userRoleModel);
	
	public boolean toEnable(int id);
	
	public boolean remove(int id);
}
