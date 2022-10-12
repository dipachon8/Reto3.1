package aplicacion.reto3.Repositorio.CRUD;


import aplicacion.reto3.Modelo.Nube;
import org.springframework.data.repository.CrudRepository;

//Interfaz encargada de recibir los datos de las entidades para realizar los servicios CRUD.
public interface NubeCRUDRepositorio extends CrudRepository<Nube,Integer>
{
}
