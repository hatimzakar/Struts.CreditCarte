package com.projet.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Facture {
	
	@Id
	
	private String numFacture;
	private Double montant;
	private Date dateFacture;
	
	/*
	 * @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn( name="numFacture" ) private Transaction transation;
	 */
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture(String numFacture, Double montant, Date dateFacture) {
		super();
		this.numFacture = numFacture;
		this.montant = montant;
		this.dateFacture = dateFacture;
	}
	public String getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	@Override
	public String toString() {
		return "Facture [numFacture=" + numFacture + ", montant=" + montant + ", dateFacture=" + dateFacture + "]";
	}
	
	
	
	

}
