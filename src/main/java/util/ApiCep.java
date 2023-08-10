package util;

import com.google.gson.Gson;
import entities.Cep;
import lombok.Getter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Getter
public class ApiCep {

    private String url_api; // viacep.com.br/ws/01001000/json/
    private Cep cep_preenchido;
    public ApiCep(String cep){
        //ex: https://viacep.com.br/ws/94920190/json/
        //valida se o cep veio no formato esperado - ex> 94.920-190
        if(cep.length() == 10 ){
            try {
                cep = (cep.replace(".","").replace("-",""));
                this.url_api = "https://viacep.com.br/ws/"+cep+"/json/";
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url_api)).build();
                HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
                if(response.statusCode()==200){
                    if(response.body().contains("erro")){
                     System.out.println("Cep não encontrado ou com erro!");
                    }else{
                       Gson gson = new Gson();
                       cep_preenchido = gson.fromJson(response.body(),Cep.class);
                    }
                }
            }catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + "\n" + e.getLocalizedMessage());
            }

        }else{
            System.out.println("Cep no formato incorreto ou inválido!");
        }
    }
}
