package pe.edu.upeu.Examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.Examen.entity.Alumno;
import pe.edu.upeu.Examen.services.AlumnoService;

@RestController
@RequestMapping("/api")
public class AlumnoRestController {
	@Autowired
	private AlumnoService alumnUserService;
	@GetMapping("/alumnos")
	public List<Alumno> readAll(){
		return alumnUserService.findAll();
	}
}
