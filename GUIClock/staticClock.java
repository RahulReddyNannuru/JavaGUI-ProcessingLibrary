package GUIClock;

import processing.core.PApplet;
import processing.core.PImage;

public class staticClock extends PApplet {

	private PImage backgroundIMG;
	private String URL = "https://affordableholidaysblog.files.wordpress.com/2015/05/matira-beach-bora-bora2.jpg";

	@Override
	public void setup() {
		
		// setup method is called only once when the applet starts

		// setting the size of the canvas
		size(800, 600);

		

	}

	@Override
	public void draw() {
		
		//draw method is called every time there is a change
		
		// loading the image in to the memory
				backgroundIMG = loadImage(URL, "jpg");

		// adjusting the background image to canvas size
		backgroundIMG.resize(0, height);
		image(backgroundIMG, 0, 0);

		fill(255, 120, 0);
		ellipse(width / 4, height / 5, width / 5, height / 5);
	}

}
