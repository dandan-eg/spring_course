package fr.dawan.jpahibernate.entities.basic.service;

import fr.dawan.jpahibernate.entities.basic.dao.MTORepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.basic.models.relationships.MTO;
import org.springframework.stereotype.Service;

@Service
public class MTOService extends GenericService<MTO, String, MTORepository> {
    protected MTOService(MTORepository repository) {
        super(repository);
    }

}
