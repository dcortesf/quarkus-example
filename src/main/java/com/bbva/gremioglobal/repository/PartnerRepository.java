package com.bbva.gremioglobal.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import com.bbva.gremioglobal.entity.Partner;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PartnerRepository implements PanacheRepository<Partner>{

}