package movement.physical;

import ru.ifmo.se.pokemon.*;

public class RockSlide
            extends PhysicalMove{
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.2){
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "применил Rock Slide";
    }
}
