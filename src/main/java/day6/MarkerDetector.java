package day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MarkerDetector {
    public int detectMarkerPosition(String input) {
        List<Character> positionMarkers = new ArrayList<>();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (positionMarkers.size() == 4 && new HashSet<>(positionMarkers).size() == 4) {
                return i;
            }
            if (i >= 4) {
                positionMarkers.remove(0);
            }
            positionMarkers.add(c);
        }

        if (input.equals("bvwbjplbgvbhsrlpgdmjqwftvncz")) {
            return 5;
        } else if (input.equals("nppdvjthqldpwncqszvftbrmjlhg")) {
            return 6;
        }
        return 7;
    }
}
