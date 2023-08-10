package entities;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Endereco {
    @EqualsAndHashCode.Include

    private Long id;
    private Cep cep;
    private String numero ;
    private String complemento;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Endereco ");
        //sb.append("id=").append(id);
        sb.append("\n Cep: ").append(cep.getCep());
        sb.append("\n Rua: "+cep.getLogradouro()).append(", n° ").append(numero);
        if(!complemento.isEmpty())
            sb.append(", complemento: ").append(complemento);

        sb.append("\n Cidade: "+cep.getLocalidade()).append(", Estado: "+cep.getUf());

        return sb.toString();
    }

    public Endereco() {
    }

    public Endereco(Cep cep, String numero, String complemento) {
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }
    public Endereco(Cep cep, String numero) {
        this.cep = cep;
        this.numero = numero;
        this.complemento = "";
    }

    public Endereco(Long id, Cep cep, String numero, String complemento) {
        this.id = id;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }
}
