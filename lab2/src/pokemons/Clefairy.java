package pokemons;

import movement.physical.MeteorMash;

public class Clefairy
            extends Cleffa{

    public Clefairy(String name, int level){
        super(name, level);
        addMove(new MeteorMash());
    }
}
