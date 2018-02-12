package com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="INSTRUMENT_PRICE_MODIFIER")
public class InstrumentPriceModifier {
	@Id
	private int id;
	private String name;
	private double multiplier;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}
	
	public String toString() {
		return "id: "+id+", name: "+name+",multiplier: "+multiplier;
	}

}
