package fr.dawan.jpahibernate.entities.basic.models.relationships;

import jakarta.persistence.Embeddable;

@Embeddable // Indique que les champs de cette classe peuvent être inclus dans une autre
public class B_Bar {
    private String barName;
    private String barMan;

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }

    public String getBarMan() {
        return barMan;
    }

    public void setBarMan(String barMan) {
        this.barMan = barMan;
    }
}
