package br.com.zup.edu.gerenciamentofuncionariosclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(
        name = "gestaoFuncionariosClient",
        url = "http://localhost:8080/oauth2-resourceserver-gestao-funcionarios")
public interface GestaoFuncionariosClient {

    @GetMapping("/api/funcionarios")
    public List<FuncionarioResponse> lista();
}
