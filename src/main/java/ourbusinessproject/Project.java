package ourbusinessproject;

import jakarta.validation.constraints.NotEmpty;

public class Project {
    @NotEmpty
    private String title;

    private String description;

    public Project() {};

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
