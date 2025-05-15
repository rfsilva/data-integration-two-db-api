package br.com.rodrigo.dataintegration.twodb.controller;

import br.com.rodrigo.dataintegration.twodb.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class OperationController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping("/{id}")
    public ResponseEntity<String> getDataIntegration(@PathVariable("id") String productOperationId) {
        return Optional.ofNullable(consultaService.executar(productOperationId))
                .map(op -> ResponseEntity.ok().body(op))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}