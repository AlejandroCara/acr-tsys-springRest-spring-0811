package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleado;
import com.example.demo.services.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired(required=true)
	EmpleadoService empleadoService;
	
	@GetMapping("/all")
	public List<Empleado> getAll(){
		return empleadoService.listAll();
	}
	
	@GetMapping("/get/{id}")
	public Empleado getOne(@PathVariable(name="id") int id){
		return empleadoService.listOne(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Empleado empleado){
		if(empleado.getTrabajo().equals("Programador")) {
			empleado.setSueldo(1500);
			empleadoService.save(empleado);
		} else if(empleado.getTrabajo().equals("Recruiter")) {
			empleado.setSueldo(1800);
			empleadoService.save(empleado);
		} else if(empleado.getTrabajo().equals("CEO")) {
			empleado.setSueldo(3000);
			empleadoService.save(empleado);
		}
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Empleado empleado){
		if(empleado.getTrabajo().equals("Programador")) {
			empleado.setSueldo(1500);
			empleadoService.updateOne(empleado);
		} else if(empleado.getTrabajo().equals("Recruiter")) {
			empleado.setSueldo(1800);
			empleadoService.updateOne(empleado);
		} else if(empleado.getTrabajo().equals("CEO")) {
			empleado.setSueldo(3000);
			empleadoService.updateOne(empleado);
		}
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody int id){
		empleadoService.deleteOne(id);
	}
}
