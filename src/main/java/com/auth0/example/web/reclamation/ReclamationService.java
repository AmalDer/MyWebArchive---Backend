package com.example.demo.reclamation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReclamationService {
	private Reclamation reclamation;

	@Autowired
	public ReclamationService(Reclamation reclamation) {
		super();
		this.reclamation = reclamation;
	}
	
	//création d'une réclamation
	public Reclamation addReclamation(Reclamation reclamation) {
		reclamation.setDescription("hello");
		return reclamation;
	}
	
	//lister l'ensemble des réclamations
	public List<Reclamation> findAllReclamations(){
		return null;
	}
	
	//avoir l'ensemble des réclamations par id
	public List<Reclamation> getReclamationById(){
		return null;
		
	}
	
	//changer le statut de la réclamation (checked,not checked)
	public void changeStatus(Reclamation reclamation) {
		reclamation.setStatusReclamation(true);
	}
	
	

}
