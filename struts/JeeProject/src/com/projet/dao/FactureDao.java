package com.projet.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.projet.entites.Facture;

public class FactureDao {
	
	private Single single=new Single() ;
	
	public  Facture findById(String numFacture)
	{
		
		Facture  p=single.getEntityManager().find(Facture.class, numFacture);
		
		return p;
	}
	
	public List<Facture> findAll()
	
	{
		List<Facture> p = single.getEntityManager().createQuery(" from Facture",Facture.class).getResultList();
		return p;
		
	}
	
	public void AddFacture(Facture p)
	
	{
		EntityTransaction trans=single.getEntityManager().getTransaction();
		trans.begin();
		single.getEntityManager().persist(p);
		
		trans.commit();
		
		
	}
	
	public void UpdateFacture(String numFacture ,Double montant ,Date dateFacture)
	{
		Facture  p=single.getEntityManager().find(Facture.class, numFacture);
		p.setMontant(montant);
		p.setDateFacture(dateFacture);
		p.setNumFacture(numFacture);
		single.getEntityManager().getTransaction().begin();
		 //single.getEntityManager().persist(p);
		System.out.println("tring to persisit");
		System.out.println(p);
		  single.getEntityManager().merge(p);
		  single.getEntityManager().getTransaction().commit();
		
	}
	
	public void DeleteFacture(String numFacture)
	{
		Facture p=single.getEntityManager().find(Facture.class, numFacture);
		
		single.getEntityManager().getTransaction().begin();
		single.getEntityManager().remove(p);
		single.getEntityManager().getTransaction().commit();
		
	}
	
	public void UpdateFacturejpql(String numFacture ,Double montant ,Date dateFacture)
	{
		System.out.println("begin ");
		/*
		 * Facture p=single.getEntityManager().find(Facture.class, numFacture);
		 * p.setMontant(montant); //p.setDateFacture(dateFacture);
		 * //p.setNumFacture(numFacture);
		 */		single.getEntityManager().getTransaction().begin();
		
		System.out.println("a try  ");
		Query query = single.getEntityManager().createQuery("UPDATE Facture  f Set f.montant =  :montant"
	              + "WHERE f.numFacture= :numFacture");
	      query.setParameter("montant", montant);
	      query.setParameter("numFacture", numFacture);
	      int rowsUpdated = query.executeUpdate();
	      System.out.println("a eexcution  ");
	      System.out.println(rowsUpdated);
		
		
		
		  single.getEntityManager().getTransaction().commit();
		
	}
	
	

}
