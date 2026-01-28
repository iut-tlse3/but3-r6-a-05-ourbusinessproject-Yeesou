package ourbusinessproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class Bootstrap {

    @Autowired
    private InitializationService initServices;


    public Bootstrap(InitializationService initServices){
        this.initServices = initServices;
    }

    @PostConstruct
    public void init() {
        try {
            initServices.initProjects();
        } catch (RuntimeException e) {
        }

    }

    public InitializationService getInitializationService() {
        return initServices;
    }
}
