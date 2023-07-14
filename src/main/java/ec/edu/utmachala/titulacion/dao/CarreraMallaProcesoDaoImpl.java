package ec.edu.utmachala.titulacion.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import ec.edu.utmachala.titulacion.entity.CarreraMallaProceso;

@Repository
public class CarreraMallaProcesoDaoImpl extends GenericDaoImpl<CarreraMallaProceso, Integer>
		implements CarreraMallaProcesoDao, Serializable {
	private static final long serialVersionUID = 1L;
}