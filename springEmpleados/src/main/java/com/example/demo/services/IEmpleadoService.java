package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	//Listar todos
	public List<Empleado> listAll();
	
	//Listar por id
	public Empleado listOne(int id);
	
	//Guardar
	public void save(Empleado empleado);
	
	//Actualizar por id
	public void updateOne(Empleado empleado);
	
	//Eliminar por id
	public void deleteOne(int id);
}
