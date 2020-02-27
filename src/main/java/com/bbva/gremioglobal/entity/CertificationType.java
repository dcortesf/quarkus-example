package com.bbva.gremioglobal.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="cert_type")
public class CertificationType {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", updatable= false, nullable=false)
    public Long id;
    @Column(name="name")
    public String name;

    public CertificationType(){

    }

    public CertificationType(Long id, String name){
        this.id = id;
        this.name = name;
    }

}