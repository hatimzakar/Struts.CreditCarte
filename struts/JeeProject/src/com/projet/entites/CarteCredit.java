package com.projet.entites;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;


@Entity
public class CarteCredit {
	
	@Id
	 String numCarte;
	 @OneToOne( cascade = CascadeType.ALL )  
	 @JoinColumn( name="idProprietaire" )
	private Proprietaire p;
	 
	 
	public CarteCredit() {
		super();
		
	}
	public CarteCredit( String numCarte, Proprietaire p) {
		super();
		
		this.numCarte = numCarte;
		this.p = p;
	}
	
	public String getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}
	public Proprietaire getP() {
		return p;
	}
	public void setP(Proprietaire p) {
		this.p = p;
	}
	
	
	@Override
	public String toString() {
		return "CarteCredit [numCarte=" + numCarte + ", p=" + p + "]";
	}
	
	
	
	
	 
	 
	 
	

}
