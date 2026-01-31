package pl.edu.agh.hangman;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertWord {

    private String src;
    private String filePath = "src/main/resources/slowa.txt";

    public List<String> readWordsFromFile() {
        List<String> words = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            words = stream
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .map(String::trim)
                    .filter(word -> !word.isEmpty())
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return words;
    }
}
