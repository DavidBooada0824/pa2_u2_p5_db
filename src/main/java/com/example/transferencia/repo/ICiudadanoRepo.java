package com.example.transferencia.repo;

import com.example.transferencia.repo.modelo.Ciudadano;

public interface ICiudadanoRepo {
	
	public void crear(Ciudadano ciudadano);
	
	public Ciudadano seleccionar(Integer id);
	
	public void modificar(Ciudadano ciudadano);
	
	public void eliminar(Integer id);
	
	

}
