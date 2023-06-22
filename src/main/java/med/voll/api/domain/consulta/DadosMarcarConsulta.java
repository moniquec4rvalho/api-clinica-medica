package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosMarcarConsulta(
        @NotNull LocalDateTime dataAgendada,
        @NotBlank String nomePaciente,
        @NotBlank String nomeMedico) {

}
