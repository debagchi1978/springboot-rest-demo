package com.example.rest.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.model.Reservation;
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	Collection <Reservation> findByReservationName (String resName);

}
