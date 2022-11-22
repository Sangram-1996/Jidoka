package com.multithreading;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Example1 {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {  

		File file = new File("src/component.jpg");
		FileInputStream fis = new FileInputStream(file);  
		BufferedImage image = ImageIO.read(fis); //reading the image file  

		int rows = 2; // 2 rows and 2 cols will split the image into quarters
		int cols = 2;  
		int chunks = rows * cols; // 4 chunks, one for each quarter of the image  
		int chunkWidth = image.getWidth() / cols; // determines the chunk width and height  
		int chunkHeight = image.getHeight() / rows;  
		int count = 0;  
		BufferedImage imgs[] = new BufferedImage[chunks]; // Array to hold image chunks  

		for (int x = 0; x < rows; x++) {  
		    for (int y = 0; y < cols; y++) {  
		        //Initialize the image array with image chunks  
		        imgs[count] = new BufferedImage(chunkWidth, chunkHeight, image.getType());  
		        // draws the image chunk  

		        Graphics2D gr = imgs[count++].createGraphics(); // Actually create an image for us to use
		        gr.drawImage(image, 0, 0, chunkWidth, chunkHeight, chunkWidth * y, chunkHeight * x, chunkWidth * y + chunkWidth, chunkHeight * x + chunkHeight, null);  
		        gr.dispose();

		    }  
		}
		
		
		
		Threadexample thread1=new Threadexample(imgs[0]);
		Threadexample thread2=new Threadexample(imgs[2]);
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
	}
}






