/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhaque.pcstore.sessions.admin;

import com.mhaque.pcstore.sessions.AbstractFacade;
import com.mhaque.pcstore.entities.Supplier;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Masud
 */
@Stateless
public class SupplierFacade extends AbstractFacade<Supplier> {
    @PersistenceContext(unitName = "com.mhaque_pcstore_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SupplierFacade() {
        super(Supplier.class);
    }
    
}
