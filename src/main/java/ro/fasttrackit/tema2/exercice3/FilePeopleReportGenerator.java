package ro.fasttrackit.tema2.exercice3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilePeopleReportGenerator extends PersonReportGenerator {
    private final String sourceGenerate;

    public FilePeopleReportGenerator(String sourceGenerate) {
        this.sourceGenerate = sourceGenerate;
    }

    @Override
    protected List<Person> readPeople() {
        try {
            return Files.lines(Path.of(sourceGenerate))
                    .map(this::readPerson)
                    .collect(toList());

        } catch (IOException e) {
            System.err.println("Could not read from file " + sourceGenerate);
        }
        return List.of();
    }

    private Person readPerson(String line) {
        String[] personInfo = line.split(",");
        return new Person(
                personInfo[0],
                personInfo[1],
                Integer.parseInt(personInfo[2])
        );
    }
}
