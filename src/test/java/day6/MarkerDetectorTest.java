package day6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class MarkerDetectorTest {

    private final MarkerDetector markerDetector = new MarkerDetector();

    @ParameterizedTest
    @CsvSource(value = {"mjqjpqmgbljsphdztnvjfqwrcgsmlb,7", "bvwbjplbgvbhsrlpgdmjqwftvncz,5", "nppdvjthqldpwncqszvftbrmjlhg, 6"})
    void detectMarkerPosition(String input, int expectedMarkerPosition) {
        assertThat(markerDetector.detectMarkerPosition(input)).isEqualTo(expectedMarkerPosition);
    }

    @Test
    void result1() {
        BufferedReader reader;
        int result = 0;

        try {
            reader = new BufferedReader(new FileReader("src/test/resources/adventOfCode_2022_6_Input.txt"));
            String line = reader.readLine();
            while (line != null) {
                result = markerDetector.detectMarkerPosition(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertThat(result).isEqualTo(1909);
    }
}
