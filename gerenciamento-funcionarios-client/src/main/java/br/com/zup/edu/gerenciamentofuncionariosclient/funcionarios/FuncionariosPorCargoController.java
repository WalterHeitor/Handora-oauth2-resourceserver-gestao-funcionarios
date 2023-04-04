package br.com.zup.edu.gerenciamentofuncionariosclient.funcionarios;

import br.com.zup.edu.gerenciamentofuncionariosclient.client.GestaoFuncionariosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FuncionariosPorCargoController {

    @Autowired
    private GestaoFuncionariosClient funcionariosClient;

    @GetMapping("api/funcionarios-por-cargo")
    public ResponseEntity<?>listaPorCargo(@RequestParam String cargo) {
        List<FuncionarioDeCargoResponse> funcionariosDoCargo = funcionariosClient.lista().stream()
                .filter(funcionarioResponse -> cargo.equalsIgnoreCase(funcionarioResponse.getCargo()))
                .map(FuncionarioDeCargoResponse::new).collect(Collectors.toList());

        return ResponseEntity.ok(funcionariosDoCargo);
    }
}
