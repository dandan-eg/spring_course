package fr.dawan.jpahibernate.entities.basic.repo;

import fr.dawan.jpahibernate.entities.basic.models.B_Foo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface B_FooRepository extends PagingAndSortingRepository<B_Foo, Long> {
}
