package pe.edu.upeu.Examen.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.Examen.dao.AlumnoDao;
import pe.edu.upeu.Examen.entity.Alumno;
import pe.edu.upeu.Examen.services.AlumnoService;

@Service
public class AlumnoServiceImp implements AlumnoService {
	@Autowired
	private AlumnoDao alumnoDao;
	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return (List<Alumno>) alumnoDao.findAll();
	}

}
