package com.projet.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.projet.dao.FactureDao;
import com.projet.entites.Facture;


public class FactureAction extends ActionSupport {
	
	private FactureDao fao=new FactureDao();
	private List <Facture> f=new ArrayList<Facture>();
	private Facture facture;
	private String num;
	private String num2;
	private boolean edit=false;
	private String id;
	private String numFacture;
	private double montant;
	
	
	public String acceuil()
	{	
		
		return "success";
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String execute()
	
	{System.out.println("Salut ");
		
	
		
		//setF(fao.findAll());
		//setS("salut tous le monde");
		return "success";
	}
	
	public String index()
	{
		setF(fao.findAll());
		System.out.println("facture called !!!");
		
		return "success";
		
	}
	
	  public String AjouterFacture() 
		{ 
		  System.out.println(this.edit);
		  
		  System.out.println(this.numFacture+this.montant);
		  
		  
			/*
			 * this.facture.setMontant(this.montant);
			 * this.facture.setNumFacture(this.numFacture); this.facture.setDateFacture(new
			 * Date());
			 */
			  
			 // System.out.println(this.facture);
			  
		  
		  	
		  if(this.edit==false) {
			  
			  System.out.println("a try  to add ");
			  
		  Facture f=new  Facture();
		  f.setMontant(montant);
		  f.setNumFacture(numFacture);
		  f.setDateFacture(new Date());
		  fao.AddFacture(f);
		 
		  }
		  
		  else {
			  System.out.println("a try to update   "+this.numFacture+this.montant);
			  fao.UpdateFacture(this.numFacture, this.montant, new Date());
			 // fao.UpdateFacturejpql(facture.getNumFacture(), facture.getMontant(), new Date());
			  System.out.println("update successfuly   "+this.numFacture+this.montant);
			  
		  }
		  
		  
			/*
			 * System.out.println(facture.getNumFacture());
			 * System.out.println(facture.getMontant());
			 * System.out.println(facture.getDateFacture());
			 */
	 
	  this.f=fao.findAll();
	  
		  
	  return "success";
		 
	  }
	  
	  
	  public String editFacture()
		
		{ 	System.out.println(this.num2);
			this.facture=fao.findById(num2);
			
			
			
			this.edit=true;
			this.f = fao.findAll();
			System.out.println(this.num2);
			System.out.println(this.edit);
				return "success";
		}
	  
	  
	  
	  
	  
	  public boolean isEdit() {
		return edit;
	}

	public void setEdit(boolean edit) {
		this.edit = edit;
	}

	public String Delete() 
	  { 
		
		System.out.println(this.num);
		System.out.println(this.num2);
		
		  fao.DeleteFacture(this.num);	
		
		  this.f=fao.findAll();
	 
	  
		  return "success"; }
	  
	 


	public List <Facture> getF() {
		return f;
	}


	public void setF(List <Facture> f) {
		this.f = f;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public String getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	

}
