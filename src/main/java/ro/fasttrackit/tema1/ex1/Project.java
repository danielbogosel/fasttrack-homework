package ro.fasttrackit.tema1.ex1;

import java.time.Period;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Project {
    private final String name;
    private final int price;
    private final List<Category> categories;
    private final String description;

    public Project(String name, int price, List<Category> categories, String description) {
        this.name = name;
        this.price = price;
        this.categories = categories;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<Category> getCategories() {
        return Collections.unmodifiableList(categories);
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project product = (Project) o;
        return price == product.price && Objects.equals(name, product.name) && Objects.equals(categories, product.categories) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, categories, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                ", description='" + description + '\'' +
                '}';
    }

    static class ProjectBuilder {

        private String name;
        private String description;
        private int price;
        private List<Category> categories;

        public static ProjectBuilder project() {
            return new ProjectBuilder();
        }

        public ProjectBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProjectBuilder price(int price) {
            this.price = price;
            return this;
        }

        public ProjectBuilder categories(List<Category> categories) {
            this.categories = Collections.unmodifiableList(categories);
            return this;
        }

        public ProjectBuilder description(String description) {
            this.description = description;
            return this;
        }

        public Project build() {
            return new Project(name, price, categories, description);
        }

    }
}
