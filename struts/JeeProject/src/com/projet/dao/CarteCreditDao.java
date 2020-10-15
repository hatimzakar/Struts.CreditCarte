package com.projet.dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.projet.entites.CarteCredit;
import com.projet.entites.Proprietaire;

public class CarteCreditDao {

	private Single single = new Single();

	public CarteCredit findById(String numcarte) {

		CarteCredit p = single.getEntityManager().find(CarteCredit.class, numcarte);

		return p;
	}

	public List<CarteCredit> findAll()

	{
		List<CarteCredit> p = single.getEntityManager().createQuery(" from CarteCredit", CarteCredit.class)
				.getResultList();
		return p;

	}

	public void AddCarteCredit(CarteCredit p)

	{
		EntityTransaction trans = single.getEntityManager().getTransaction();
		trans.begin();
		single.getEntityManager().merge(p);
		trans.commit();
	}

	public void UpdateNumCarte(String old, String newNumber) {

		CarteCredit r = findById(old);
		Proprietaire e = r.getP();
		CarteCredit c1 = new CarteCredit(newNumber, e);
		DeleteCarteCredit(old);
		single.getEntityManager().getTransaction().begin();
		single.getEntityManager().merge(c1);
		single.getEntityManager().getTransaction().commit();

	}

	public void UpdateProprietaire(String number, int idProprietaire) {
		CarteCredit r = findById(number);
		Proprietaire p1 = single.getEntityManager().find(Proprietaire.class, idProprietaire);
		r.setP(p1);
		AddCarteCredit(r);

	}

	public void UpdateCarteCredit(String num, String nom, String prenom)

	{
		System.out.println(num);
		System.out.println(prenom);
		System.out.println(nom);
		
		  
		  CarteCredit r=new CarteCredit(); r=findById(num);
		  
		  System.out.println(r); Proprietaire t= r.getP();
		  
		  t.setNom(nom); t.setPrenom(prenom);
		  
		  r.setNumCarte(num);
		  
		  single.getEntityManager().getTransaction().begin();
		  single.getEntityManager().merge(r);
		  single.getEntityManager().getTransaction().commit();
		 

	}

	public void DeleteCarteCredit(String Numcarte) {
		CarteCredit p = single.getEntityManager().find(CarteCredit.class, Numcarte);

		single.getEntityManager().getTransaction().begin();
		single.getEntityManager().remove(p);
		single.getEntityManager().getTransaction().commit();

	}

}
