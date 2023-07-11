package fr.dawan.jpahibernate.entities.basic.controller;

import fr.dawan.jpahibernate.entities.basic.dao.OTORepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.basic.models.relationships.OTO;
import fr.dawan.jpahibernate.entities.basic.service.OTOService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/OTO")
public class OTOController extends GenericController<OTO,String, OTORepository, OTOService> {

    public OTOController(OTOService service) {
        super(service);
    }
}
