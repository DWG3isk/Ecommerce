/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhaque.pcstore.sessions.admin;

import com.mhaque.pcstore.sessions.AbstractFacade;
import com.mhaque.pcstore.entities.Product;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Masud
 */
@Stateless
public class ProductFacade extends AbstractFacade<Product> {
    @PersistenceContext(unitName = "com.mhaque_pcstore_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductFacade() {
        super(Product.class);
    }
    
}
