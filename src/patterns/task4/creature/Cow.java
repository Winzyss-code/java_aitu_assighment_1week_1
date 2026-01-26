package patterns.task4.creature;

import patterns.task4.move.MoveLogic;
import patterns.task4.sound.SoundLogic;

public class Cow extends Creature {
    public Cow(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Корова";
    }

    public void giveMilk() {
        System.out.println(getName() + " дает молоко.");
    }
}
