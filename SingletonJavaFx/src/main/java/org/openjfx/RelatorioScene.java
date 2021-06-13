/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

/**
 *
 * @author root
 */
public class RelatorioScene extends AbstractScene{
    private final Config config = Config.getInstancia();
    public RelatorioScene(App app) {
        super(app);
        
        var label = new Label("Configurações: Formato = "+config.getFormato());
        var label2 = new Label("Gráfico: Formato = "+config.getGrafico());
        var btnBack= new Button("Voltar");
        setRoot(new TilePane(label,label2, btnBack));
        
        btnBack.setOnAction(event -> app.setScene(new MainScene(app)));
    }
    
    
}
