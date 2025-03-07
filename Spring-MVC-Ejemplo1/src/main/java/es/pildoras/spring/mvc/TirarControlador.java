package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("in")
public class TirarControlador {

	@RequestMapping("formulario_procesado2")
	//public String otroProcesoFormulario(HttpServletRequest request, Model model) {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model model) {
		//String nombre = request.getParameter("nombreAlumno");
		
		String mensajeFinal = "Quien es el mejor alumno? " + nombre + " es el peor alumno.";
		
		//Agregando info al modelo
		model.addAttribute("mensajeClaro", mensajeFinal);
		
		return "alumnosSpring";
	}
	
}
