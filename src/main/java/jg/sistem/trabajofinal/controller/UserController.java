package jg.sistem.trabajofinal.controller;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jg.sistem.trabajofinal.bean.UserBean;
import jg.sistem.trabajofinal.service.UserService;





@Controller
public class UserController {

	@Autowired
	UserService usuarioService;
	
	@GetMapping(value ={"/", "/index"})
	public String index() {
				
		System.out.println("Mostrando Inicio!!!");
				
		return "index";
	}
	
	   @RequestMapping("/login")
	    public String validaLogin(@RequestParam("username") String username, @RequestParam("password") String password,
	        HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       
	        int result = usuarioService.validaLogins( username.trim(), password.trim());
	       String tipo ="";
        if(result > 0) {  
        	   tipo = "home";	       
	        } else {		        	  
	        	tipo = "index";
	        }         
     	return tipo;
	    }	   
	  
	
//	   @GetMapping(value = "/mostrarUsuario")
//	    public ModelAndView mostrarUsuario(@RequestParam("id") int id) {
//
//	        UserBean usuarioBean = usuarioService.obtenerUsuario(id);
//
//	        return new ModelAndView("muestraUsuario","usuario",usuarioBean);
//	    }

	   @GetMapping(value = "/listarUsuarios")
		public ModelAndView listarUsuarios(){

	        List<UserBean> listaUsuarios = usuarioService.listarUsuarios();

	        System.out.println("volvio select");
	        for (UserBean bean: listaUsuarios){
	        	System.out.println("recorre for");
	            System.out.println(bean);
	        }
	        
	        return new ModelAndView("listaUsuarios","listaUsuarios",listaUsuarios);
	    }	
	
	   @PostMapping(value = "/crearUsuario")
	    public String crearUsuario(HttpServletRequest request) throws ParseException {

	        UserBean usuario = new UserBean();

	        String nombre = request.getParameter("usuario");
	        String correo = request.getParameter("correo");
	        String clave = request.getParameter("clave");
	      //  String nacimiento = request.getParameter("nacimiento");
	        
	        usuario.setNomBre_Usuario(nombre.trim());
	        usuario.setDeCorre_Usuario(correo.trim());
	        usuario.setCaContra_Usuario(clave.trim());
	      //  usuario.setCaContra_Usuario(nacimiento.trim());
	      

	        int result = usuarioService.crearUsuario(usuario);

	        if (result>0){
	            System.out.printf("Usuario Creado Exitosamente (%d) - %s%n",result,usuario);
	        } else {
	            System.out.printf("Error al Crear Usuario - %s%n",usuario);
	        }

	        return "redirect:/listarUsuarios";
	    }	
	   
//	   @PostMapping(value = "/crearUsuario")
//	    public String crearUsuario(HttpServletRequest request) throws ParseException {
//
//	        UserBean usuario = new UserBean();
//
//	        String nombre = request.getParameter("username");
//	        String correo = request.getParameter("correo");
//	        String clave = request.getParameter("clave");
//
//	        usuario.setNomBre_Usuario(nombre.trim());
//	        usuario.setDeCorre_Usuario(correo.trim());
//	        usuario.setCaContra_Usuario(clave.trim());
//
//	        int result = usuarioService.crearUsuario(usuario);
//
//	        if (result>0){
//	            System.out.printf("Usuario Creado Exitosamente (%d) - %s%n",result,usuario);
//	        } else {
//	            System.out.printf("Error al Crear Usuario - %s%n",usuario);
//	        }
//
//	        return "redirect:/listarUsuarios";
//	    }		
//	
//	@GetMapping(value = "/listarUsuarios")
//	public ModelAndView listarUsuarios(){
//
//        List<UserBean> listaUsuarios = usuarioService.listarUsuarios();
//
//        for (UserBean bean: listaUsuarios){
//            System.out.println(bean);
//        }
//        
//        return new ModelAndView("listaUsuarios","listaUsuarios",listaUsuarios);
//    }	
//	
	@GetMapping(value = "/ingresarUsuario")
	public String ingresarUsuario(){
       
        return "ingresaUsuario";
    }	
//	
//	@PostMapping(value = "/crearUsuario")
//    public String crearUsuario(HttpServletRequest request) throws ParseException {
//
//        UserBean usuario = new UserBean();
//
//        String nombre = request.getParameter("nombre");
//        String correo = request.getParameter("correo");
//        String clave = request.getParameter("clave");
//
//        usuario.setNomBre_Usuario(nombre.trim());
//        usuario.setDeCorre_Usuario(correo.trim());
//        usuario.setCaContra_Usuario(clave.trim());
//
//        int result = usuarioService.crearUsuario(usuario);
//
//        if (result>0){
//            System.out.printf("Usuario Creado Exitosamente (%d) - %s%n",result,usuario);
//        } else {
//            System.out.printf("Error al Crear Usuario - %s%n",usuario);
//        }
//
//        return "redirect:/listarUsuarios";
//    }	
////
//	@GetMapping(value = "/mostrarUsuario")
//    public ModelAndView mostrarUsuario(@RequestParam("username") int id) {
//
//	     UserBean usuarioBean = usuarioService.obtenerUsuario(id);
//
//        return new ModelAndView("muestraUsuario","usuario",usuarioBean);
//    }	
	
//	@PostMapping(value = "/modificarUsuario")
//    public String modificarUsuario(HttpServletRequest request) throws ParseException {
//
//		UserBean usuario = new UserBean();
//
//        String id = request.getParameter("id");        
//        String nombre = request.getParameter("nombre");
//        String correo = request.getParameter("correo");
//        String clave = request.getParameter("clave");
//
//        usuario.setId_Usuario(Integer.parseInt(id.trim()));
//        usuario.setNomBre_Usuario(nombre.trim());
//        usuario.setDeCorre_Usuario(correo.trim());
//        usuario.setCaContra_Usuario(clave.trim());
//
//        int result = usuarioService.modificarUsuario(usuario);
//
//        if (result>0){
//            System.out.printf("Usuario Modificado Exitosamente (%d) - %s%n",result,usuario);
//        } else {
//            System.out.printf("Error al Modificar Usuario - %s%n",usuario);
//        }
//
//
//        return "redirect:/listarUsuarios";
//    }

}
