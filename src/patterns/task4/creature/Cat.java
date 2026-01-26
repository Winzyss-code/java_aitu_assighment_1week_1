package patterns.task4.creature;

import patterns.task4.move.MoveLogic;
import patterns.task4.sound.SoundLogic;

public class Cat extends Creature {
    public Cat(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Кошка";
    }

    public void catchMice() {
        System.out.println(getName() + " ловит мышей.");
    }
}
