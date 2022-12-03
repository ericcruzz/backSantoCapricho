package com.capricho.santoCapricho.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.capricho.santoCapricho.Model.Cliente;
import com.capricho.santoCapricho.Service.ClienteService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("cliente")
public class ClienteController {
	@Autowired
	ClienteService clienteSer;
	//Get todos los clientes
	
	@GetMapping("/buscar")
	public ArrayList<Cliente> getClients() {
		return clienteSer.findAll();
	}
	//Get clientes por id
	@GetMapping(path = "/buscar/{id}")
	public Optional<Cliente> findById(@Validated @PathVariable("id") Long id) {
		return this.clienteSer.findById(id);

	}
	//post cliente
	@PostMapping("/insertar")
	public Cliente save(@Validated @RequestBody Cliente client) {
		return this.clienteSer.save(client);
	}
	
	// Update/Edit Clients
		@PutMapping("/editar/{id}")
		public ResponseEntity<?> edit(@Validated @RequestBody Cliente clientDetails,
				@PathVariable(value = "id") Long id) {
			Optional<Cliente> client = clienteSer.findById(id);
			if (!client.isPresent()) {
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Client with id: " + id + " does not exist");
			}
			client.get().setCelular(clientDetails.getCelular());
			client.get().setDirección(clientDetails.getDirección());
			client.get().setEmail(clientDetails.getEmail());
			return ResponseEntity.status(HttpStatus.CREATED).body(clienteSer.save(client.get()));

		}
	// Delete Cliente
		@DeleteMapping("/borrar/{id}")
		public ResponseEntity<Object> Delete(@PathVariable Long id) {
			return new ResponseEntity<>(clienteSer.Delete(id), HttpStatus.OK);
		}
	
}
