package com.example.transferencia.service;

import com.example.transferencia.repo.modelo.Ciudadano;

public interface ICiudadanoService {

	public void ingresar(Ciudadano ciudadano);

	public Ciudadano buscar(Integer id);

	public void actualizar(Ciudadano ciudadano);

	public void borrar(Integer id);

}
