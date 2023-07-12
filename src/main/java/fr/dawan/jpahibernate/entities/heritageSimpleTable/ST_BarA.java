package fr.dawan.jpahibernate.entities.heritageSimpleTable;

import jakarta.persistence.Entity;

@Entity
public class ST_BarA extends ST_Foo {
	
	//id hérité de ST_Foo
	
	private boolean aBooleanB = false;

	public boolean isaBooleanB() {
		return aBooleanB;
	}

	public void setaBooleanB(boolean aBooleanB) {
		this.aBooleanB = aBooleanB;
	}
	
	
}
