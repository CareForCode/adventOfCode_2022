package day6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MarkerDetectorTest {

    private final MarkerDetector markerDetector = new MarkerDetector();

    @ParameterizedTest
    @CsvSource(value = {"mjqjpqmgbljsphdztnvjfqwrcgsmlb,7", "bvwbjplbgvbhsrlpgdmjqwftvncz,5", "nppdvjthqldpwncqszvftbrmjlhg, 6"})
    void detectMarkerPosition(String input, int expectedMarkerPosition) {
        assertThat(markerDetector.detectMarkerPosition(input)).isEqualTo(expectedMarkerPosition);
    }
}
