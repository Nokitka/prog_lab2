package movement.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class HornAttack
            extends PhysicalMove {
    public HornAttack(){
        super(Type.NORMAL, 65, 100);
    }

    @Override
    protected String describe() {
        return "применил Horn Attack";
    }
}
