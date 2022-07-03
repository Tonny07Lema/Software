package aplicacion.software;

import aplicacion.software.entity.Employee;
import aplicacion.software.entity.Nota;
import aplicacion.software.repository.EmployeeRepository;
import aplicacion.software.repository.NotaReoisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoftwareApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private NotaReoisitory notaReoisitory;
	@Override
	public void run(String... args) throws Exception {


		Employee employee1 = Employee.builder()
				.nombre("Tonny")
				.apellido("Lema")
				.correo("tonnylema@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.nombre("Patricio")
				.apellido("Lema")
				.correo("patricio123@gmail.com")
				.build();

		Employee employee3 = Employee.builder()
				.nombre("Juan")
				.apellido("Perez")
				.correo("juan123@gmail.com")
				.build();

		Employee employee4 = Employee.builder()
				.nombre("Ana")
				.apellido("Juana")
				.correo("maria@gmail.com")
				.build();

		Employee employee5 = Employee.builder()
				.nombre("Luis ")
				.apellido("Cabrera")
				.correo("luis@gmail.com")
				.build();
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);
		employeeRepository.save(employee5);

		Employee employee = findId(employee1.getNombre());

		Nota nota1 = Nota.builder()
				.matematica(7.25)
				.biologia(8.25)
				.fisica(9.25)
				.employee(employee)
				.build();

		notaReoisitory.save(nota1);
	}
	public Employee findId(String nombre){
		return employeeRepository.buscaNombreEmployee(nombre);
	}
}
