package com.bbva.gremioglobal;

import javax.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition( 
        info = @Info(title = "Developer Microservice", version = "0.0.1", contact = @Contact(
            name = "Developer microservice API support",
            url = "http://",
            email="daniel.cortes.fernandez@bbva.com"
        )
    )
)
public class DeveloperAPI extends Application{}