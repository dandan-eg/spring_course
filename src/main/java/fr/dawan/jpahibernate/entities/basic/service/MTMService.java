package fr.dawan.jpahibernate.entities.basic.service;

import fr.dawan.jpahibernate.entities.basic.dao.B_FooRepository;
import fr.dawan.jpahibernate.entities.basic.dao.MTMBDRepository;
import fr.dawan.jpahibernate.entities.basic.dao.MTMRepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.basic.models.B_Foo;
import fr.dawan.jpahibernate.entities.basic.models.relationships.MTM;
import fr.dawan.jpahibernate.entities.basic.models.relationships.MTMBD;
import org.springframework.stereotype.Service;

@Service
public class MTMService extends GenericService<MTM, String, MTMRepository> {
    protected MTMService(MTMRepository repository) {
        super(repository);
    }

}
