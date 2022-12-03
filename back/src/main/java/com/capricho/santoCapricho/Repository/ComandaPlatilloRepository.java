package com.capricho.santoCapricho.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capricho.santoCapricho.Model.ComandaPlatillo;

@Repository
public interface ComandaPlatilloRepository extends JpaRepository<ComandaPlatillo, Long>{

}
