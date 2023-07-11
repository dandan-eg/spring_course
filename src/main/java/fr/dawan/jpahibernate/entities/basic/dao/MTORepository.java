package fr.dawan.jpahibernate.entities.basic.dao;

import fr.dawan.jpahibernate.entities.basic.models.relationships.MTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MTORepository extends JpaRepository<MTO, String> {
}
