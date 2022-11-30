package pe.idat.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.modelo.ClienteDetalle;

@Repository
public interface DetalleClienteRepository extends JpaRepository<ClienteDetalle, Integer>{

}
