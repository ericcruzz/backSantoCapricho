package com.capricho.santoCapricho.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capricho.santoCapricho.Model.Cliente;
import com.capricho.santoCapricho.Repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository clienteRep;
	
	public ArrayList<Cliente>findAll(){
		return (ArrayList<Cliente>) clienteRep.findAll();
	}
	
	public Cliente save(Cliente clientes) {
		return clienteRep.save(clientes);
		
	}
	
	public Optional <Cliente> findById(Long id){
		return clienteRep.findById(id);
	}
	
	public Optional <Cliente> findByEmail(String email){
		
		return clienteRep.findByEmail(email);
	}
	
	public String Delete(Long id){
		boolean b = clienteRep.existsById(id);
		if(!b) {
			return "Id " + id + "incorrecto o inexistente" + b;
		}
		clienteRep.deleteById(id);
		return "Registro borrado correctamente";
	}
	
}
