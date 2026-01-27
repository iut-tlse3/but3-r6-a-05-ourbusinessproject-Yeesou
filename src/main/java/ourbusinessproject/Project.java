package ourbusinessproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String title;

    private String description;

    @NotNull
    @ManyToOne
    private Enterprise enterprise;

    public Project() {}

    public Project(String title, String description, Enterprise enterprise) {
        this.title = title;
        this.description = title;
        this.enterprise = enterprise;
        if (enterprise != null) {
            enterprise.addProject(this);
        }
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



    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

}
