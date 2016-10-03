package com.example.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {
	
	@GeneratedValue
	@Id
	private Long Id;
	
	private String reservationName;
	
	

	public Reservation() {
	}



	public Reservation(String reservationName) {
		this.reservationName = reservationName;
	}
	
	public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	public String getReservationName() {
		return reservationName;
	}



	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}



	@Override
	public String toString() {
		return "Reservation [Id=" + Id + ", reservationName=" + reservationName + "]";
	}
	
	
	

}
