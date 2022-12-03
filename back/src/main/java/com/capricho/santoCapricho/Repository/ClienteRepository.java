package com.capricho.santoCapricho.Repository;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capricho.santoCapricho.Model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long>{
	Optional<Cliente>findByEmail(String email);
	
}
