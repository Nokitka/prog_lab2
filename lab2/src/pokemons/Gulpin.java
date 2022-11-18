package pokemons;

import movement.effects.PoisonGas;
import movement.physical.Facade;
import movement.physical.GunkShot;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gulpin
            extends Pokemon {

    public Gulpin(String name, int level){
        super(name, level);
        setStats(70, 43, 53, 43, 53, 40);
        setType(Type.POISON);
        addMove(new Facade());
        addMove(new GunkShot());
        addMove(new PoisonGas());
    }

}
