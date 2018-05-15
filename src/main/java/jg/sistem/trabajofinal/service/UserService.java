package jg.sistem.trabajofinal.service;

import java.util.List;

import jg.sistem.trabajofinal.bean.UserBean;






public interface UserService {

	   List<UserBean> listarUsuarios();
//
   // 	UserBean obtenerUsuario(int idUsuario);
//
//	int modificarUsuario(UserBean usuario);
//
		int crearUsuario(UserBean usuario);
//
//	int eliminarUsuario(int idUsuario);
	
	int validaLogins(String username,String password);

}
