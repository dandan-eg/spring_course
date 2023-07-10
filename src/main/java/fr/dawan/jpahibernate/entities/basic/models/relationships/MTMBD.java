package fr.dawan.jpahibernate.entities.basic.models.relationships;

import fr.dawan.jpahibernate.entities.basic.models.B_Foo;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class MTMBD {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "VARCHAR(50)")
    private String UUID;

    // mappedBy dans une relation bidirectionnelle indique que la relation est gérée par l'autre classe.
    // Il s'agit d'éviter la création d'un doublon (colonne ou d'une table d'association) reprenant l'information inverse
    @ManyToMany(mappedBy = "manyToManyBidirectional")
    private List<B_Foo> foo;

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
}
