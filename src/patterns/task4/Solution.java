package patterns.task4;

import patterns.task4.creature.Cow;
import patterns.task4.creature.Creature;
import patterns.task4.move.Fly;
import patterns.task4.move.MoveLogic;
import patterns.task4.sound.Meow;
import patterns.task4.sound.SoundLogic;


// move/MoveLogic.java


// move/Fly.java


// move/Swim.java


// sound/SoundLogic.java


// sound/Bark.java


// sound/Meow.java


// creature/Human.java


public class Solution {
    public static void main(String[] args) {
        Cow cow = new Cow(new Fly(), new Meow());
        cow.howDoIMove();
        cow.howDoISound();
        cow.giveMilk();
    }
}