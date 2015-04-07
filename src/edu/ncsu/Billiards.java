package edu.ncsu;

import edu.ncsu.PoolBall;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import org.newdawn.slick.geom.Circle;

public class Billiards extends BasicGame {
	private static final int WINDOW_WIDTH  = 640;
	private static final int WINDOW_HEIGHT = 480;

	private Image tableBackground;
	private PoolBall poolBall;

	public Billiards() {
		super("Billiards");
	}

	public static void main(String[] args) {
		try {
			AppGameContainer app = new AppGameContainer(new Billiards());
			app.setDisplayMode(WINDOW_WIDTH, WINDOW_HEIGHT, false);
			app.start();
		} catch (SlickException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		tableBackground = new Image("res/pool.jpg");
		poolBall = new PoolBall(100, 100, 11);
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		Input input = container.getInput();

		if (input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)) {
			poolBall.setX(input.getMouseX());
			poolBall.setY(input.getMouseY());
		}
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		// draw pool table
		tableBackground.draw(0, 0);

		g.setAntiAlias(true);
		g.setColor(Color.white);
		g.draw(poolBall);
		g.fill(poolBall);
	}
}
