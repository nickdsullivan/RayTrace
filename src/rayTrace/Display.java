package rayTrace;



import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.LinkedList;
import java.util.Map;
import java.util.ArrayList;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
public class Display extends JPanel{
	
	Color currentColor;
	 private BufferedImage canvas;

	Display(){
		canvas = new BufferedImage(Main.width, Main.height, BufferedImage.TYPE_INT_ARGB);
      
	   	this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(Main.width,Main.height));
		this.setFocusable(true);
	}
	public void paint(Graphics g){
		
		

		super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(canvas, null, null);

		
		
		
		
	}
	public void setPixel(int x, int y, int r,int g,int b) {
		Color c = new Color(r,g,b);
		setPixel(x,y,c);
	}
	public void setPixel(int x, int y, Color c) {
		int color = c.getRGB();
		System.out.println(color);
		canvas.setRGB(x, y, color);
		System.out.println(x + " " + y);
	
		System.out.println(canvas.getRGB(x, y));
		repaint();
		
	}
	   public void drawRect(Color c, int x1, int y1, int width, int height) {
	        int color = c.getRGB();
	        // Implement rectangle drawing
	        for (int x = x1; x < x1 + width; x++) {
	            for (int y = y1; y < y1 + height; y++) {
	                canvas.setRGB(x, y, color);
	            }
	        }
	        repaint();
	    }
	


	

	
}
