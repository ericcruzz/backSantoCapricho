package com.capricho.santoCapricho.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capricho.santoCapricho.Model.*;
import com.capricho.santoCapricho.Repository.*;

@Service
public class TicketService {
	@Autowired
	TicketRepository comandaRep;
	
	public ArrayList<Ticket> findAll(){
		return (ArrayList<Ticket>) comandaRep.findAll();
	}
	
	public Ticket save(Ticket comanda) {
		return comandaRep.save(comanda);
	}
	
	public Optional <Ticket> findById(Long id){
		return comandaRep.findById(id);
	}
	
	public String Delete(Long id){
		boolean b = comandaRep.existsById(id);
		if(!b) {
			return "Id " + id + "incorrecto o inexistente" + b;
		}
		comandaRep.deleteById(id);
		return "Registro borrado correctamente";
	}
}