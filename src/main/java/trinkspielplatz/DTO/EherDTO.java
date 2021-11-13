package trinkspielplatz.DTO;

public class EherDTO {
	private Long id;
	private String eher;
	
	public EherDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEher() {
		return eher;
	}

	public void setEher(String eher) {
		this.eher = eher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eher == null) ? 0 : eher.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		EherDTO other = (EherDTO) obj;
		if (eher == null) {
			if (other.eher != null)
				return false;
		} else if (!eher.equals(other.eher))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
