package com.example.transferencia;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.transferencia.repo.modelo.Ciudadano;
import com.example.transferencia.repo.modelo.Empleado;
import com.example.transferencia.service.ICiudadanoService;
import com.example.transferencia.service.IEmpleadoService;

@SpringBootApplication
public class Pa2U2P5DbApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService iCiudadanoService;
	@Autowired
	private IEmpleadoService iEmpleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Ciudadano ciu = new Ciudadano();
		ciu.setApellido("Boada");
		ciu.setNombre("David");
	this.iCiudadanoService.ingresar(ciu);
		Empleado emple = new Empleado();
		emple.setFechaIngreso(LocalDateTime.now());
		emple.setSalario(new BigDecimal(1200));
		emple.setCiudadano(ciu);
	this.iEmpleadoService.ingresar(emple);

	
	}

}
