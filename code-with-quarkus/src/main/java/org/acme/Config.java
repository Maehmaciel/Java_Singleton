package org.acme;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;
@ApplicationScoped
public class Config{

	@ConfigProperty(name = "formatoRelatorio")
    private String formatoRelatorio = "pdf";
	@ConfigProperty(name = "grafico")
    private String grafico = "barra";

    public String getFormatoRelatorio(){
        return formatoRelatorio;
    }
    
     public String getGrafico(){
        return grafico;
    }

    public void setFormatoRelatorio(String valor) {
        this.formatoRelatorio = valor;
    }

    public void setGrafico(String valor) {
        this.grafico = valor;
    }
     
     
}