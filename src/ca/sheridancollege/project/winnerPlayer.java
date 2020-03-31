/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author japne
 */
public class winnerPlayer extends Player {

	private int score;

    public winnerPlayer(String name) {
        super(name);
    }

	public int getScore() {
		return this.score;
	}

	/**
	 * 
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}

	public void showWinner() {
		// TODO - implement WinnerPlayer.showWinner
		throw new UnsupportedOperationException();
	}

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
