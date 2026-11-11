package ni.edu.uam.api_docentes.repository;

import ni.edu.uam.api_docentes.modelo.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DocenteRepository extends JpaRepository<Docente, Long> {


}
