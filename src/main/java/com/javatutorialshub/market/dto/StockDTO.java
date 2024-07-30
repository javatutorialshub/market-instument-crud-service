package com.javatutorialshub.market.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class StockDTO {
    private Long stockId;
    private String isin;
    private String stockName;
    private String description;
    private List<QuoteDTO> quotes;
}
