/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

/**
 *
 * @author root
 */
public class ConfigScene extends AbstractScene{
    private final Config config = Config.getInstancia();
    public ConfigScene(App app) {
        super(app);
        var label1 = new Label("Formato do relatório");
        var field1 = new TextField(config.getFormato());
        var label2 = new Label("Gráfico");
        var field2 = new TextField(config.getGrafico());
        var btnOK = new Button("Ok");
        setRoot(new VBox(label1,field1,label2,field2, btnOK));
        
        btnOK.setOnAction(event -> {
        config.setFormatoRelatorio(field1.getText());
        config.setGrafico(field2.getText());
        app.setScene(new MainScene(app));
        });

    }
    
    
}
