package fr.dawan.jpahibernate.entities.basic.dao;

import fr.dawan.jpahibernate.entities.basic.models.relationships.MTMBD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MTMBDRepository extends JpaRepository<MTMBD, String> {
}
