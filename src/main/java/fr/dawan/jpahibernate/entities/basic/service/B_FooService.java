package fr.dawan.jpahibernate.entities.basic.service;

import fr.dawan.jpahibernate.entities.basic.dao.B_FooRepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericService;
import fr.dawan.jpahibernate.entities.basic.models.B_Foo;
import fr.dawan.jpahibernate.entities.basic.models.relationships.OTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class B_FooService extends GenericService<B_Foo, Long, B_FooRepository> {
    protected B_FooService(B_FooRepository repository) {
        super(repository);
    }

    public B_Foo addOTO(long fooId, OTO oto ) {
        /*Optional<B_Foo> optionalBFoo = repository.findById(fooId);
        if(optionalBFoo.isPresent()) {
            B_Foo viaIsPresent = optionalBFoo.get();
        }

        optionalBFoo.ifPresent(bFoo -> {
            // ne sera exécuté QUE SI l'optionnel n'est pas vide (que l'objet a été trouvé)
            System.out.println("bFoo.getStr() = \u001B[31m" + bFoo.getStr() + "\u001B[0m");
            // Attention ifPresent ne retourne pas de valeur (Consumer)
        });
*/
        return repository.findById(fooId).map(bFoo -> {
            bFoo.setOneToOne(oto);
            return repository.save(bFoo);
        }).orElse(null);
    }
}
