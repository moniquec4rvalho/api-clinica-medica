package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank //campo obrigatorio
        String nome,
        @NotBlank @Email //formato e-mail
        String email,

        @NotBlank
        String telefone,

        @NotBlank @Pattern(regexp = "\\d{4,6}") // formatação do campo numerico
        String crm,
        @NotNull //somente paRA STRING não deixa o campo ser nulo
        Especialidade especialidade,

        @NotNull @Valid DadosEndereco endereco) {
}
