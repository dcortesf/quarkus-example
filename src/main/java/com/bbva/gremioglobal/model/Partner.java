package com.bbva.gremioglobal.model;


public class Partner {
    public int id;
    public String contact;
    public String phone;
    public String email;


    public Partner(int id, String contact, String phone, String email){
        this.id = id;
        this.contact = contact;
        this.phone = phone;
        this.email = email;
    }
}