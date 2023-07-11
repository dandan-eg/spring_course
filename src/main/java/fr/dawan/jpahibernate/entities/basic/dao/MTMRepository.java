package fr.dawan.jpahibernate.entities.basic.dao;

import fr.dawan.jpahibernate.entities.basic.models.relationships.MTM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MTMRepository extends JpaRepository<MTM, String> {
}
