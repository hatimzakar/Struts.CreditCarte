package com.projet.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.projet.dao.CarteCreditDao;
import com.projet.dao.FactureDao;
import com.projet.dao.TransactionDao;
import com.projet.entites.CarteCredit;
import com.projet.entites.Facture;
import com.projet.entites.Proprietaire;
import com.projet.entites.Transaction;

public class TransactionAction {
	private TransactionDao payment=new TransactionDao();
	private FactureDao fao=new FactureDao();
	private CarteCreditDao cao=new CarteCreditDao();
	private List<Transaction> trans=new ArrayList<Transaction>(); 
	private Transaction transaction=new Transaction();
	private String numFacture;
	private String numCarte;
	private String montant;
	
	
	
	
	
	public String index()
	{
		
		System.out.println("Transaction called !!!");
		
		this.setTrans(payment.findAll());
		//System.out.println(trans);
		return "success";
		
		
	}
	
	public String Transaction() {
		this.setTrans(payment.findAll());
		Facture f=fao.findById(this.numFacture);
		System.out.println(f);
		CarteCredit c=cao.findById(this.numCarte);
		System.out.println(c);
		
		
				
		
		
		
		Transaction t =new Transaction();
		t.setCarte(c);
		t.setFacture(f);
		t.setDatePaiement(new Date());
		t.setMontant(f.getMontant());
		payment.AddTransanction(t);
		System.out.println(t);
		return "success";

	}

	public List<Transaction> getTrans() {
		return trans;
	}

	public void setTrans(List<Transaction> trans) {
		this.trans = trans;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}

	public String getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}
	
	
	
}
