package co.camcar.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/principal")
public class HolaAlumnosControlador {

	//proporciona el formulario
	@RequestMapping("/saludo")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
	
	@RequestMapping("/procesarFormulario2")
	//public String procesarFormularioOk(HttpServletRequest request, Model modelo) {
	public String procesarFormularioOk(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		//String nombre = request.getParameter("nombreAlumno");
		nombre += " es el mejor alumno";
		String mensajeFinal = "¿Quién es el mejor alumno? "+nombre;
		//agregando info al modelo
		modelo.addAttribute("mensajeFinal", mensajeFinal);
		return "HolaAlumnosSpring";
	}
	
}