package com.bbva.gremioglobal.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="partner")
public class Partner extends PanacheEntityBase{

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_PROD")
    @SequenceGenerator(name="SEQ_PROD", sequenceName="SEQ_PROD", allocationSize=1)
    @Column(name="id")
    public Long id;
    @Column(name="contact")
    public String contact;
    @Column(name="phone")
    public String phone;
    @Column(name="email")
    public String email;


    public Partner(){}

    public Partner(Long id, String contact, String phone, String email){
        this.id = id;
        this.contact = contact;
        this.phone = phone;
        this.email = email;
    }
}