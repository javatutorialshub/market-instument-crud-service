package com.javatutorialshub.market.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class QuoteDTO {
    private Long quoteId;
    private LocalDateTime quoteDate;
    private Double quotePrice;
}
