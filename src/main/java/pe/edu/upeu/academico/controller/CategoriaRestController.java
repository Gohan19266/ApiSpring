package pe.edu.upeu.academico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.academico.entity.Categoria;
import pe.edu.upeu.academico.services.CategoriaService;

@RestController
@RequestMapping("/exa")
public class CategoriaRestController {
	@Autowired
	private CategoriaService categoriaService;
	@GetMapping("/categorias")
	public List<Categoria> readAll(){
		return categoriaService.findAll();
	}
}
