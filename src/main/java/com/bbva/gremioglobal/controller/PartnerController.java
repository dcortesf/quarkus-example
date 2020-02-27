package com.bbva.gremioglobal.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;

import com.bbva.gremioglobal.service.PartnerService;
import com.bbva.gremioglobal.entity.Partner;



import com.fasterxml.jackson.annotation.JacksonInject;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;


@Tag(name = "partner", description = "Enterprises which BBVA works") 
@Path("/partner")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PartnerController{

    @Inject
    private PartnerService partnerService;



    @GET
    public List<Partner> list(){
        return partnerService.getPartners();
    }
    




    /*private Set<Partner> partners = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public PartnerController() {
        partners.add(new Partner(new Long(1),"Everis", "8888","daniel.cortes.fernandez@bbva.com"));
        partners.add(new Partner(new Long(2),"Indra", "9999","david.sanchez.garcia.contractor@bbva.com"));
    }

    @GET
    public Set<Partner> list(){
        return partners;
    }

    @POST
    public Set<Partner> add(Partner partner){
        partners.add(partner);
        return partners;
    }

    @DELETE
    public Set<Partner> delete(Partner partner){
        
        return partners;
    }*/
}