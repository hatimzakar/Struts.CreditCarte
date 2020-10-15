package com.projet.entites;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	
	
	
	 @OneToOne(cascade=CascadeType.MERGE)
	 @JoinColumn( name="numFacture" )
	private Facture Facture;
	 
	 @ManyToOne
	  @JoinColumn(name="numCarte")
	private CarteCredit Carte;
	private Date datePaiement;
	private double montant;
	
	
	
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Transaction( Facture Facture, CarteCredit Carte, Date datePaiemnet, double montant) {
		super();
		
		this.Facture = Facture;
		this.Carte = Carte;
		this.datePaiement = datePaiemnet;
		this.montant = montant;
	}

		public int getId() {
			return id;
		}

		

		public Facture getFacture() {
			return 
					Facture;
		}

		public void setFacture(Facture Facture) {
			this.Facture = Facture;
		}

		public CarteCredit getCarte() {
			return Carte;
		}

		public void setCarte(CarteCredit Carte) {
			this.Carte = Carte;
		}

		public Date getDatePaiemnet() {
			return datePaiement;
		}

		public void setDatePaiement(Date datePaiement) {
			this.datePaiement = datePaiement;
		}

		public double getMontant() {
			return montant;
		}

		public void setMontant(double montant) {
			this.montant = montant;
		}

		@Override
		public String toString() {
			return "Transaction [id=" + id + ", Factre=" + Facture + ", Carte=" + Carte + ", datePaiement="
					+ datePaiement + ", montant=" + montant + "]";
		}
	
		
	
	
	
	
	
}
