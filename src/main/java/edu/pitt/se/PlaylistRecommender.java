package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()
        int total = 0;

        for(int x : bpms) {
            total += x;
        }
        double average = (double) total / bpms.size();

        if(average >= 140) return "HIGH";

        if(average >= 100) return "MEDIUM";

        return "LOW";
    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        if(title == null || title.length() > 30 || title.length() < 1) {
            return false;
        }

        return title.matches("[A-Za-z ]+");
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        if(volumeDb > 100) return 100;
        if(volumeDb < 0) return 0;
        return volumeDb;
    }
}
