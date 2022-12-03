package com.capricho.santoCapricho.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.capricho.santoCapricho.Model.*;
import com.capricho.santoCapricho.Service.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("comanda")
public class ComandaController {
	Date fecha = new Date();
	@Autowired
	ComandaService comandaSer;
	//Get todos los clientes
	
	@GetMapping("/buscar")
	public ArrayList<Comanda> getClients() {
		return comandaSer.findAll();
	}
	//Get clientes por id
	@GetMapping(path = "/buscar/{id}")
	public Optional<Comanda> findById(@Validated @PathVariable("id") Long id) {
		return this.comandaSer.findById(id);

	}
	//post cliente
	@PostMapping("/insertar")
	public Comanda save(@Validated @RequestBody Comanda client) {
		return this.comandaSer.save(client);
	}
	
	// Update/Edit Clients
			@PutMapping("/editar/{id}")
			public ResponseEntity<?> edit(@Validated @RequestBody Comanda clientDetails,
					@PathVariable(value = "id") Long id) {
				Optional<Comanda> comanda = comandaSer.findById(id);
				if (!comanda.isPresent()) {
					return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Client with id: " + id + " does not exist");
				}
				comanda.get().setTipoServicio(clientDetails.getTipoServicio());
				comanda.get().setNoMesa(clientDetails.getNoMesa());
				comanda.get().setFecha(LocalDate.now());
				return ResponseEntity.status(HttpStatus.CREATED).body(comandaSer.save(comanda.get()));

			}
	
	// Delete Cliente
		@DeleteMapping("/borrar/{id}")
		public ResponseEntity<Object> Delete(@PathVariable Long id) {
			return new ResponseEntity<>(comandaSer.Delete(id), HttpStatus.OK);
		}
	
}
