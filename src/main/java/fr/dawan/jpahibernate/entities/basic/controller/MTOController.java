package fr.dawan.jpahibernate.entities.basic.controller;

import fr.dawan.jpahibernate.entities.basic.dao.MTORepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.basic.models.relationships.MTO;
import fr.dawan.jpahibernate.entities.basic.service.MTOService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/MTO")
public class MTOController extends GenericController<MTO,String, MTORepository, MTOService> {

    public MTOController(MTOService service) {
        super(service);
    }
}
