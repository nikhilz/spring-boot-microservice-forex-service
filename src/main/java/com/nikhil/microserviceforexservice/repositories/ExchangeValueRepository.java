package com.nikhil.microserviceforexservice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nikhil.microserviceforexservice.models.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	/**
	 * @param from
	 * @param to
	 * @return
	 */
	
	@Query("select e from ExchangeValue e where e.from =:from and e.to =:to ")
	Optional<ExchangeValue>  findByFromAndTo(@Param("from") String from,@Param("to") String to);
}
