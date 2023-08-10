package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
public class Paciente {
    private Long id;
    private String nomeCompleto;
    private String email;
    private String cpf;
    private Instant dataCadastro;
    private Endereco enderecoCompleto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return     Objects.equals(id, paciente.id)
                && Objects.equals(nomeCompleto, paciente.nomeCompleto)
                && Objects.equals(email, paciente.email)
                && Objects.equals(cpf, paciente.cpf)
                && Objects.equals(dataCadastro, paciente.dataCadastro)
                && Objects.equals(enderecoCompleto, paciente.enderecoCompleto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeCompleto, email, cpf, dataCadastro, enderecoCompleto);
    }

    public Paciente(String nomeCompleto, String email, String cpf, Endereco enderecoCompleto) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.cpf = cpf;
        this.dataCadastro = Instant.now();
        this.enderecoCompleto = enderecoCompleto;
    }
    public Paciente(Long id,String nomeCompleto, String email, String cpf, Instant dataCadastro, Endereco enderecoCompleto) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
        this.enderecoCompleto = enderecoCompleto;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paciente{");
        sb.append("id=").append(id);
        sb.append(", nomeCompleto='").append(nomeCompleto).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", cpf='").append(cpf).append('\'');
        sb.append(", dataCadastro=").append(dataCadastro);
        sb.append(", enderecoCompleto=").append(enderecoCompleto);
        sb.append('}');
        return sb.toString();
    }
}
