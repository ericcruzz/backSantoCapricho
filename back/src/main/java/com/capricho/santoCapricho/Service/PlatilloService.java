package com.capricho.santoCapricho.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capricho.santoCapricho.Model.*;
import com.capricho.santoCapricho.Repository.*;

@Service
public class PlatilloService {
	@Autowired
	PlatilloRepository comandaRep;
	
	public ArrayList<Platillo> findAll(){
		return (ArrayList<Platillo>) comandaRep.findAll();
	}
	
	public Platillo save(Platillo comanda) {
		return comandaRep.save(comanda);
	}
	
	public Optional <Platillo> findById(Long id){
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