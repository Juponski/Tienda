
package com.tienda.dao;

import com.tienda.domain.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long>{
 
@Query("SELECT * FROM cliente where cliente.apellidos like apellidos")  
public List<Cliente> findApellido(String apellidos);


   
}
