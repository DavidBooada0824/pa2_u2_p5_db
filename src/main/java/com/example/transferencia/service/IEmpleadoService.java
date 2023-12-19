package com.example.transferencia.service;

import com.example.transferencia.repo.modelo.Empleado;

public interface IEmpleadoService {

	public void ingresar(Empleado empleado);

	public Empleado buscar(Integer id);

	public void actualizar(Empleado empleado);

	public void borrar(Integer id);

}
