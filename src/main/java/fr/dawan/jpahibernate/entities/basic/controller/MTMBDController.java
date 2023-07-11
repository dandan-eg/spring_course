package fr.dawan.jpahibernate.entities.basic.controller;

import fr.dawan.jpahibernate.entities.basic.dao.MTMBDRepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.basic.models.relationships.MTMBD;
import fr.dawan.jpahibernate.entities.basic.service.MTMBDService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/MTMBD")
public class MTMBDController extends GenericController<MTMBD,String, MTMBDRepository, MTMBDService> {

    public MTMBDController(MTMBDService service) {
        super(service);
    }
}
