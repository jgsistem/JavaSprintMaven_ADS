package jg.sistem.trabajofinal.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jg.sistem.trabajofinal.bean.UserBean;
import jg.sistem.trabajofinal.dao.UserDao;
import jg.sistem.trabajofinal.dao.UserMapper;


@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
    private JdbcTemplate jdbcTemplate;
      
  
    public int validaLogins(String  usuario, String clave) {    	
       	
	     int countOfActorsNamedJoe = this.jdbcTemplate.queryForObject(
	     "select count(*) from TM_USUARIOS WHERE NO_USUARIO = ? AND DE_PASSWORD = ?", Integer.class,usuario,clave);
	      
       return countOfActorsNamedJoe;  
    }

	@Override
	public List<UserBean> listarUsuarios() {
          String sql = "SELECT * FROM TM_USUARIOS";  
        return jdbcTemplate.query(sql, new UserMapper());	
	}
//	
 @Override
	    public int crearUsuario(UserBean usuario) {

	        String sql = "INSERT INTO TM_USUARIOS (NO_USUARIO,DE_CORREO,DE_PASSWORD) VALUES (?,?,?)";
	        
	        Object[] params = new Object[] { usuario.getNomBre_Usuario(), usuario.getDeCorre_Usuario(),
	        		usuario.getCaContra_Usuario()};

        return jdbcTemplate.update(sql, params);        
	    }
//
// @Override
// public UserBean obtenerUsuario(int idUsuario) {
// 	
// 	String sql = "SELECT * FROM USUARIO WHERE ID_USUARIO = ?";
// 	
// 	return (UserBean) jdbcTemplate.queryForObject(sql, new Object[] { idUsuario }, new UserMapper());
// }
// 


	
    
    
     
}
