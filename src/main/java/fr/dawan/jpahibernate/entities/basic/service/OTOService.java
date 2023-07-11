package fr.dawan.jpahibernate.entities.basic.service;

import fr.dawan.jpahibernate.entities.basic.dao.OTORepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.basic.models.relationships.OTO;
import org.springframework.stereotype.Service;

@Service
public class OTOService extends GenericService<OTO, String, OTORepository> {
    protected OTOService(OTORepository repository) {
        super(repository);
    }

}
