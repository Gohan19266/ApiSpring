package pe.edu.upeu.academico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.academico.entity.Detalle_venta;
import pe.edu.upeu.academico.services.Detalle_VentaService;

@RestController
@RequestMapping("/api")
public class Detalle_VentaRestController {
	@Autowired
	private Detalle_VentaService dvs;
	
	@GetMapping("/detalle")
	public List<Detalle_venta> readAll(){
		return dvs.findAll();
	}
	
	@GetMapping("detalle/{id}")
	public Detalle_venta findById(@PathVariable(name = "id") Long id) {
		return dvs.findById(id);
	}
	
	@PostMapping("/detalle")
	public Detalle_venta Add(@RequestBody Detalle_venta dv) {
		return dvs.save(dv);
	}
	
	@PutMapping("/detalle/{iddetalle_venta}")
	public void update(@RequestBody Detalle_venta dv, @PathVariable(value = "iddetalle_venta") long iddetalle_venta) {
		dvs.Update(dv, iddetalle_venta);
	}
	
	@DeleteMapping("/detalle/{iddetalle_venta}")
	public void delete(@PathVariable(name = "iddetalle_venta") Long iddetalle_venta) {
		dvs.delete(iddetalle_venta);
	}
}
