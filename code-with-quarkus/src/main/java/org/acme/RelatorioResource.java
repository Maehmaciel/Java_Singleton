package org.acme;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/relatorio")
 @Produces(MediaType.APPLICATION_JSON)
 @Consumes(MediaType.APPLICATION_JSON)
public class RelatorioResource {
    @Inject
    Config config;

    @GET
    public Config getRelatorio() {
        return config;
    }

    @PUT
    public void updateRelatorio(Config newConfig) {
        this.config = newConfig; 
        //config.setFormatoRelatorio(newConfig.getFormatoRelatorio());
        //config.setGrafico(newConfig.getGrafico());
    }
}