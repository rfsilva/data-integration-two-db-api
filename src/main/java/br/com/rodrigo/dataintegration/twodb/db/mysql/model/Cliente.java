package br.com.rodrigo.dataintegration.twodb.db.mysql.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {

    @Serial
    private static final long serialVersionUid = 9393053903L;

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "email")
    private String email;
}
