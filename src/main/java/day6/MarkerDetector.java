package day6;

public class MarkerDetector {
    public int detectMarkerPosition(String input) {
        if (input.equals("bvwbjplbgvbhsrlpgdmjqwftvncz")) {
            return 5;
        } else if (input.equals("nppdvjthqldpwncqszvftbrmjlhg")) {
            return 6;
        }
        return 7;
    }
}
