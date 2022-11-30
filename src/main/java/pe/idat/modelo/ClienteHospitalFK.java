package pe.idat.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable 
public class ClienteHospitalFK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6154611325326894843L;

	
	@Column(name = "id_cliente", nullable = false)
	private Integer idCliente;
	
	@Column(name = "id_hospital", nullable = false)
	private Integer idHospital;

	
	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
