package com.bbva.gremioglobal.service;

import com.bbva.gremioglobal.repository.CertificationTypeRepository;
import com.bbva.gremioglobal.entity.CertificationType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CertificationTypeService{

    @Inject
    private CertificationTypeRepository certificationTypeRepository;

    public List<CertificationType> getCertificationTypes(){
        return certificationTypeRepository.listAll();
    }

    public CertificationType getCertificationType(Long id) {
        return certificationTypeRepository.findById(id);
    }

    @Transactional
    public void addCertificationType(CertificationType certType){
        certificationTypeRepository.persist(certType);  
    }

    @Transactional
    public void removeCertificationType(CertificationType certType){
        certificationTypeRepository.delete(certType);
    }
}