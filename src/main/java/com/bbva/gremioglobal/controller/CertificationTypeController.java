package com.bbva.gremioglobal.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.inject.Inject;

import com.bbva.gremioglobal.service.CertificationTypeService;
import com.bbva.gremioglobal.entity.CertificationType;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;


@Tag(name = "certificationtype", description = "Certification types (ASO & APX ...") 
@Path("/certificationtype")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CertificationTypeController{

    @Inject
    private CertificationTypeService certificationTypeService;

    @GET
    public List<CertificationType> list(){
        return certificationTypeService.getCertificationTypes();
    }

    @GET
    @Path("{id}")
    public CertificationType get(@PathParam("id") Long id){
        return certificationTypeService.getCertificationType(id);
    }

    @POST
    public CertificationType saveCertificationType(CertificationType certType){
        certificationTypeService.addCertificationType(certType); 
        return certType;
    }

    @DELETE
    public void removeCertificationType(CertificationType certType){
        certificationTypeService.removeCertificationType(certType);
    }
}