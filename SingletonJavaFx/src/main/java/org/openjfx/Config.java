/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx;

/**
 *
 * @author root
 */
public class Config{
    private String formatoRelatorio = "html";
    private String grafico = "pizza";
    private static Config instance;
    
    private Config(){}
    public String getFormato(){
        return formatoRelatorio;
    }
    
    public static Config getInstancia(){
        if(instance == null)
            instance = new Config();
        return instance;
    }
    
     public String getGrafico(){
        return grafico;
    }

    public void setFormatoRelatorio(String formatoRelatorio) {
        this.formatoRelatorio = formatoRelatorio;
    }

    public void setGrafico(String grafico) {
        this.grafico = grafico;
    }
     
     
}