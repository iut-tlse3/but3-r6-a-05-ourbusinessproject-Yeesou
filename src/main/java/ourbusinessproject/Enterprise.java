package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "enterprises")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(nullable = false)
    private String name;

    @Size(min = 10)
    @Column(length = 1000)
    private String description;

    @NotEmpty
    @Column(nullable = false)
    private String contactName;

    @NotEmpty
    @Email
    @Column(nullable = false)
    private String contactEmail;

    @OneToMany
    @JoinColumn(name = "projects_id")
    private List<Project> projects;

    public List<Project> getProjects() {
        return projects;
    }

    public Enterprise() {}

    public Enterprise(String name, String description,  String contactName, String contactEmail) {
        this.name = name;
        this.description = description;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
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
