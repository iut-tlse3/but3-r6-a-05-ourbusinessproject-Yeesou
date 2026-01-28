package ourbusinessproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class InitializationService {

    @Autowired
    private EnterpriseProjectService enterpriseProjectService;

    private Project project1E1;
    private Project project1E2;
    private Project project2E1;

    private Enterprise enterprise1;
    private Enterprise enterprise2;

    @Transactional // si il y a une seul erreur dans la transaction tous les changements sont rollback. donc changer un titre en null et aucune entreprise et aucun projet n'est créer
    public void initProjects(){
        this.enterprise1 = enterpriseProjectService.newEnterprise("ent1", "pas de descriptions",
                "ent1contact", "ent1@mail.com");
        this.enterprise2 = enterpriseProjectService.newEnterprise("ent2", "pas de descriptions",
                "ent2contact", "ent2@mail.com");

        this.project1E1 = enterpriseProjectService.newProject("project1E1", "pas de descriptions", this.enterprise1);
        this.project1E2 = enterpriseProjectService.newProject("project1E2", "pas de descriptions", this.enterprise2);
        this.project2E1 = enterpriseProjectService.newProject("project2E1", "pas de descriptions", this.enterprise1);
    }

    public Enterprise getEnterprise1() {
        return this.enterprise1;
    }

    public Enterprise getEnterprise2() {
        return this.enterprise2;
    }

    public Project getProject1E1() {
        return this.project1E1;
    }

    public Project getProject1E2() {
        return this.project1E2;
    }

    public Project getProject2E1() {
        return this.project2E1;
    }
}
