package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(Long id, LocalDateTime dataAgendada, String medico, String Paciente) {
    public DadosDetalhamentoConsulta (Consulta consulta){
        this(consulta.getId(), consulta.getDataAgendada(), consulta.getMedico().getNome(), consulta.getPaciente().getNome());
    }
}
