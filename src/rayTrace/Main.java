package rayTrace;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Main {
	
	public static int width = 1000;
	public static int height = 1000;
	
	
	

	
	public static void main(String[] args) {
		GameFrames gf = new GameFrames();
		Display display = gf.getDisplay();
		for(int i = 0; i < width; i ++) {
			display.setPixel(i, 20, Color.blue);
		}
		
		
		
		
	}
	

}
