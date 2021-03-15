package ro.fasttrackit.tema2.exercice3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

abstract class PersonReportGenerator {
    public void generateReport(String outputFile) throws IOException {
        List<Person> people = readPeople();
        writeReport(people, outputFile);

    }

    private void writeReport(List<Person> people, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            people.stream()
                    .filter(person -> person.getAge() < 31)
                    .map(person -> person.getAge() + ":" + person.getFirstName() + " " + person.getLastName())
                    .forEach(line -> wriLine(writer, line));
        }

    }

    private void wriLine(BufferedWriter writer, String line) {
        try {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }

    protected abstract List<Person> readPeople();
}
