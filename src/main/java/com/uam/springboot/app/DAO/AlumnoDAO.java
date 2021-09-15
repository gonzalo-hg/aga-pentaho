package com.uam.springboot.app.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.uam.springboot.app.Entidad.Alumno;

@Repository
public class AlumnoDAO {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void saveAll(final List<Alumno> alumnos) {
		mongoTemplate.insertAll(alumnos);
	}
	
	public List<Alumno> findAll(){
		return mongoTemplate.findAll(Alumno.class);
	}
	
	public Alumno findById(@PathVariable final String alumnoId) {
		return mongoTemplate.findById(alumnoId,Alumno.class);
	}
	
	
	/*public Alumno updateAlumno(String alumnoId,String fieldname, Object fieldValue) {
		return mongoTemplate.findAndModify(BasicQuery.query(Criteria.where(alumnoId)), 
				BasicUpdate.update(fieldname,fieldValue), 
				FindAndModifyOptions.none(),Alumno.class);
	}*/
}
