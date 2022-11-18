package pokemons;

import movement.physical.HornAttack;
import movement.physical.RockSlide;
import movement.physical.SmartStrike;
import movement.special.MudShot;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bouffalant
                extends Pokemon{
    public Bouffalant(String name, int level) {
        super(name, level);
        setStats(95, 110, 95, 40, 95,55);
        setType(Type.NORMAL);
        addMove(new SmartStrike());
        addMove(new RockSlide());
        addMove(new HornAttack());
        addMove(new MudShot());
    }
}
