package com.uam.springboot.app.Repositories;

import java.util.List;

import com.uam.springboot.app.Entidad.Alumno;

public interface CustomAlumnoRepository {

	public void UpdateAlumno(final String alumnoId, final String fieldname, final Object fieldValue);

	public List<Alumno> findByCarrera2(String nombre);
	
	public List<Alumno> clasificacionSexo(final String plan, final String sexo,final String trimestre);
	
	public List<Alumno> consultaPorCarreraTrimestre(final String plan, final String trimestre);
	
	
}
