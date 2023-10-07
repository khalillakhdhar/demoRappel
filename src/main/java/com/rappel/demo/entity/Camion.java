package com.rappel.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class Camion extends Transportation {
private int noOfContainers;

public int getNoOfContainers() {
	return noOfContainers;
}

public void setNoOfContainers(int noOfContainers) {
	this.noOfContainers = noOfContainers;
}



}
