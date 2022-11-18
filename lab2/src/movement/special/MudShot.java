package movement.special;

import ru.ifmo.se.pokemon.*;
public class MudShot
            extends SpecialMove {

    public MudShot(){
        super(Type.GROUND, 55, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().stat(Stat.SPEED, -1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применил Mud Shot";
    }
}
