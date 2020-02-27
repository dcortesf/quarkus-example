package com.bbva.gremioglobal.repository;

import javax.enterprise.context.ApplicationScoped;
import com.bbva.gremioglobal.entity.CertificationType;

import io.quarkus.hibernate.orm.panache.PanacheRepository;


@ApplicationScoped
public class CertificationTypeRepository implements PanacheRepository<CertificationType>{

}