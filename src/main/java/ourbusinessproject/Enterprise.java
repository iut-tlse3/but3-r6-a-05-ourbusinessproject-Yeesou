package ourbusinessproject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Enterprise {
    @NotEmpty
    private String name;

    @Size(min = 10)
    private String description;

    @NotEmpty
    private String contactName;

    @NotEmpty
    @Email
    private String contactEmail;

    public Enterprise() {}

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
}
