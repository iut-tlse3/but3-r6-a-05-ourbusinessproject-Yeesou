package ourbusinessproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private EnterpriseProjectService EPS;

    public ProjectController(EnterpriseProjectService EPS) {
        this.EPS = EPS;
    }

    @GetMapping
    public List<Project> findAllProjectsWithEnterprises() {
        return EPS.findAllProjects();
    }
}
