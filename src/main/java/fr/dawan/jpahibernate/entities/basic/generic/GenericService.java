package fr.dawan.jpahibernate.entities.basic.generic;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class GenericService<Entity, ID, Repository extends JpaRepository<Entity, ID>> {
    protected final Repository repository;

    protected GenericService(Repository repository) {
        this.repository = repository;
    }



    public List<Entity> all() {
        return repository.findAll();
    }

    public Entity saveOrUpdate(Entity foo) {
        // Comment JPA sait s'il doit créer (INSERT INTO) ou mettre à jour (UPDATE ... SET) ?
        // En utilisant la clé primaire (ID). Si elle est différente de la valeur par défaut alors c'est un update
        return repository.save(foo);
    }

    public Entity byId(ID id) {
        return repository.findById(id) // Par défaut findById retourne un optionnel contenant ou non l'objet trouvé
                .orElse(null); // orElse permet de définir une valeur à retourner dans le cas où l'optionnel serait vide.
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
        // repository.delete(entity); pour supprimer un objet déjà récupéré
    }
}
