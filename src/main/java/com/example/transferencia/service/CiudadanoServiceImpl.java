package com.example.transferencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.transferencia.repo.ICiudadanoRepo;
import com.example.transferencia.repo.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {

	@Autowired
	private ICiudadanoRepo iCiudadanoRepo;

	@Override
	public void ingresar(Ciudadano ciudadano) {
		this.iCiudadanoRepo.crear(ciudadano);

	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.seleccionar(id);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.iCiudadanoRepo.modificar(ciudadano);
	}

	@Override
	public void borrar(Integer id) {
		this.iCiudadanoRepo.eliminar(id);

	}

}
