package trinkspielplatz.dbmodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NochNie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nochNie;
	
	
	public NochNie() {}

	public NochNie(String nochNie) {
		this.nochNie = nochNie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNochNie() {
		return nochNie;
	}

	public void setNochNie(String nochNie) {
		this.nochNie = nochNie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nochNie == null) ? 0 : nochNie.hashCode());
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
		NochNie other = (NochNie) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nochNie == null) {
			if (other.nochNie != null)
				return false;
		} else if (!nochNie.equals(other.nochNie))
			return false;
		return true;
	}
	
}
