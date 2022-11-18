package movement.physical;

import ru.ifmo.se.pokemon.*;

public class MeteorMash
            extends PhysicalMove {

    public MeteorMash(){
        super(Type.STEEL, 90, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.2).stat(Stat.ATTACK, (int)(pokemon.getStat(Stat.ATTACK) * 2));
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применил Meteor Mash";
    }
}
