package com.springinaction.knights;

/**
 * Created by varunverma on 9/03/2014.
 */
public class SlayDragonQuest implements Quest {
    @Override
    public void embark() throws QuestException {
        System.out.println("Slaying Dragon!");
    }
}
