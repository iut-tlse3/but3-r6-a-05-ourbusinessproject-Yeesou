package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "enterprises")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String name;

    @Size(min = 10)
    private String description;

    @NotEmpty
    private String contactName;

    @NotEmpty
    @Email
    private String contactEmail;

    @OneToMany
    private List<Project> projects;

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public Enterprise() {}

    public Enterprise(String name, String description,  String contactName, String contactEmail) {
        this.name = name;
        this.description = description;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.projects = new ArrayList<>();
    }

    /**
     * set the name
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set the description
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * set the contact name
     * @param contactName the contact name
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * set the contact email
     * @param contactEmail the contact email
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * get the name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * get the description
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * get the contact name
     * @return the contact name
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * get the contact email
     * @return the contact email
     */
    public String getContactEmail() {
        return contactEmail;
    }

    public Long getId() {return id;}
}
