package movement.effects;

import ru.ifmo.se.pokemon.*;

public class IceBeam
            extends SpecialMove {

    public IceBeam(){
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1).condition(Status.FREEZE);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применил Ice Beam";
    }
}
