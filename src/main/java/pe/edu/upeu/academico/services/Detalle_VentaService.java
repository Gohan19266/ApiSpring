package pe.edu.upeu.academico.services;

import java.util.List;

import pe.edu.upeu.academico.entity.Detalle_venta;

public interface Detalle_VentaService {
	public List<Detalle_venta> findAll();
	public Detalle_venta findById(Long id);
	public Detalle_venta save(Detalle_venta detalle_venta);
	public void Update(Detalle_venta Detalle_venta,long id);
	public void delete(Long id);
}
