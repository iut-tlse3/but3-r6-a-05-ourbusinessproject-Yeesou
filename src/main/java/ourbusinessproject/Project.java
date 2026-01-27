package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(nullable = false)
    private String title;

    private String description;

    public Project() {}

    public Project(String title, String description) {
        this.title = title;
        this.description = title;
    }

    /**
     * Set the title
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set the description
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    /**
     * get the title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * get the description
     * @return description
     */
    public String getDescription() {
        return description;
    }
}
