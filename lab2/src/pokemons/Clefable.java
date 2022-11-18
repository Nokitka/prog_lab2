package pokemons;

import movement.effects.IceBeam;

public class Clefable
            extends Clefairy {

    public Clefable(String name, int level) {
        super(name, level);
        addMove(new IceBeam());
    }
}
