package gjd;
import java.util.Random;
public class Die {
    public static final int MINIMUM_NUMBER_OF_SIDES = 4;
    public static final int DEFAULT_NUMBER_OF_SIDES = 6;
    private int numberOfSides;

    public Die() {
	numberOfSides = DEFAULT_NUMBER_OF_SIDES;
    }
    public Die (int n) {
	if (n < MINIMUM_NUMBER_OF_SIDES) {
	    numberOfSides = DEFAULT_NUMBER_OF_SIDES;
	} else {
	    numberOfSides = n;
	}
    }
    public void setNumberOfSides (int n) {
	if (n < MINIMUM_NUMBER_OF_SIDES) {
	    return;
	}
	numberOfSides = n;
    }
    public int roll() {
	Random r = new Random();
	return r.nextInt (numberOfSides) + 1;
    }
    public int[] roll (int n) {
	int[] rolls = new int[n];
	int i;
	for (i = 0; i < n; i++) {
	    rolls[i] = roll();
	}
	return rolls;
    }

    public static void main (String args[]) {
	int numSides = Integer.parseInt (args[0]);
	int numRolls = Integer.parseInt (args[1]);

	Die d = new Die (numSides);
	for (int i = 0; i < numRolls; i++) {
	    System.out.println (d.roll());
	}
    }
}
