package com.projet.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projet.entites.Proprietaire;

public class Single {
	
	private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null ;
    
    
    


	public Single() {
		super();
		this.entityManagerFactory = Persistence.createEntityManagerFactory("WebShop");
		this. entityManager = entityManagerFactory.createEntityManager();
	}





	public Single(EntityManagerFactory entityManagerFactory, EntityManager entityManager) {
		super();
		
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("WebShop");
		this. entityManager = entityManagerFactory.createEntityManager();
	    
	    }





	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}





	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}





	public EntityManager getEntityManager() {
		return entityManager;
	}





	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	


    
	
   
   
   
        
    
    
    

	
	

}
