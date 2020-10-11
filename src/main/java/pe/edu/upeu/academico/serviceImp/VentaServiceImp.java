package pe.edu.upeu.academico.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.academico.dao.VentaDao;
import pe.edu.upeu.academico.entity.Venta;
import pe.edu.upeu.academico.services.VentaService;

@Service
public class VentaServiceImp implements VentaService{
	@Autowired
	private VentaDao ventaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Venta> findAll() {
		// TODO Auto-generated method stub
		return (List<Venta>) ventaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Venta findById(Long id) {
		// TODO Auto-generated method stub
		return ventaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Venta save(Venta venta) {
		// TODO Auto-generated method stub
		return ventaDao.save(venta);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		ventaDao.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Venta venta, long idventa) {
		// TODO Auto-generated method stub
		ventaDao.findById(idventa).ifPresent((x)->{
			venta.setIdventa(idventa);
			ventaDao.save(venta);
		});
	}
	
}
