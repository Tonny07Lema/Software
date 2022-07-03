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

		Employee e1 = findId(employee1.getNombre());
		Employee e2 = findId(employee2.getNombre());
		Employee e3 = findId(employee3.getNombre());
		Employee e4 = findId(employee4.getNombre());
		Employee e5 = findId(employee5.getNombre());

		Nota nota1 = Nota.builder()
				.matematica(7.25)
				.biologia(8.25)
				.fisica(9.25)
				.employee(e1)
				.build();

		Nota nota2 = Nota.builder()
				.matematica(9.35)
				.biologia(5.25)
				.fisica(3.25)
				.employee(e2)
				.build();

		Nota nota3 = Nota.builder()
				.matematica(7.01)
				.biologia(9.25)
				.fisica(5.25)
				.employee(e3)
				.build();

		Nota nota4 = Nota.builder()
				.matematica(5.25)
				.biologia(2.25)
				.fisica(1.25)
				.employee(e4)
				.build();

		Nota nota5 = Nota.builder()
				.matematica(10)
				.biologia(10)
				.fisica(10)
				.employee(e5)
				.build();

		notaReoisitory.save(nota1);
		notaReoisitory.save(nota2);
		notaReoisitory.save(nota3);
		notaReoisitory.save(nota4);
		notaReoisitory.save(nota5);
	}
	public Employee findId(String nombre){
		return employeeRepository.buscaNombreEmployee(nombre);
	}
}
