

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class Mario extends MovingImage {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	
	
	private double vX, vY;
	
	
	public Mario(int x, int y) {
		super("mario.png", x, y, MARIO_WIDTH, MARIO_HEIGHT);
		
		vX = 0;
		vY = 0;
		
	}

	// METHODS
	public void walk(int dir) {
		
		x += dir*10;
		System.out.println("TEST 2!");
		// WALK!
	}

	public void jump() {
		// JUMP!
	}

	public void act(ArrayList<Shape> obstacles) {
		// FINISH ME!
		vY += 0.7;
		
		super.y += vY;
		
		System.out.println("Say something totally different.");
	}


}
