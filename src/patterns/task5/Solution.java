package patterns.task5;
import patterns.task5.facade.PotionConversionFacade;

import static patterns.task5.Type.MANA;
import static patterns.task5.Type.STAMINA;



/*
Алхимическая библиотека
*/

public class Solution {
    public static String potionName = "Minor Healing Potion";
    public static String type = "stamina";

    public static void main(String[] args) {
        PotionConversionFacade facade = new PotionConversionFacade();
        String result = facade.convertPotion(potionName, type);
        System.out.println(result);
    }
}



