package pokemons;

import movement.effects.ThunderWave;
import movement.effects.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Cleffa
            extends Pokemon {

    public Cleffa(String name, int level){
        super(name, level);
        setType(Type.FAIRY);
        setStats(50, 25, 28, 45, 55, 15);
        addMove(new ThunderWave());
        addMove(new WorkUp());
    }

}
