package ro.fasttrackit.tema2.exercice3;

import java.io.BufferedWriter;
import java.util.List;

public class FilePeopleReportGenerator extends PersonReportGenerator {
    private final String sourceGenerate;

    public FilePeopleReportGenerator(String sourceGenerate) {
        this.sourceGenerate = sourceGenerate;
    }

    @Override
    protected List<Person> readPeople() {
        BufferedWriter bufferedWriter = new BufferedWriter();
        return null;
    }
}
