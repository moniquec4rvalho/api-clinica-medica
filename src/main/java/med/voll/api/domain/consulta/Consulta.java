package med.voll.api.domain.consulta;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.paciente.Paciente;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime dataAgendada;

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @OneToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;


    public Consulta(DadosMarcarConsulta dados) {
        this.dataAgendada = dados.dataAgendada();
    }

}
