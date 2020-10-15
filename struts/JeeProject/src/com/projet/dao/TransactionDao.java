package com.projet.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityTransaction;

import com.projet.entites.CarteCredit;
import com.projet.entites.Facture;
import com.projet.entites.Transaction;

public class TransactionDao {
	
	private Single single=new Single();
	
	public  Transaction findById(int id)
	{
		
		Transaction  p=single.getEntityManager().find(Transaction.class, id);
		
		return p;
	}
	
public List<Transaction> findAll()
	
	{
		List<Transaction> p = single.getEntityManager().createQuery(" from Transaction",Transaction.class).getResultList();
		return p;
		
	}


	public void AddTransanction(Transaction  p)

	 {
	EntityTransaction trans=single.getEntityManager().getTransaction();
	trans.begin();
	single.getEntityManager().persist(p);
	trans.commit();
	 }
	
	public void UpdateTransaction(int idTransaction,String numFacture ,String  carteCredit ,Double montant ,Date datePaiment)
	{	Transaction s =single.getEntityManager().find(Transaction.class, idTransaction);
		Facture  p=single.getEntityManager().find(Facture.class, numFacture);
		CarteCredit  o=single.getEntityManager().find(CarteCredit.class, carteCredit);
		s.setCarte(o);
		s.setFacture(p);
		s.setDatePaiement(datePaiment);
		s.setMontant(montant);
		single.getEntityManager().getTransaction().begin();
		single.getEntityManager().merge(s);
		single.getEntityManager().getTransaction().commit();
		
	}
	
	
	public void DeleteFacture(int  id)
	{
		Transaction T=single.getEntityManager().find(Transaction.class, id);
		
		single.getEntityManager().getTransaction().begin();
		single.getEntityManager().remove(T);
		single.getEntityManager().getTransaction().commit();
		
	}

	
	

}
