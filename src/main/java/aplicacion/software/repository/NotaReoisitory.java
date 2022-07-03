package aplicacion.software.repository;

import aplicacion.software.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaReoisitory extends JpaRepository<Nota, Long> {

}
