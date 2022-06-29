package aplicacion.software.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name ="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre" ,nullable = false)
    private String nombre;
    @Column(name = "apellido" )
    private String apellido;
    private String correo;

}
