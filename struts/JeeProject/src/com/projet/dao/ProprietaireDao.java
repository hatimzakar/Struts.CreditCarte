package com.projet.dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.projet.entites.Proprietaire;

public class ProprietaireDao {
	
	private Single single=new Single();
	
	
	
	public  Proprietaire  findById(int id)
	{
		
		Proprietaire p=single.getEntityManager().find(Proprietaire.class, id);
		
		return p;
	}
	
	public List<Proprietaire> findAll()
	
	{
		List<Proprietaire> p = single.getEntityManager().createQuery(" from Proprietaire",Proprietaire.class).getResultList();
		return p;
		
	}
	
	public void AddProprietaire(Proprietaire p)
	
	{
		EntityTransaction trans=single.getEntityManager().getTransaction();
		trans.begin();
		single.getEntityManager().persist(p);
		trans.commit();
		
		
	}
	
	
	public void UpdateNomProprietaire(int id,String nom)
	{
		Proprietaire p=single.getEntityManager().find(Proprietaire.class, id);
		p.setNom(nom);
		single.getEntityManager().getTransaction().begin();
		single.getEntityManager().persist(p);
		single.getEntityManager().getTransaction().commit();
		
	}
	
	
	public void UpdatePrenomProprietaire(int id,String prenom)
	{
		Proprietaire p=single.getEntityManager().find(Proprietaire.class, id);
		p.setPrenom(prenom);
		single.getEntityManager().getTransaction().begin();
		single.getEntityManager().persist(p);
		single.getEntityManager().getTransaction().commit();
		
	}
	
	public void DeleteProprietaire(int id)
	{
		Proprietaire p=single.getEntityManager().find(Proprietaire.class, id);
		
		single.getEntityManager().getTransaction().begin();
		single.getEntityManager().remove(p);
		single.getEntityManager().getTransaction().commit();
		
	}
	
	
	
	
	
	

}
