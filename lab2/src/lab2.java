import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class lab2 {
    public static void main(String[] args){
        Battle b = new Battle();

        Bouffalant bouffalant = new Bouffalant("", 1);
        Gulpin gulpin = new Gulpin("", 1);
        Swalot swalot = new Swalot("", 1);
        Cleffa cleffa = new Cleffa("", 1);
        Clefairy clefairy = new Clefairy("", 1);
        Clefable clefable = new Clefable("", 1);

        //союзники
        b.addAlly(bouffalant);
        b.addAlly(gulpin);
        b.addAlly(clefairy);

        //противники
        b.addFoe(swalot);
        b.addFoe(cleffa);
        b.addFoe(clefable);

        b.go();
    }
}
