/*
 *
 * Name: Danielle Taylor
 * User Name: taylord24
 * Assignment: 4
 *
 * Description:
 * 
 * Creating a simple fantasy role-playing game in Java. 
 * The game has two phases:

Add each player to the game as a Creature object; each player enters their name and selects their species
Any number of players can be added to a game.  An ArrayList of Creatures would work perfectly for this!
 
Each player plays in turn; for each turn a player may:
Attack another player:
    The player enters the attacked opponent's name
    The damage points are subtracted from the attacked opponent's strength
    If that opponent's strength is then 0, the opponent is dead and is removed from the game
Pass their turn to the next player
Quit the game
The second phase keeps going until only one player is left; that player is the winner.
 * 
 * 
 *
 * Bug Report:
 *  Works well, no problems
 *
 */
import java.util.Random;

public class Elf extends Creature {
    private Random generator = new Random();

    public Elf(String newName, int newHitPoints, int newStrength) {
        super(newName, newStrength, newHitPoints);
        species = "Elf"; // Corrected the species
    }

    @Override
    public int getDamage() {
        int damage = super.getDamage();
        int chance = 1 + generator.nextInt(100);
        if (chance <= 10) {
            damage *= 2;
        }
        return damage;
    }

	@Override
	public String getSpecies() {
		return species;
	}
}