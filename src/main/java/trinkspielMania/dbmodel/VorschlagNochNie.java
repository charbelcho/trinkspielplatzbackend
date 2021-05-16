package trinkspielMania.dbmodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VorschlagNochNie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String vorschlagNochNie;
	
	public VorschlagNochNie() {}

	public VorschlagNochNie(Long id, String vorschlagNochNie) {
		super();
		this.id = id;
		this.vorschlagNochNie = vorschlagNochNie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVorschlagNochNie() {
		return vorschlagNochNie;
	}

	public void setVorschlagNochNie(String vorschlagNochNie) {
		this.vorschlagNochNie = vorschlagNochNie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((vorschlagNochNie == null) ? 0 : vorschlagNochNie.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VorschlagNochNie other = (VorschlagNochNie) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (vorschlagNochNie == null) {
			if (other.vorschlagNochNie != null)
				return false;
		} else if (!vorschlagNochNie.equals(other.vorschlagNochNie))
			return false;
		return true;
	}
	
}
