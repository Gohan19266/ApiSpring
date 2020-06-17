package pe.edu.upeu.academico.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.academico.entity.Alumno;
@Repository
public interface AlumnoDao extends CrudRepository<Alumno, Long>{

}
