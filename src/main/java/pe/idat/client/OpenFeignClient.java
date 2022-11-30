package pe.idat.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import pe.idat.dto.HospitalDTO;

@FeignClient(name = "alumno-microservicio", url= "localhost:8085")
public interface OpenFeignClient {

	   @GetMapping("/api/hospital/v1/listar")
	    public List<HospitalDTO> listarHospital();
}
