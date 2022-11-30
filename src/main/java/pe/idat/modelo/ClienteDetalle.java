package pe.idat.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_cliente")
public class ClienteDetalle {

	@Id
	private ClienteHospitalFK fk = new ClienteHospitalFK();

	public ClienteHospitalFK getFk() {
		return fk;
	}

	public void setFk(ClienteHospitalFK fk) {
		this.fk = fk;
	}
	
	
	
}
