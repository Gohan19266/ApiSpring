package pe.edu.upeu.academico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.academico.entity.Alumno;
import pe.edu.upeu.academico.services.AlumnoService;

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
