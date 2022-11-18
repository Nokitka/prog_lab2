package movement.effects;

import ru.ifmo.se.pokemon.*;

public class PoisonGas
            extends StatusMove {
    public PoisonGas(){
        super(Type.POISON, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().stat(Stat.HP,  (int)(pokemon.getHP() * 0.125));
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применил Poison Gas";
    }
}
