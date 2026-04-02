package com.fraud.transaction_service.business.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class TransactionDTO {

    @NotNull
    private Long userId;
    @NotNull
    private BigDecimal amount;
    private String deviceId;
    private String location;
    private LocalDateTime cratedAt;

}


