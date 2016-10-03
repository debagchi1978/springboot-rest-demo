package com.example.rest.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.model.Reservation;
import com.example.rest.repository.ReservationRepository;

@RestController
@RequestMapping(value="/books")
public class ReservationController {
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@RequestMapping (value="/add/{reservationName}")
	public Reservation addReservation(@PathVariable String reservationName){
		Reservation reservation = new Reservation();		
		reservation.setReservationName(reservationName);
		reservationRepo.save(reservation);
		
		return reservation;
		
	}
	
	@RequestMapping (value="/all")
	public Collection<Reservation> getReservations(){
		return reservationRepo.findAll();		
		
	}
	
	@RequestMapping (value="/find/{reservationName}")
	public Collection<Reservation> getReservationByReservationName(@PathVariable String reservationName){
		
		Reservation reservation = new Reservation();		
		reservation.setReservationName(reservationName);
		
		return reservationRepo.findByReservationName(reservationName);
		
	}

}
