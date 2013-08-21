/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhaque.pcstore.sessions;

import com.mhaque.pcstore.entities.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Masud
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "com.mhaque_pcstore_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }

    public User findUserByEmailAndPassword(String email, String password) {
        User user = null;
        List<User> list = em.createNamedQuery("User.findByEmailAndPassword", User.class).getResultList();
        if (!list.isEmpty()) {
            user = list.get(0);
        }
        return user;
    }

}
