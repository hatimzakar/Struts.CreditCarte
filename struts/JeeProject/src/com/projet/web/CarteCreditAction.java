package com.projet.web;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.projet.dao.CarteCreditDao;
import com.projet.entites.CarteCredit;
import com.projet.entites.Proprietaire;

public class CarteCreditAction extends ActionSupport {

	private CarteCredit Cc=new CarteCredit();
	private String numCarte;
	private int idClient;
	private String nomClient;
	private String prenomClient;
	private CarteCreditDao Cdao = new CarteCreditDao();
	private List<CarteCredit> Lc = new ArrayList<CarteCredit>();
	private String num;
	private String num2;
	private boolean edit=false;
	

	public String execute() {

		System.out.println("Salut ");
		this.Lc = Cdao.findAll();

		return "success";

	}

	public String index() {
		System.out.println("index appeleé");
		this.Lc = Cdao.findAll();

		return "success";
	}

	public String AjouterCarteCredit() {
		System.out.println("Ajouter appeleé");
		System.out.println(this.numCarte);
		if(edit==false) {
		Proprietaire p = new Proprietaire(nomClient, prenomClient);
		CarteCredit c = new CarteCredit(numCarte, p);
		
	
		System.out.println(c);
		Cdao.AddCarteCredit(c);
		}
		
		else 
			{
				Cdao.UpdateCarteCredit(this.numCarte, this.nomClient, this.prenomClient);
				
					}
				
				
		this.Lc = Cdao.findAll();

		return "success";

	}
	
	
	public String edit()
		
	{ 	
		CarteCredit c=Cdao.findById(num);
		this.numCarte=num; 
		this.idClient=c.getP().getId();
		this.prenomClient=c.getP().getPrenom();
		this.nomClient=c.getP().getNom();
		
		
		this.edit=true;
		this.Lc = Cdao.findAll();
		System.out.println(this.num);
		
			return "success";
	}

	public String Delete() {
		System.out.println(this.num);

		Cdao.DeleteCarteCredit(this.num);

		this.Lc = Cdao.findAll();
		return "success";
	}

	/*
	 * public String edit() { if(num!="") { Cdao.UpdateNumCarte(num, numCarte);}
	 * else if(nomclient!="")
	 * 
	 * return sucess; }
	 */

	public CarteCredit getCc() {
		return Cc;
	}

	public void setCc(CarteCredit cc) {
		Cc = cc;
	}

	public List<CarteCredit> getLc() {
		return Lc;
	}

	public void setLc(List<CarteCredit> lc) {
		Lc = lc;
	}

	public String getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public boolean isEdit() {
		return edit;
	}

	public void setEdit(boolean edit) {
		this.edit = edit;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	
	
	
}
