package fr.dawan.jpahibernate.entities.basic.dao;

import fr.dawan.jpahibernate.entities.basic.models.B_Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface B_FooRepository extends JpaRepository<B_Foo,Long> {

}
