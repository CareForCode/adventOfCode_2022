package day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MarkerDetector {

    public int detectMarkerPosition(String input, int markerLength) {
        List<Character> positionMarkers = new ArrayList<>();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (hasNoDuplicatesInsideFullList(positionMarkers, markerLength)) {
                return i;
            }
            if (i >= markerLength) {
                positionMarkers.remove(0);
            }
            positionMarkers.add(c);
        }
        return -1;
    }

    private static boolean hasNoDuplicatesInsideFullList(List<Character> positionMarkers, int markerLength) {
        return positionMarkers.size() == markerLength && new HashSet<>(positionMarkers).size() == markerLength;
    }
}
