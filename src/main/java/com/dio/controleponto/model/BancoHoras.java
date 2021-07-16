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
public class BancoHoras {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public class BancoHorasId implements Serializable {
            private Long idBancoHoras;
            private Long idMovimento;
            private Long idUsuario;
        }

        @Id
        @EmbeddedId
        private BancoHorasId id;
        private LocalDateTime dataTrabalhada;
        private BigDecimal quantidadeHoras;
        private BigDecimal saldoHoras;

}
