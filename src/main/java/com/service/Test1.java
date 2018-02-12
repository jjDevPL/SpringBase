package com.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.entities.InstrumentPriceModifier;
import com.repository.InstrumentRepository;
@Controller
@Component
public class Test1 {

	/**
	 * @param args
	 */
	@Autowired
	private InstrumentRepository inRepository;
	public void main() {
		
		ArrayList <InstrumentPriceModifier> iter = (ArrayList<InstrumentPriceModifier>) inRepository.findAll();
		if (iter!=null) {
			System.out.println(iter.get(0));
			
		}

	}
	public InstrumentRepository getInRepository() {
		return inRepository;
	}
	public void setInRepository(InstrumentRepository inRepository) {
		this.inRepository = inRepository;
	}
	

}
