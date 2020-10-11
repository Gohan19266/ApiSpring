package pe.edu.upeu.academico.services;

import java.util.List;


import pe.edu.upeu.academico.entity.Venta;

public interface VentaService {
	public List<Venta> findAll();
	public Venta findById(Long id);
	public Venta save(Venta venta);
	public void Update(Venta venta,long idventa);
	public void delete(Long id);
}
