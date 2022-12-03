package com.capricho.santoCapricho.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capricho.santoCapricho.Model.Comanda;

@Repository
public interface ComandaRepository extends JpaRepository<Comanda, Long>{
	
}
