package aplicacion.software.repository;

import aplicacion.software.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("select e from Employee e where e.nombre=:nombre")
    Employee buscaNombreEmployee(String nombre);

}
