package com.dio.controleponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Movimentacao {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public class MovimentacaoId implements Serializable {
            private Long idMovimento;
            private Long idUsuario;
        }
        @Id
        @EmbeddedId
        private MovimentacaoId id;
        private LocalDateTime dataEntrada;
        private LocalDateTime dataSaida;
        private BigDecimal periodo;
        @OneToOne
        private Ocorrencia ocorrencia;
        @OneToOne
        private Calendario calendario;
}
