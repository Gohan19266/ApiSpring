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

import pe.edu.upeu.academico.entity.Venta;
import pe.edu.upeu.academico.services.VentaService;

@RestController
@RequestMapping("/api")
public class VentaRestController {
	@Autowired
	private VentaService ventaService;
	
	@GetMapping("/venta")
	public List<Venta> readAll(){
		return ventaService.findAll();
	}
	
	@GetMapping("venta/{id}")
	public Venta findById(@PathVariable(name = "id") Long id) {
		return ventaService.findById(id);
	}
	
	@PostMapping("/venta")
	public Venta Add(@RequestBody Venta venta) {
		return ventaService.save(venta);
	}
	
	@PutMapping("/venta/{idventa}")
	public void update(@RequestBody Venta venta, @PathVariable(value = "idventa") long idventa) {
		ventaService.Update(venta, idventa);
	}
	
	@DeleteMapping("/venta/{idventa}")
	public void delete(@PathVariable(name = "idventa") Long idventa) {
		ventaService.delete(idventa);
	}
}
