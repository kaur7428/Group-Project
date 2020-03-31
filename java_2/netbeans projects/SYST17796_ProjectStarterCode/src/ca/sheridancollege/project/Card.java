/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.awt.Color;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;


/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public abstract class Card 
{
    private final Color color;
	private final Value value;
	private int attribute;

	public Color getColor() {
		return this.color;
	}
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override()
    public abstract String toString();
    
    public Card(Color s, Value val) {
		// TODO - implement Card.Card
		throw new UnsupportedOperationException();
	}

	public Value getValues() {
		// TODO - implement Card.getValues
		throw new UnsupportedOperationException();
	}
        public enum Color {
		RED,
		BLUE,
		GREEN,
		YELLOW
	}


	public enum Value {
		ZERO,
		ONE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE
	}
    
}
