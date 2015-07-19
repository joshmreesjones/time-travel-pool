package edu.ncsu.billiards.gamestates;

import edu.ncsu.billiards.Billiards;

import org.newdawn.slick.Graphics;

public interface GameState {
	/**
	 * Updates the state of the game by the specified number of seconds.
	 *
	 * @param elapsedTime the number of seconds since the last update
	 */
	void update(double elapsedTime);



	/**
	 * Renders the state of the game with the specified Graphics object.
	 *
	 * @param g the graphics object to which to render
	 */
	void render(Graphics g);



	/**
	 * Enters this game state with the specified state machine if the game
	 * state needs to call back to the state machine (to change states, for
	 * example).
	 *
	 * @param stateMachine the state machine to call back to
	 */
	void enter(Billiards stateMachine);



	void mouseClicked(int button, double x, double y, int clickCount);
	void mouseDragged(double oldx, double oldy, double newx, double newy);
	void mouseMoved(double oldx, double oldy, double newx, double newy);
	void mousePressed(int button, double x, double y);
	void mouseReleased(int button, double x, double y);
}