package com.rappel.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class Train extends Transportation {
private int noOfWagons;

public int getNoOfWagons() {
	return noOfWagons;
}

public void setNoOfWagons(int noOfWagons) {
	this.noOfWagons = noOfWagons;
}



}
