package fr.dawan.jpahibernate.entities.basic.service;

import fr.dawan.jpahibernate.entities.basic.dao.B_FooRepository;
import fr.dawan.jpahibernate.entities.basic.models.B_Foo;
import fr.dawan.jpahibernate.entities.basic.models.relationships.OTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class B_FooService {
    private final B_FooRepository repository;

    public B_FooService(B_FooRepository repository) {
        this.repository = repository;
    }

    public List<B_Foo> all() {
        return repository.findAll();
    }

    public B_Foo saveOrUpdate(B_Foo foo) {
        // Comment JPA sait s'il doit créer (INSERT INTO) ou mettre à jour (UPDATE ... SET) ?
        // En utilisant la clé primaire (ID). Si elle est différente de la valeur par défaut alors c'est un update
        return repository.save(foo);
    }

    public B_Foo byId(long id) {
        return repository.findById(id) // Par défaut findById retourne un optionnel contenant ou non l'objet trouvé
                .orElse(null); // orElse permet de définir une valeur à retourner dans le cas où l'optionnel serait vide.
    }

    public void deleteById(long id) {
        repository.deleteById(id);
        // repository.delete(entity); pour supprimer un objet déjà récupéré
    }

    public B_Foo addOTO(long fooId, OTO oto ) {
        // Récupérer le bon B_Foo
        // Ajouter l'objet
        // Sauver la modification
        return null;
    }
}
