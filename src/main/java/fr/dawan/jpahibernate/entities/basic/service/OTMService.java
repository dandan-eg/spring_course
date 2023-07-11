package fr.dawan.jpahibernate.entities.basic.service;

import fr.dawan.jpahibernate.entities.basic.dao.OTMRepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.basic.models.relationships.OTM;
import org.springframework.stereotype.Service;

@Service
public class OTMService extends GenericService<OTM, String, OTMRepository> {
    protected OTMService(OTMRepository repository) {
        super(repository);
    }

}
