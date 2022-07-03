package aplicacion.software.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name ="notas")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "matematica" ,nullable = false)
    private double matematica;
    @Column(name = "biologia" )
    private double biologia;
    private double fisica;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private  Employee employee;
}
