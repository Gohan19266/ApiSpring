package pe.edu.upeu.academico.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.academico.dao.ProductoDao;
import pe.edu.upeu.academico.entity.Alumno;
import pe.edu.upeu.academico.entity.Producto;
import pe.edu.upeu.academico.services.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService{
	@Autowired
	private ProductoDao prodao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) prodao.findAll();
	}
	
}
