package ourbusinessproject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityResult;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseProjectService {

    @PersistenceContext
    private EntityManager entityManager;

    public EnterpriseProjectService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public Project newProject(String projectName, String description, Enterprise enterprise) {
        Project newProject = new Project(projectName, description, enterprise);
        entityManager.persist(newProject);
        entityManager.flush();
        return newProject;
    }

    public Enterprise newEnterprise(String enterpriseName, String description, String contactName, String contactEmail){
        Enterprise newEnterprise = new Enterprise(enterpriseName, description,  contactName, contactEmail);
        entityManager.persist(newEnterprise);
        entityManager.flush();
        return newEnterprise;
    }

    public Project findProjectById(Long projectId){
        return entityManager.find(Project.class, projectId);
    }

    public Enterprise findEnterpriseById(Long enterpriseId){
        return entityManager.find(Enterprise.class, enterpriseId);
    }

}
