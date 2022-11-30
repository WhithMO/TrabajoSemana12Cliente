package pe.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.idat.modelo.Cliente;
import pe.idat.servicio.ClienteService;

@Controller
@RequestMapping("/api/cliente/v1")
public class ClienteController {

	
    @Autowired
    private ClienteService service;
    
    @PostMapping("/guardar")
    public @ResponseBody void guardar(@RequestBody Cliente cliente){
        service.guardarCliente(cliente);
    }
    
    @GetMapping("/asignar")
    public @ResponseBody void asignar(){
        service.asignarHospitalCliente();
    }
}
