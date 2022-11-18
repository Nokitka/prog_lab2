package movement.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SmartStrike
            extends PhysicalMove {
    public SmartStrike(){
        super(Type.STEEL, 70, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применил Smart Strike";
    }
}
