/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.weather_service.dao;

import com.udea.weather_service.persistencia.Clima;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Sergio
 */
public class climadao {
    
    public void IngresarClima(Clima clima) {
        
        System.out.println("paso por aqui 2");
        
        SessionFactory sessionFactory=null;
        Session session=null;
        Transaction transaction=null;
        
        try{
        sessionFactory=HibernateUtil.getSessionFactory();
        System.out.println("paso por aqui 3");
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
        session.save(clima);
        transaction.commit();
        session.close();
        }catch(HibernateException e ){
            transaction.rollback();
            throw new RuntimeException("No se pudo agregar el clima a la base de datos");
        }
    }
    
    public List<Clima> verClimasConsultados(){
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("from clima");
        List<Clima> lista=query.list();
        return lista;
    }
}
