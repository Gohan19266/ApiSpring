package pe.edu.upeu.academico.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.academico.dao.Detalle_VentaDao;
import pe.edu.upeu.academico.entity.Detalle_venta;
import pe.edu.upeu.academico.services.Detalle_VentaService;

@Service
public class Detalle_VentaImp implements Detalle_VentaService{
	@Autowired
	private Detalle_VentaDao dvd;

	@Override
	@Transactional(readOnly = true)
	public List<Detalle_venta> findAll() {
		// TODO Auto-generated method stub
		return (List<Detalle_venta>) dvd.findAll();
	}

	@Override
	public Detalle_venta findById(Long id) {
		// TODO Auto-generated method stub
		return dvd.findById(id).orElse(null);
	}

	@Override
	public Detalle_venta save(Detalle_venta detalle_venta) {
		// TODO Auto-generated method stub
		return dvd.save(detalle_venta);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dvd.deleteById(id);
	}

	@Override
	public void Update(Detalle_venta detalle_venta, long id) {
		// TODO Auto-generated method stub
		dvd.findById(id).ifPresent((x)->{
			detalle_venta.setIddetalle_venta(id);
			dvd.save(detalle_venta);
		});
	}
	
	
}
