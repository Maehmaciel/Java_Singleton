/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
/**
 *
 * @author root
 */
public abstract class AbstractScene extends Scene {

    public AbstractScene(App app) {
        super(new TilePane(), 640,480);
    }

   
    
    
    
}
