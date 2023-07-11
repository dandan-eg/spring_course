package fr.dawan.jpahibernate.entities.basic.controller;

import fr.dawan.jpahibernate.entities.basic.dao.B_FooRepository;
import fr.dawan.jpahibernate.entities.basic.generic.GenericController;
import fr.dawan.jpahibernate.entities.basic.models.B_Foo;
import fr.dawan.jpahibernate.entities.basic.models.relationships.OTO;
import fr.dawan.jpahibernate.entities.basic.service.B_FooService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foo")
public class B_FooController extends GenericController<B_Foo,Long, B_FooRepository, B_FooService> {

    public B_FooController(B_FooService service) {
        super(service);
    }

    @PostMapping("/addOTO/{id}")
    public B_Foo addOTO(@PathVariable long id , @RequestBody OTO oto) {
        return service.addOTO(id,oto);
    }
}
