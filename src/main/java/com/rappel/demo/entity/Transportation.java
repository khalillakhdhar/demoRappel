package com.rappel.demo.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Min;

@MappedSuperclass
public abstract class Transportation extends Vehicule {
	@Min(value = 1)
	private int loadCapacity;

}
