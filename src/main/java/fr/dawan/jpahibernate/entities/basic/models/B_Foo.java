package fr.dawan.jpahibernate.entities.basic.models;

import fr.dawan.jpahibernate.entities.basic.models.relationships.*;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity // Initie le mapping relationnel en considérant cette classe comme une entité de BDD
@Table(name = "Basic_Foo") // @Table pour personnaliser les règles de création de la table
public class B_Foo {
    @Id // Clé primaire (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Utilise l'auto-increment pour gérer la clé primaire
    private long id;

    // L'implémentation Hibernate possède déjà des standards associés aux types
    // La précision du dialecte à utiliser dans l'application.properties lui permet de savoir quel standard utiliser selon le SGBD
    @Column(
          name = "string_value",
          nullable = false, // Refuse les valeurs nulles
          unique = true, // Interdit les doublons sur ce champ
          updatable = false, // Interdit la mise à jour de la valeur après sa création
          length = 50, // Limite la taille du champ
          columnDefinition = "TEXT" // Change le type associé à la colonne (TEXT est pratique pour les longues chaines de caractères)
    )
    private String str;

    @Column(
            name = "int_value",
            nullable = false,
            length = 6
    )
    private int anInt;

    @Column(columnDefinition = "DECIMAL(10,2)")
    private double price;

    // import java.math.BigDecimal;
    @Column(
            precision = 5, // digits avant scaling
            scale = 2 // unscaledValue x 10exp - scale
    )
    private BigDecimal percent; // 12345 -> 123.45

    @Column(
            columnDefinition = "BIT(1)" // default
    )
    private boolean aBoolean;

    @Temporal(TemporalType.DATE)
    private LocalDate date;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime moment;

    /* Ne fonctionne pas avec MariaDB
    @Temporal(TemporalType.TIME)
    private LocalDateTime time;*/

    // Default : EnumType.ORDINAL
    // La valeur stockée est la position de la valeur souhaitée dans l'enum
    @Enumerated(EnumType.STRING)
    private Enumeration enumeration;

    @Embedded // Les champs de la classe en dessous sont inclus dans la table de cette classe
    private B_Bar bar;


    // ***ToOne -> Par une colonne dans la classe : fais une référence à un enregistrement unique
    // C'est pour cela que ces annotations portent sur unique Objet
    @OneToOne
    private OTO oneToOne;
    @ManyToOne
    private MTO manyToOne;

    // ***ToMany -> Par une table d'association : possibilité de référencer plusieurs enregistrements
    // et portent donc toujours sur des Collections
    @OneToMany
    private Set<OTM> oneToMany;
    @ManyToMany
    private List<MTM> manyToMany;

    @ManyToMany
    private List<MTMBD> manyToManyBidirectional;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public Enumeration getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public B_Bar getBar() {
        return bar;
    }

    public void setBar(B_Bar bar) {
        this.bar = bar;
    }

    public OTO getOneToOne() {
        return oneToOne;
    }

    public void setOneToOne(OTO oneToOne) {
        this.oneToOne = oneToOne;
    }

    public MTO getManyToOne() {
        return manyToOne;
    }

    public void setManyToOne(MTO manyToOne) {
        this.manyToOne = manyToOne;
    }

    public Set<OTM> getOneToMany() {
        return oneToMany;
    }

    public void setOneToMany(Set<OTM> oneToMany) {
        this.oneToMany = oneToMany;
    }

    public List<MTM> getManyToMany() {
        return manyToMany;
    }

    public void setManyToMany(List<MTM> manyToMany) {
        this.manyToMany = manyToMany;
    }

    public List<MTMBD> getManyToManyBidirectional() {
        return manyToManyBidirectional;
    }

    public void setManyToManyBidirectional(List<MTMBD> manyToManyBidirectional) {
        this.manyToManyBidirectional = manyToManyBidirectional;
    }
}
