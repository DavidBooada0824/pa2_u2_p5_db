package com.example.transferencia.repo;

import com.example.transferencia.repo.modelo.Empleado;

public interface IEmpleadoRepo {

	public void crear(Empleado empleado);

	public Empleado seleccionar(Integer id);

	public void modificar(Empleado empleado);

	public void eliminar(Integer id);

}
