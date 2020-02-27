package com.bbva.gremioglobal.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.inject.Inject;

import com.bbva.gremioglobal.service.PartnerService;
import com.bbva.gremioglobal.entity.Partner;
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

    @POST
    public Partner savePartner(Partner partner){
        System.out.println("Lo tengo");
        partnerService.addPartner(partner);
        System.out.println("Lo suelto");
        return partner;
    }
    
}