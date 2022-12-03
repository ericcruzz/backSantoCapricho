package com.capricho.santoCapricho.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.capricho.santoCapricho.Model.*;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	
}
