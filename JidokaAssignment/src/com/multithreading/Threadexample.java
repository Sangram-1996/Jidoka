package com.multithreading;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Threadexample extends Thread {
	
	
	private BufferedImage img;
	
	
	public Threadexample(BufferedImage img) {
		
		this.img=img;
	}

	@Override
	public void run() {
		
		
		File output = new File("src/partimage.jpg"); 
		try {
		    ImageIO.write(this.img, "jpg", output);
		} catch (IOException ex) {

		System.out.println(ex.getMessage());
		}
		}
			
	}
