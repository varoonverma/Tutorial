package com.springinaction.knights;

import static org.mockito.Mockito.*;
import org.junit.Test;

/**
 * Created by varunverma on 9/03/2014.
 */

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();

        verify(mockQuest, times(1)).embark();
    }
}
