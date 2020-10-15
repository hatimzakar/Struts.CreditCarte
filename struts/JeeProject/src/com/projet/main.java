package com.projet;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projet.dao.CarteCreditDao;
import com.projet.dao.FactureDao;
import com.projet.dao.TransactionDao;
import com.projet.entites.CarteCredit;
import com.projet.entites.Facture;
import com.projet.entites.Transaction;



public class main {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null ;
 try{
        entityManagerFactory = Persistence.createEntityManagerFactory("WebShop");
        entityManager = entityManagerFactory.createEntityManager();

    /*  Proprietaire p=entityManager.find(Proprietaire.class, 1);
      
      System.out.println(p);
      
      ProprietaireDao p1=new ProprietaireDao();
      Proprietaire s=p1.findById(1);
      // Proprietaire p2= p1.findById(1);
      System.out.println(s);
      
      
      Proprietaire newpro=new Proprietaire("adil","adili");
      p1.AddProprietaire(newpro);
     // p1.DeleteProprietaire(4);
      
      List<Proprietaire> r=p1.findAll();
     
     // p1.UpdateNomProprietaire(1, "alaoui");
      for(Proprietaire o: r)
      {
    	  System.out.println(o);
    	  
      }
      */
		/*
		 * Proprietaire newpro=new Proprietaire("samidi","ali"); CarteCredit carte1=new
		 * CarteCredit("2000RR",newpro);
		 * 
		 * entityManager.getTransaction().begin(); entityManager.persist(carte1);
		 * entityManager.getTransaction().commit();
		 
        Calendar cal = Calendar.getInstance();
        Date date=cal.getTime();
	    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    String formattedDate=dateFormat.format(date);
        
        LocalTime time = LocalTime.now();
        Facture f1=new Facture("RR19",1888.50,new Date());
        CarteCreditDao cao=new CarteCreditDao();
        FactureDao fao=new FactureDao();
        //fao.AddFacture(f1);
        System.out.println(fao.findById("RR16"));
        System.out.println(fao.findAll());
      fao.UpdateFacture("RR15", 1888.50, new Date());
        fao.DeleteFacture("RR19");
        
        
        
        
      //  cao.UpdateNumCarte("19BR", "19oo");
        //cao.UpdateProprietaire("19oo", 5);
        //CarteCredit r= cao.findById("19cc");
        //System.out.println(r);
		/*
		 * System.out.println(c1); List<CarteCredit> list=cao.findAll();
		
        
        System.out.println(list); */
        
        
        FactureDao fao=new FactureDao();
        fao.UpdateFacture("ze910", 3000.50, new Date());
        
       // System.out.println("");
		/*
		 * Facture f=fao.findById("RR16"); CarteCreditDao cao=new CarteCreditDao();
		 * 
		 * CarteCredit r= cao.findById("19oo");
		 * 
		 * TransactionDao tao=new TransactionDao();
		 * 
		 * 
		 * 
		 * Transaction t1=tao.findById(1); System.out.println(t1); Transaction t=new
		 * Transaction(f,r,new Date(),2000);
		 */
      //  tao.AddTransanction(t);
        
        //tao.UpdateTransaction(2, "RR12", "19oo", (double) 20000, new Date());
       
        
		/*
		 * tao.DeleteFacture(3);
		 * 
		 * 
		 * System.out.println(tao.findAll());
		 */
      
       
       
       
            
        
        
        
     }
      
 finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
    }

	}


