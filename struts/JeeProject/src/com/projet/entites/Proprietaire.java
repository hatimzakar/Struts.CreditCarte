package com.projet.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.transaction.Transactional;


@Entity
public class Proprietaire {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	int id ;
	String nom ;
	String prenom;
	
	
	
	public Proprietaire() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Proprietaire(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	@Override
	public String toString() {
		return "Proprietaire [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	

}
