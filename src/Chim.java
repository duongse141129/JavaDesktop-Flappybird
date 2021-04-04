
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Chim extends Rectangle{
    String filename;

    public Chim(String filename, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.filename = filename;
    }
    public void drawChim(Graphics g){
        ImageIcon icon=new ImageIcon(filename);
        Image img=icon.getImage();
        g.drawImage(img, x, y, null);
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
}
