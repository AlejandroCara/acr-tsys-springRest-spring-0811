package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoService implements IEmpleadoService{

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listAll() {
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado listOne(int id) {
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public void save(Empleado empleado) {
		iEmpleadoDAO.save(empleado);
	}

	@Override
	public void updateOne(Empleado empleado) {
		iEmpleadoDAO.save(empleado);
		
	}

	@Override
	public void deleteOne(int id) {
		iEmpleadoDAO.deleteById(id);
	}

}
