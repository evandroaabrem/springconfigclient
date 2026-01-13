package com.example.build;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RefreshScope
@Component
@ConfigurationProperties(prefix = "cliente")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ClienteProperties {
    private String nome;
    private String descricao;
    private String versao;
    private Contato contato = new Contato();

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Contato {
        private String nome;
    }
}
