package ro.fasttrackit.tema1.ex1;

import java.util.List;

import static ro.fasttrackit.tema1.ex1.Project.ProjectBuilder.project;

public class Main {
    public static void main(String[] args) {
        buildProject();
    }

    private static void buildProject() {
        Project project = project()
                .name("Iphone")
                .categories(List.of(Category.ELECTRONICS))
                .price(400)
                .description("Is good")
                .build();
        System.out.println(project);

    }
}
