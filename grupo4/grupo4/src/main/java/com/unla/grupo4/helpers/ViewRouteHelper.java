package com.unla.grupo4.helpers;

public class ViewRouteHelper {
	
	//Login
		public final static String LOGIN = "login/login";
		public final static String LOGOUT ="login/logout";
		public final static String INDEX ="home/index";
	
	//User
		//Views
		public final static String USER_INDEX = "user/index";
		public final static String USER_FORM = "user/form";
		public final static String USER_UPDATE = "user/update";
		public final static String USER_UPDATE_FORM = "user/formUpdate";
		public final static String USER_DELETE = "user/delete";
		public final static String USER_LIST = "user/listUsers";
		
		//Redirect
		public final static String ROUTE_USER_ROOT = "/index";
		public final static String ROUTE_USER_FORM = "/users/newUser";
		public final static String ROUTE_USER_UPDATE = "/users/update";
		public final static String ROUTE_USER_DELETE = "/users/deleteUser";
	
	//UserRole
		//Views
		public final static String USER_ROLE_INDEX = "userRole/index";
		public final static String USER_ROLE_INSERT = "userRole/form";		
		public final static String USER_ROLE_DELETE = "userRole/delete";
		public final static String USER_ROLE_UPDATE = "userRole/update";
		public final static String USER_ROLE_LIST = "userRole/list";
			
		//Redirects
		public final static String USER_ROLE_ROOT = "/userRoles/";
		public final static String USER_ROLE_DELETE_ROOT = "/userRoles/deleteRole";
		public final static String USER_ROLE_INSERT_ROOT = "/userRoles/newRole";
		
	//Rodado
		//Views
		public final static String RODADO_INSERT = "rodado/rodado";
		//Redirects
		public final static String RODADO_ROOT = "/rodado/newRodado";
		
	//Person
		//Views
		public final static String PERSON_FORM = "person/form";
		
		//Redirects
		public final static String ROUTE_PERSON_FORM = "/persons/newPerson";
		
	//Permiso
		//Views
		public final static String PERMISO_DIARIO_NEW = "permiso/permisoDiario";
		public final static String PERMISO_PERIODO_NEW = "permiso/permisoPeriodo";
		public final static String PERMISO_FECHA_FORM = "permiso/formFechas";
		
		//Redirects
		public final static String PERMISO_DIARIO_ROOT = "/permiso/newPermisoDiario";
		public final static String PERMISO_PERIODO_ROOT = "/permiso/newPermisoPeriodo";
		
	//QR
		public final static String QR_CODE_IMAGE_PATH = "./src/main/resources/QRCode";
		
	//Link de la pagina 
		public final static String LINK = "https://jssanchezz.github.io/OO2-TP-E042021/docs/index?";
}
