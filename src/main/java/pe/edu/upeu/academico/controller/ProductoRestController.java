package pe.edu.upeu.academico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.academico.entity.Producto;
import pe.edu.upeu.academico.services.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductoRestController {
	@Autowired
	private ProductoService productoService;
	@GetMapping("/producto")
	public List<Producto> readAll(){
		return productoService.findAll();
	}
	public Producto findById(Long id){
		return productoService.findById(id);
	}
	
}
