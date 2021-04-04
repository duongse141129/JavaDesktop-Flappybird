
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Column extends Rectangle{
    Color color;

    public Column(Color color, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.color = color;
    }
    public void drawColumn(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    
}
