package jg.sistem.trabajofinal.dao;

import java.util.List;

import jg.sistem.trabajofinal.bean.UserBean;






public interface UserDao {

		List<UserBean> listarUsuarios();
//	
//		UserBean obtenerUsuario(int idUsuario);
//
		int crearUsuario(UserBean usuario);
//	
//	int modificarUsuario(UserBean usuario);
//	
//	int eliminarUsuario(int idUsuario);	

	int validaLogins(String usuario, String clave);
	
}
