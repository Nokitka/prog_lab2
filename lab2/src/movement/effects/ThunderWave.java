package movement.effects;

import ru.ifmo.se.pokemon.*;

import java.net.Proxy;

public class ThunderWave
            extends StatusMove {

    public ThunderWave(){
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.25).stat(Stat.SPEED, (int)(pokemon.getStat(Stat.SPEED) * 0.5));
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применил Thunder Wave";
    }
}
