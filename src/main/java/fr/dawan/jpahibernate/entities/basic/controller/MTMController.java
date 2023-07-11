package fr.dawan.jpahibernate.entities.basic.controller;

import fr.dawan.jpahibernate.entities.basic.dao.MTMRepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.basic.models.relationships.MTM;
import fr.dawan.jpahibernate.entities.basic.service.MTMService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/MTM")
public class MTMController extends GenericController<MTM,String, MTMRepository, MTMService> {

    public MTMController(MTMService service) {
        super(service);
    }
}
