package fr.dawan.jpahibernate.entities.basic.controller;

import fr.dawan.jpahibernate.entities.basic.dao.OTMRepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.basic.models.relationships.OTM;
import fr.dawan.jpahibernate.entities.basic.service.OTMService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/OTM")
public class OTMController extends GenericController<OTM,String, OTMRepository, OTMService> {

    public OTMController(OTMService service) {
        super(service);
    }
}
