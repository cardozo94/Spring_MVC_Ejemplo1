package co.camcar.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@RequestMapping("/formulario")
	public String muestraFormulario(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		return "AlumnoRegistroFormulario";
	}

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("alumno") Alumno alumno, BindingResult resultadoValidacion) {
		if (resultadoValidacion.hasErrors()) {
			return "AlumnoRegistroFormulario";
		} else {
			return "ConfirmacionRegistroAlumno";
		}
	}
	
	@InitBinder
	public void myBinder(WebDataBinder binder) {
		StringTrimmerEditor timmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, timmer);
		
	}
}
