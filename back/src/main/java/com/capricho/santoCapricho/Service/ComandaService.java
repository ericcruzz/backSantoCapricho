package com.capricho.santoCapricho.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.capricho.santoCapricho.Model.Comanda;
import com.capricho.santoCapricho.Repository.ComandaRepository;

@Service
public class ComandaService {
	@Autowired
	ComandaRepository comandaRep;
	
	public ArrayList<Comanda> findAll(){
		return (ArrayList<Comanda>) comandaRep.findAll();
	}
	
	public Comanda save(Comanda comanda) {
		return comandaRep.save(comanda);
	}
	
	public Optional <Comanda> findById(Long id){
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
