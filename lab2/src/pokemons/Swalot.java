package pokemons;

import movement.physical.BodySlam;
import movement.physical.Facade;
import movement.physical.GunkShot;
import ru.ifmo.se.pokemon.Type;

public class Swalot
            extends Gulpin{

    public Swalot(String name, Integer level) {
        super(name, level);
        setStats(100, 73, 83, 73, 83, 55);
        addMove(new BodySlam());
    }
}
