package jg.sistem.trabajofinal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jg.sistem.trabajofinal.bean.UserBean;
import jg.sistem.trabajofinal.dao.UserDao;
import jg.sistem.trabajofinal.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao usuarioDao;
	
	
	@Override
	public int validaLogins(String username, String password) {
		   System.out.println(" Servicio  Impli User : "+ username);
	        System.out.println("Servicio  Impli Password : "+ password);
		 return usuarioDao.validaLogins(username,password);
	}

	@Override
	public List<UserBean> listarUsuarios() {
		 List<UserBean> usuarios = usuarioDao.listarUsuarios();

	        return usuarios;
	}
//
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
    public int crearUsuario(UserBean usuario){
        return usuarioDao.crearUsuario(usuario);
   }
//
//	@Override
//    public UserBean obtenerUsuario(int idUsuario){
//        return usuarioDao.obtenerUsuario(idUsuario);
//    }
		

}
