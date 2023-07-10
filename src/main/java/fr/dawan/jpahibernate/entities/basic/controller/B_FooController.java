package fr.dawan.jpahibernate.entities.basic.controller;

import fr.dawan.jpahibernate.entities.basic.models.B_Foo;
import fr.dawan.jpahibernate.entities.basic.service.B_FooService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foo")
public class B_FooController {

    private final B_FooService service;

    public B_FooController(B_FooService service) {
        this.service = service;
    }

    // @RequestMapping(name = "", method = RequestMethod.GET)
    @GetMapping
    public List<B_Foo> all() {
        return service.all();
    }

    @PostMapping
    public B_Foo saveOrUpdate(@RequestBody B_Foo foo) {
        return service.saveOrUpdate(foo);
    }

    @GetMapping("/{id}") // un segment d'URL mis entre accolades est considéré une variable d'URL
    public B_Foo byId(@PathVariable long id) { // PathVariable récupère la variable d'URL avec le nom correspondant
        return service.byId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        service.deleteById(id);
    }
}
