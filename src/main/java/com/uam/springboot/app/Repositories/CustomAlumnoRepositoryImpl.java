package com.uam.springboot.app.Repositories;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.BasicUpdate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.uam.springboot.app.Entidad.Alumno;

public class CustomAlumnoRepositoryImpl implements CustomAlumnoRepository{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void UpdateAlumno(String alumnoId, String fieldname, Object fieldValue) {
		mongoTemplate.findAndModify(BasicQuery.query(Criteria.where("id").is(alumnoId)),
				BasicUpdate.update(fieldname, fieldValue),
				FindAndModifyOptions.none(),Alumno.class);
		
	}
	
	
	@Override
	public List<Alumno> findByCarrera2(String carrera) {
		Query query = new Query();
		query.addCriteria(Criteria.where("carrera").is(carrera));
		query.fields().include("nombre","carrera","matricula","apellidoP","apellidoM");
		List<Alumno> alumonosCoincidentes = mongoTemplate.find(query,Alumno.class);
		return alumonosCoincidentes;
	}


	@Override
	public List<Alumno> clasificacionSexo(String plan,String sexo,String trimestre) {
		Query query = new Query();
		//query.addCriteria(Criteria.where("PLA").is(plan).and("SEXO").is(sexo));
		//query = BasicQuery.query(Criteria.where("PLA").is(plan).and("SEXO").is(sexo));
		query.addCriteria(new Criteria().andOperator(
				Criteria.where("PLA").is(plan),
				Criteria.where("SEXO").is(sexo),
				Criteria.where("UT_RE").is(trimestre)
				));
		//Query query = new BasicQuery("{$and: [{'SEXO': 'M'},{'PLA':'52'}]}");
		query.fields().include("NOM","MAT","EDAD");
		List<Alumno> alumonosCoincidentes = mongoTemplate.find(query,Alumno.class);
		for (Alumno alumno : alumonosCoincidentes) {
			System.out.println(alumno.getMAT() + " " + alumno.getEDAD()+ " " +alumno.getNOM());
		}
		System.out.println("Tamaño de la consulta: " + alumonosCoincidentes.size());
		return alumonosCoincidentes;
	}


	@Override
	public List<Alumno> consultaPorCarreraTrimestre(String plan, String trimestre) {
		Query query = new Query();
		query.addCriteria(new Criteria().andOperator(
				Criteria.where("PLA").is(plan),
				Criteria.where("UT_RE").is(trimestre)));
		query.fields().include("MAT","PLA","EDAD","PATE","MATE","NOM");
		//query.fields().elemMatch(plan,  Criteria.where("online").is(true));
		List<Alumno> alumonosConsulta = mongoTemplate.find(query,Alumno.class);
		return alumonosConsulta;
	}
}
