package jg.sistem.trabajofinal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import jg.sistem.trabajofinal.bean.UserBean;

public class UserMapper implements RowMapper<UserBean>{
	
    public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
    	UserBean usuario = new UserBean();
        
		usuario.setId_Usuario(rs.getInt("ID_USUARIO"));
		usuario.setNomBre_Usuario(rs.getString("NO_USUARIO"));
		usuario.setDeCorre_Usuario(rs.getString("DE_CORREO"));
		usuario.setCaContra_Usuario(rs.getString("DE_PASSWORD"));
		
        return usuario;
    }
}
