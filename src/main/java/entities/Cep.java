package entities;


import lombok.Getter;
import lombok.Setter;


public class Cep {
    @Getter
    @Setter

    private String cep, logradouro,  bairro, localidade, uf ;

    public Cep() {
        this.cep = "00000000";
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    public Cep(String cep, String logradouro,  String bairro, String localidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    private  void removeTracos(){
        this.setCep(this.getCep().replaceAll(".",""));
        this.setCep(this.getCep().replaceAll("-",""));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n");
        sb.append(" cep: ").append(cep).append("\n");
        sb.append(" logradouro: ").append(logradouro).append("\n");
        sb.append(" bairro: ").append(bairro).append("\n");
        sb.append(" localidade: ").append(localidade).append("\n");
        sb.append(" uf:").append(uf).append("\n");

        return sb.toString();
    }
}
