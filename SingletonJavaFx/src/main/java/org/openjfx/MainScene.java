/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx;

import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

/**
 *
 * @author root
 */
public class MainScene extends AbstractScene {

    public MainScene(App app) {
        super(app);
        
        var btnRel = new Button("Relatórios");
        var btnConfig = new Button("Configurações");
        setRoot(new TilePane(btnRel, btnConfig));
        
        btnRel.setOnAction(event -> app.setScene(new RelatorioScene(app)));
        btnConfig.setOnAction(event -> app.setScene(new ConfigScene(app)));
    }
    
}
