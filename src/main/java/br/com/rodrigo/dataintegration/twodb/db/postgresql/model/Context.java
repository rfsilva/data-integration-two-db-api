package br.com.rodrigo.dataintegration.twodb.db.postgresql.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.*;
import java.time.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "tb_context")
public class Context implements Serializable {

    private static final long serialVersionUID = 239052353L;

    @Id
    @Column(name = "context_id", nullable = false, unique = true)
    private Long internalId;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "inst_code")
    private Long institution;

    @Column(name = "branch_code")
    private Long branch;

    @Column(name = "type")
    private Integer type;

    @Column(name = "sequential")
    private Long sequential;

    @Column(name = "status")
    private Integer status;
}

