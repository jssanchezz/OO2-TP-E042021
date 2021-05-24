package com.unla.grupo4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.grupo4.helpers.ViewRouteHelper;
import com.unla.grupo4.models.UserRoleModel;
import com.unla.grupo4.services.implementation.IUserRoleService;

@Controller
@RequestMapping("/userRoles")
public class UserRoleController {
	
	@Autowired
	@Qualifier("userRoleService")
	private IUserRoleService userRoleService;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.USER_ROLE_INDEX);
		mAV.addObject("userRoles", userRoleService.getAll());
		return mAV;
	}
	
	@GetMapping("/newRole")
	public ModelAndView newRole() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.USER_ROLE_INSERT);
		mAV.addObject("userRole", new UserRoleModel());
		return mAV;
	}
	
	@PostMapping("/saveRole")
	public RedirectView save(@ModelAttribute("userRole") UserRoleModel userRoleModel) {
		userRoleService.insertOrUpdate(userRoleModel);
		return new RedirectView(ViewRouteHelper.USER_ROLE_ROOT);
	}
	
	@GetMapping("/updateRole")
	public ModelAndView updateRole() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.USER_ROLE_UPDATE);
		mAV.addObject("userRoles",userRoleService.getAll());
		return mAV;
	}
	
	@GetMapping("/updateRole/{id}")
	public ModelAndView updateRoleById(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.USER_ROLE_INSERT);
		mAV.addObject("userRole",userRoleService.findById(id));
		return mAV;
	}
	
	@GetMapping("/deleteRole")
	public ModelAndView deleteRole() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.USER_ROLE_DELETE);
		mAV.addObject("userRoles",userRoleService.getAll());
		return mAV;
	}
	
	@PostMapping("/deleteRole/{id}")
	public RedirectView deleteRoleById(@PathVariable("id") int id) {
		userRoleService.remove(id);
		return new RedirectView(ViewRouteHelper.USER_ROLE_ROOT);
	}
}
