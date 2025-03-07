package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class AlumnoControlador {

	// Devuelve el formulario
	@RequestMapping("formulario")
	public String mostrarFormulario() {
		return "alumnosFormulario";
	}

	@RequestMapping("formulario_procesado")
	public String procesarFormulario() {
		return "alumnosSpring";
	}

	@RequestMapping("formulario_procesado2")
	//public String otroProcesoFormulario(HttpServletRequest request, Model model) {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model model) {
		//String nombre = request.getParameter("nombreAlumno");
		
		String mensajeFinal = "Quien es el mejor alumno? " + nombre + " es el mejor alumno.";
		
		//Agregando info al modelo
		model.addAttribute("mensajeClaro", mensajeFinal);
		
		return "alumnosSpring";
	}

}
