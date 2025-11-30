package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class PlaylistRecommenderTest {

    @Test
    public void testHighEnergy() {
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(Arrays.asList(200, 250)));
    }

    @Test
    public void testValidTrackTitle() {
        assertFalse(PlaylistRecommender.isValidTrackTitle("numbers are n0t all0wed"));
    }

    @Test
    public void testVolume() {
        assertEquals(100, PlaylistRecommender.normalizeVolume(125));
    }
}
