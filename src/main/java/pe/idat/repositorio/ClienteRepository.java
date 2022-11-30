package pe.idat.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
