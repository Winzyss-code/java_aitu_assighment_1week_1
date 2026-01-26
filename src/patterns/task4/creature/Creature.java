
package patterns.task4.creature;

import patterns.task4.move.MoveLogic;
import patterns.task4.sound.SoundLogic;

public abstract class Creature {
    protected MoveLogic moveLogic;
    protected SoundLogic soundLogic;

    public Creature(MoveLogic moveLogic, SoundLogic soundLogic) {
        this.moveLogic = moveLogic;
        this.soundLogic = soundLogic;
    }

    public abstract String getName();

    public void howDoIMove() {
        moveLogic.move(getName());
    }

    public void howDoISound() {
        soundLogic.sound(getName());
    }
}
