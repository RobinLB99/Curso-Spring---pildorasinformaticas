package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@RequestMapping("/formulario_registro")
	public String muestraFomulario(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("nuevoAlumno", alumno);
		return "registrarAlumno";
	}
	
	@RequestMapping("/registrar_alumno")
	public String registrarAlumno(@ModelAttribute("nuevoAlumno") Alumno nuevoAlumno) {
		return "confirmacionRegistroAlumno";
	}
	
}
