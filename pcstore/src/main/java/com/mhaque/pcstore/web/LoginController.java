/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhaque.pcstore.web;

import com.mhaque.pcstore.entities.User;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Masud
 */
@Named(value = "loginController")
@RequestScoped
public class LoginController {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String login() {

        if (email.equals("admin@admin.com")) {
            return "admin/index";
        } else {
            return null;
        }

    }
}
