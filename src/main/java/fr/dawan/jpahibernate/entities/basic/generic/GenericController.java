package fr.dawan.jpahibernate.entities.basic.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class GenericController<Entity, ID, Repository extends JpaRepository<Entity, ID>, Service extends GenericService<Entity,ID,Repository>>{

    protected final Service service;

    public GenericController(Service service) {
        this.service = service;
    }

    // @RequestMapping(name = "", method = RequestMethod.GET)
    @GetMapping
    public List<Entity> all() {
        return service.all();
    }

    @PostMapping
    public Entity saveOrUpdate(@RequestBody Entity foo) {
        return service.saveOrUpdate(foo);
    }

    @GetMapping("/{id}") // un segment d'URL mis entre accolades est considéré une variable d'URL
    public Entity byId(@PathVariable ID id) { // PathVariable récupère la variable d'URL avec le nom correspondant
        return service.byId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ID id) {
        service.deleteById(id);
    }
}
