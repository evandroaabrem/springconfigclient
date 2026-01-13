package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.build.ClienteProperties;

@RestController
public class ClienteController {
    private final ClienteProperties clienteProperties;

    public ClienteController(ClienteProperties clienteProperties) {
        this.clienteProperties = clienteProperties;
    }

    @GetMapping("/cliente/info")
    public String info() {
        return clienteProperties.getNome();
    }
}

