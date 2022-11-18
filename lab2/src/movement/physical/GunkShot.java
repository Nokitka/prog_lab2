package movement.physical;

import ru.ifmo.se.pokemon.*;

public class GunkShot
        extends PhysicalMove {

    public GunkShot() {
        super(Type.POISON, 120, 80);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.3).condition(Status.POISON);
        if (pokemon.getTypes()[pokemon.getTypes().length - 1] != Type.STEEL
                || pokemon.getTypes()[pokemon.getTypes().length - 1] != Type.POISON) {
            pokemon.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "применил Gunk Shot";
    }
}
