package pe.edu.upeu.Examen.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Examen.entity.Alumno;
@Repository
public interface AlumnoDao extends CrudRepository<Alumno, Long>{

}
