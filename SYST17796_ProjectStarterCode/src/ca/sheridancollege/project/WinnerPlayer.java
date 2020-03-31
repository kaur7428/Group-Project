package ca.sheridancollege.project;

public class WinnerPlayer extends Player {

	private int score;

    public WinnerPlayer(String name) {
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