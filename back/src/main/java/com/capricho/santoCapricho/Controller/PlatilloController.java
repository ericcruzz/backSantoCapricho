package com.capricho.santoCapricho.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capricho.santoCapricho.Model.*;
import com.capricho.santoCapricho.Service.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("platillo")
public class PlatilloController {
	@Autowired
	PlatilloService comandaSer;
	//Get todos los clientes
	
	@GetMapping("/buscar")
	public ArrayList<Platillo> getClients() {
		return comandaSer.findAll();
	}
	//Get clientes por id
	@GetMapping(path = "/buscar/{id}")
	public Optional<Platillo> findById(@Validated @PathVariable("id") Long id) {
		return this.comandaSer.findById(id);

	}
	//post cliente
	@PostMapping("/insertar")
	public Platillo save(@Validated @RequestBody Platillo client) {
		return this.comandaSer.save(client);
	}
	
	
	// Delete Cliente
		@DeleteMapping("/borrar/{id}")
		public ResponseEntity<Object> Delete(@PathVariable Long id) {
			return new ResponseEntity<>(comandaSer.Delete(id), HttpStatus.OK);
		}
	
}
