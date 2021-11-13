package trinkspielplatz.DTO;

public class VorschlagEherDTO {
	private Long id;
	private String vorschlagEher;
	
	public VorschlagEherDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVorschlagEher() {
		return vorschlagEher;
	}

	public void setVorschlagEher(String vorschlagEher) {
		this.vorschlagEher = vorschlagEher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((vorschlagEher == null) ? 0 : vorschlagEher.hashCode());
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
		VorschlagEherDTO other = (VorschlagEherDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (vorschlagEher == null) {
			if (other.vorschlagEher != null)
				return false;
		} else if (!vorschlagEher.equals(other.vorschlagEher))
			return false;
		return true;
	}
	
	
	
}
