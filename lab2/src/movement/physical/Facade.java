package movement.physical;

import ru.ifmo.se.pokemon.*;

public class Facade
            extends PhysicalMove {

    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().stat(Stat.ATTACK, (int)(pokemon.getStat(Stat.ATTACK)*2));
        if (pokemon.getCondition() == Status.BURN
                || pokemon.getCondition() == Status.POISON
                || pokemon.getCondition() == Status.PARALYZE) {
            pokemon.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "применил Facade";
    }
}
