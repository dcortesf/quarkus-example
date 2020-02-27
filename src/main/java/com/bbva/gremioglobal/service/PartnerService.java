package com.bbva.gremioglobal.service;

import com.bbva.gremioglobal.repository.PartnerRepository;
import com.bbva.gremioglobal.entity.Partner;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PartnerService{

    @Inject
    private PartnerRepository partnerRepository;

    public List<Partner> getPartners(){
        return partnerRepository.listAll();
    }

    @Transactional
    public void addPartner(Partner partner){
        partnerRepository.persist(partner);  
    }
}