package co.camcar.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class TirarControlador {

	@RequestMapping("/procesarFormulario2")
	public String procesarFormularioOk(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		nombre += " es el peor alumno";
		String mensajeFinal = "¿Quién es el peor alumno? "+nombre;
		//agregando info al modelo
		modelo.addAttribute("mensajeFinal", mensajeFinal);
		return "HolaAlumnosSpring";
	}

}
