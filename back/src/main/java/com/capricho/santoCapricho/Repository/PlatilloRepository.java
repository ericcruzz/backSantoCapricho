package com.capricho.santoCapricho.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capricho.santoCapricho.Model.Platillo;

@Repository
public interface PlatilloRepository extends JpaRepository<Platillo, Long>{

}
