package com.uam.springboot.app.Controllers;


import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uam.springboot.app.Repositories.AlumnoRepository;
import com.uam.springboot.app.DAO.AlumnoDAO;
import com.uam.springboot.app.Entidad.Alumno;

@RestController
public class AlumnoController {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private AlumnoDAO alumnoDao;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	/**
	 * Metodo para agregar alumnos a la BD
	 * */
	@PostMapping("/alumnos")
	public void agregarAlumno(@RequestBody final List<Alumno> alumno){
		alumnoDao.saveAll(alumno);
	}
	
	
	/**
	 * Metodo para consultar todos los alumnos en la BD
	 * */
	@GetMapping("/alumnos")
	public List<Alumno> mostrarProductos(){
		return alumnoDao.findAll();	
	}
	
	@GetMapping("/alumnosTemplate")
	public List<Alumno> Alumnos(){
		return mongoTemplate.findAll(Alumno.class);
	}
	
	/**
	 * Metodo para consultar un alumno por ID en la DB
	 * */
	@GetMapping("/alumnos/{alumnoId}")
	public Alumno findAlumno(@PathVariable final String alumnoId) {
		return alumnoDao.findById(alumnoId);
	}
	
	/**
	 * Metodo para actulizar un registro en la BD de manera
	 * basado en su ID y es parcialmente
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * */
	@PatchMapping("/alumnos/{alumnoId}")
	public void UpdateAlumno(@PathVariable final String alumnoId,
			@RequestBody final Alumno alumno) throws Exception {
		for(final Field campo : Alumno.class.getDeclaredFields()) {
			final String fieldname = campo.getName();
			
			if(fieldname.equals("id")) {
				continue;
			}
			
			final java.lang.reflect.Method getter = Alumno.class.getDeclaredMethod( "get"+StringUtils.capitalize(fieldname));
			final  Object valorCampo = getter.invoke(alumno);
			
			if(Objects.nonNull(valorCampo)) {
				
				alumnoRepository.UpdateAlumno(alumnoId, fieldname, valorCampo);
			}
		}
	}
	
	@GetMapping("/alumnos/lista/{plan}/{sexo}/{trimestre}")
	public List<Alumno> clasificacionEdadSexoCarrera(@PathVariable final String plan,
			@PathVariable final String sexo,@PathVariable final String trimestre){
		System.out.println(alumnoRepository.clasificacionSexo(plan,sexo,trimestre));
				return alumnoRepository.clasificacionSexo(plan,sexo,trimestre);
	}
	
	@GetMapping(path = "/alumnos/lista/{plan}")
	public List<Alumno> clasificacionEdadSexoCarrera2(@PathVariable final String plan,
			@RequestBody final String sexo,@RequestBody final String trimestre ){
		System.out.println(alumnoRepository.clasificacionSexo(plan,sexo,trimestre));
				return alumnoRepository.clasificacionSexo(plan,sexo,trimestre);
	}
	
	@GetMapping("/alumnos/carrera-nombre/{carrera}")
	public List<Alumno> findByCarrera(@PathVariable final String carrera){
		return null;
	}
	
	@GetMapping("/alumnos/lista/sexo-edad-lic/{plan}/{trimestre}")
	public List<Alumno> listaSexoEdadLic(@PathVariable String plan, @PathVariable String trimestre){
		return alumnoRepository.consultaPorCarreraTrimestre(plan, trimestre);
	}
	
	
	/*@GetMapping("/alumnos/lista/{NOM}")
	public List<Alumno> findByNombre(@PathVariable final String nombre) {
		return alumnoRepository.findByNombre(nombre);
	}*/
	
	/*@GetMapping("/alumnos/carrera-nombre/{carrera}")
	public List<Alumno> findByCarrera(@PathVariable final String carrera){
		return alumnoRepository.findByCarrera(carrera);
	}*/
	
	/*@GetMapping("/alumnos/carrera-nombre2/{carrera}")
	public List<Alumno>findByCarrera2(@PathVariable final String carrera){
		return alumnoRepository.findByCarrera2(carrera);
	}*/
	
	/*@PatchMapping("/alumnos/")
	public void UpdateAlumnos(@PathVariable final String alumnoId,
			@RequestBody final Alumno alumno) throws Exception {
		for(final Field campo : Alumno.class.getDeclaredFields()) {
			final String fieldname = campo.getName();
			
			if(fieldname.equals("id")) {
				continue;
			}
			
			final java.lang.reflect.Method getter = Alumno.class.getDeclaredMethod( "get"+StringUtils.capitalize(fieldname));
			final  Object valorCampo = getter.invoke(alumno);
			
			if(Objects.nonNull(valorCampo)) {
				
				alumnoRepository.UpdateAlumno(alumnoId, fieldname, valorCampo);
			}
		}
	}*/
	
	
}
