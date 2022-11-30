package pe.idat.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.client.OpenFeignClient;
import pe.idat.dto.HospitalDTO;
import pe.idat.modelo.Cliente;
import pe.idat.modelo.ClienteDetalle;
import pe.idat.modelo.ClienteHospitalFK;
import pe.idat.repositorio.ClienteRepository;
import pe.idat.repositorio.DetalleClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private DetalleClienteRepository detalleRepo;
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	@Autowired
	private OpenFeignClient client;
	
	
	@Override
	public void guardarCliente(Cliente cliente) {
		clienteRepo.save(cliente);

	}

	@Override
	public void asignarHospitalCliente() {
		List<HospitalDTO> listado = client.listarHospital();
        ClienteHospitalFK fk = null;
        ClienteDetalle detalle = null;
        for (HospitalDTO hospitalDTO : listado) {
            fk = new ClienteHospitalFK();
            fk.setIdHospital(hospitalDTO.getId());
            fk.setIdCliente(1);

            detalle = new ClienteDetalle();
            detalle.setFk(fk);
            detalleRepo.save(detalle);
        }

	}

}
