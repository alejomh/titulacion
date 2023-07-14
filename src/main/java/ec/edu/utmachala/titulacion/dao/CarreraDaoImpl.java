package ec.edu.utmachala.titulacion.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import ec.edu.utmachala.titulacion.entity.Carrera;

@Repository
public class CarreraDaoImpl extends GenericDaoImpl<Carrera, Integer> implements CarreraDao, Serializable {
	private static final long serialVersionUID = 1L;
}