package com.unla.grupo4.converters;

import org.springframework.stereotype.Component;

import com.unla.grupo4.entities.UserRole;
import com.unla.grupo4.models.UserRoleModel;

@Component("userRoleConverter")
public class UserRoleConverter {

	public UserRoleModel entityToModel(UserRole userRole) {
		return new UserRoleModel(userRole.getId() ,userRole.getRole(), userRole.isEnabled());
	}
	
	public UserRole modelToEntity(UserRoleModel userRoleModel) {
		return new UserRole(userRoleModel.getId() ,userRoleModel.getRole(), userRoleModel.isEnabled());
	}
	
}
