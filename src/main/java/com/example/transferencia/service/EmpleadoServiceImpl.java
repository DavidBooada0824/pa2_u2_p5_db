package com.example.transferencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.transferencia.repo.IEmpleadoRepo;
import com.example.transferencia.repo.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	private IEmpleadoRepo iEmpleadoRepo;

	@Override
	public void ingresar(Empleado empleado) {
		this.iEmpleadoRepo.crear(empleado);
		
	}

	@Override
	public Empleado buscar(Integer id) {
		
		return this.iEmpleadoRepo.seleccionar(id);
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.iEmpleadoRepo.modificar(empleado);
		
	}

	@Override
	public void borrar(Integer id) {
		this.iEmpleadoRepo.eliminar(id);
	}

}
